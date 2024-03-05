package personnages;

import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipements = 0;
	
	
	
	private boolean forcePositive() {
		boolean positif = true; 
		if ( force < 0) {
			positif = false;
		}
		return positif;
			
			
	}
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		
		this.force = force;
		assert forcePositive();
		
		
	}
	
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "<<" + texte + ">>");
	
	}

	public String prendreParole() {
		return "Le Romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		int test = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne ...");
		}
		assert force < test ; 
		
	}
	
	
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipements) {
		case 0: 
			ajouterEquipement(equipement);
			break;
		case 1:
			if (equipements[0]== equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un "+ equipement + " !");
			}else {
				ajouterEquipement(equipement);
			}
			break;
		case 2 : 
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		}	
	}
	
	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipements] = equipement;
		nbEquipements++;
		System.out.println("Le soldat "+ nom + " s'est équipé avec un " + equipement + ".");
	}
	
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus.getNom() + " " +minus.getForce());
		minus.recevoirCoup(4);
		System.out.println(minus.getNom() + " " +minus.getForce());
		
		Equipement equipement1 = Equipement.CASQUE;
		Equipement equipement2 = Equipement.BOUCLIER;
		System.out.println("Les equipements dispo sont : " +
				equipement1 + " et " + equipement2);
		
		
		minus.sEquiper(equipement1);
		minus.sEquiper(equipement2);
	}


	

}
