package personnages;

public class Romain {
	private String nom;
	private int force;
	
	
	
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
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne ...");
		}
		
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",-6);
		System.out.println(minus.getNom() + " " +minus.getForce());
	}
	

}
