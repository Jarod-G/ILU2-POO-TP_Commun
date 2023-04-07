package model;

public abstract class EntiteReservable <T extends Formulaire>{
	private CalendrierAnnuel carnetRes = new CalendrierAnnuel();
	private int numeroID;
	
	public int getNumeroID() {
		return numeroID;
	}
	
	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}
	
	public boolean estLibre(T formulaire) {
		return carnetRes.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract void compatible(T formulaire);
	public abstract void reserver(T formulaire);
}
