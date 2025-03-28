package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		String[] donneesEtals = new String[100];
		if (!controlLibererEtal.isVendeur(nomVendeur)) {
			System.out.println("Mais vous n'�tes pas inscrit sur notre march� aujourd'hui\n");
		} else {
			donneesEtals = controlLibererEtal.libererEtal(nomVendeur);
			if (Boolean.parseBoolean(donneesEtals[0])) {
				System.out.println("Vous avez vendu " + donneesEtals[4] + " sur " + donneesEtals[3] + " " + donneesEtals[2] +".\n");
				System.out.println("Au revoir " + nomVendeur + " passez une bonne journée.\n");
			}
		} 
	}

}
