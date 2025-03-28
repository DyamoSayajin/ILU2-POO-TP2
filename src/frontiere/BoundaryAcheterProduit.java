package frontiere;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		if (!controlAcheterProduit.isHabitant(nomAcheteur)) {
			System.out.println("Je suis désolé " + nomAcheteur + " mais il faut être un habitant du village pour commercer.\n");
		}
		else {
			StringBuilder question = new StringBuilder();
			String produit;
			question.append("Quel produit voulez-vous acheter ?\n");
			produit = Clavier.entrerChaine(question.toString());
			question.append("Chez quel commerçant voulez-vous acheter des " + produit +".\n");
			
		}
	}
}
