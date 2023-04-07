package model;

public class FormulaireHotel extends Formulaire{
	private int jour;
	private int mois;
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	public FormulaireHotel(int jour,int mois,int numChambre,int nbLitSimple,int nbLitDouble) {
		super(jour, mois);
		this.jour = jour;
		this.mois = mois;
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numChambre = numChambre;
	}
	
	public String toString() {
		return "Le " + jour + "/" + mois + " : chambre n°" + numChambre + " avec " + nbLitSimple + " lits simples et " + nbLitDouble + " lits doubles.\n";
	}
	

	public Integer getJour() {
		return jour;
	}

	public Integer getMois() {
		return mois;
	}

	public Integer getIdentificationEntite() {
		return numChambre;
	}

	public Integer getLitSimple() {
		return nbLitSimple;
	}
	
	public Integer getLitDouble() {
		return nbLitDouble;
	}

	public void setIdentificationEntite(int identification2) {
		numChambre = identification2;
	}
	
}
