package model;

abstract public class Reservation {
	private int jour;
	private int mois;
	
	
	public Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
}
