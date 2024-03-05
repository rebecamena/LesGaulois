package personnages;
import java.util.Random;
import personnages.Gaulois;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		//this.forcePotion = forcePotion;
		parler("Bonjour je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax);
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}
	
	public void preparerPotion() {
		Random random = new Random();
		this.forcePotion  = random.nextInt(effetPotionMin,effetPotionMax);
		if (forcePotion > 7) {
			prendreParole();
			parler("J'ai préparé une super potion de force " + forcePotion );	
		}else {
			prendreParole();
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);	
			
		}
	}

	public String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obélix")) {
			prendreParole();
			parler("Non, Obélix !... Tu n’auras pas de potion magique ! ");
		}else {
	        gaulois.boirePotion(forcePotion);
			
		}
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix",10);
		panoramix.booster(obelix);
		
	}




}

