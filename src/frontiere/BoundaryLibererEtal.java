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
			if (donneesEtals[0] =) {
				
			}
		} 
	}

}
