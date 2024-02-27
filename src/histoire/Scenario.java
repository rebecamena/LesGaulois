package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide; 


public class Scenario {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8 );
		Gaulois obelix = new Gaulois("Obélix",25);
		Druide paronamix = new Druide("Panoramix",5,10,1);
		
		paronamix.prendreParole();
		paronamix.parler("Je vais aller préparer une petite potion...");
		paronamix.preparerPotion();
		paronamix.booster(obelix);
		obelix.prendreParole();
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.prendreParole();
		paronamix.booster(asterix);
		asterix.parler("Bonjour à tous");
		Romain minus = new Romain("Minus",6);
		minus.prendreParole();
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		
	}

}
