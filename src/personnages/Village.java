package personnages;

import personnages.*;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois ) {
		
		if(villageois.length > nbVillageois) {
			villageois[nbVillageois]= gaulois;
			nbVillageois++;
		}		
	}		
	public Gaulois trouverHabitant(int numeroVillageois) {
		
		return villageois[numeroVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom()+ " vivent les légendaires gaulois : \n ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom() + "\n");
		}
	} 
	
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois1 = village.trouverHabitant(30);
		
		/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
		at personnages.Village.trouverHabitant(Village.java:34)
		at personnages.Village.main(Village.java:38)
		Car le tableau va de 0 à 29 donc on ne peut pas accèder à la place 30 */
		Chef abraracourcix =  new Chef("Abraracourix",6, village) ;
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.setChef(abraracourcix);
		
		village.ajouterHabitant(asterix);
		/*Gaulois gaulois = village.trouverHabitant(1); 
		System.out.println(gaulois);
		 output : null */
		/*Gaulois gaulois = village.trouverHabitant(0); 
		System.out.println(gaulois);*/
		// output : Gaulois [nom=Astérix, force=8, effetPotion=1]
		// car on récup à travers un pointeur
		
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	}
}
