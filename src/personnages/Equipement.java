package personnages;

public enum Equipement {
	CASQUE("casque"),
	BOUCLIER("bouclier") ; 
	
	private String nom;
	
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
	
	
	public void afficherEquipement() {
	
	System.out.println("L'équipement disponible est : ");
	for (Equipement equipement : Equipement.values()) {
		System.out.println("- " + equipement);
	}
	}

	
	
}
