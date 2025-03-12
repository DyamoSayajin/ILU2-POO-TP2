package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		StringBuilder question = new StringBuilder();
		int numeroEtal =-1;
		if (!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Je suis désolé " + nomVendeur + " mais il faut être un habitant de notre village pour commercer ici.\n");
		} else {
			System.out.println("Bonjour " + nomVendeur + ", je vais regarder si je peux trouver un étal.\n");
			if (!controlPrendreEtal.resteEtals()) {
				System.out.println("Désolée " + nomVendeur + " je n'ai plus d'étals qui ne soit pas déjà occupé.\n");
			} else {
				System.out.println("C'est parfait, il me reste un étal pour vous !\n");
				System.out.println("Il me faudrait quelques renseignements\n");
				question.append("Quel produit souhaitez vous vendre ?\n");
				String produit = Clavier.entrerChaine(question.toString());
				question.append("Combien souhaitez vous en vendre ?\n");
				int nbProduit = Clavier.entrerEntier(question.toString());
				numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
			}
		}
		if (numeroEtal != -1) {
			System.out.println("Le vendeur " + nomVendeur + "s'est installé à l'étal numéro" + numeroEtal + "\n");
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
