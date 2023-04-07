package model;

public class FormulaireSpectacle extends Formulaire{
	private int jour;
	private int mois;
	private int numZone;
	private int numChaise;
	
	public FormulaireSpectacle(int jour,int mois,int numZone,int numChaise) {
		super(jour, mois);
		this.jour = jour;
		this.mois = mois;
		this.numZone = numZone;
		this.numChaise = numChaise;
	}
	
	public String toString() {
		return "Le " + jour + "/" + mois + " : zone n°" + numZone + " et chaise n°" + numChaise + ".\n";
	}
	
	
	public Integer getJour() {
		return jour;
	}

	public Integer getMois() {
		return mois;
	}

	public Integer getIdentificationEntite() {
		return numChaise;
	}

	public Integer getZone() {
		return numZone;
	}

	public void setIdentificationEntite(int identification2) {
		numChaise = identification2;
	}
}
