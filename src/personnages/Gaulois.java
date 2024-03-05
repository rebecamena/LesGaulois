package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	/*public String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}*/
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

	/*public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)* effetPotion);
	}*/ 
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesRomain = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; tropheesRomain != null && i < tropheesRomain.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesRomain[i];
		} 
	}
	

	
	public String toString() {
		
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée !");
		
		
	}
	
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8 );
		System.out.println("Le gaulois " + asterix.getNom() + " vient d'être créé.");
		asterix.prendreParole();
		asterix.parler("Bonjour");
		Romain romain = new Romain("Romain 1",5);
		asterix.boirePotion(4);
		asterix.frapper(romain);
		System.out.println(romain.getForce());
	}
}
