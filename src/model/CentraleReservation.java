package model;

public class CentraleReservation <T extends EntiteReservable<Formulaire>>{
	private T[] tabEntite;
	private int nbReservation = 0;
	
	public CentraleReservation(T[] tabEntite,int nbReservation) {
		this.tabEntite = tabEntite;
		this.nbReservation = nbReservation;
		
	}
	
	public int ajouterEntite(T entite) {
		tabEntite[nbReservation + 1] = entite;
		entite.setNumeroID(nbReservation + 1);
		this.nbReservation++;
		return entite.getNumeroID();
	}
	
	public <F extends Formulaire> int[] donnerPossibilites(F fClient){
		int[] tabPossibilite = new int[tabEntite.length];
		for(int i = 0; i < nbReservation; i ++) {
			if(tabEntite[i].estLibre(fClient)) {
				tabPossibilite[i] = 1;
			}else {
				tabPossibilite[i] = 0;
			} 
		}
		return tabPossibilite;
	}
}
