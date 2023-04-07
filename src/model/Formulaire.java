package model;

public class Formulaire {
	private int jour;
	private int mois;
	private int ID;
	
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	public Integer getJour() {
		return jour;
	}

	public Integer getMois() {
		return mois;
	}

	public Integer getIdentificationEntite() {
		return ID;
	}
	
	public void setIdentificationEntite(int identification2) {
		ID = identification2;
	}
}
