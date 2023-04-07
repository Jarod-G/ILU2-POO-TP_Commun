package model;

public class FormulaireRestaurant extends Formulaire{
	private int jour;
	private int mois;
	private int numService;
	private int nbPersonne;
	private int numTable;
	
	public FormulaireRestaurant(int jour,int mois,int nbPersonne, int numService) {
		super(jour, mois);
		this.jour = jour;
		this.mois = mois;
		this.numService = numService;
		this.nbPersonne = nbPersonne;
	}
	
	public String toString() {
		String service = "premier service";
		if (numService == 2) {
			service = "deuxième service";
		}
		return "Le " + jour + "/" + mois + " : table n°" + numTable + " pour le " + service + " avec " + nbPersonne + " personnes.\n";
	}

	public Integer getNumService() {
		return numService;
	}

	public Integer getJour() {
		return jour;
	}

	public Integer getMois() {
		return mois;
	}

	public Integer getIdentificationEntite() {
		return numTable;
	}

	public Integer getNombrePersonnes() {
		return nbPersonne;
	}

	public void setIdentificationEntite(int identification2) {
		numTable = identification2;
	}
}
