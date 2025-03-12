package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		Gaulois gaulois = village.trouverHabitant(nomVendeur);
		String nomGaulois = gaulois.getNom();
		return nomGaulois != null && nomGaulois.equals(nomVendeur);
	}
}
