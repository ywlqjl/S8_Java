package ex2_TeleGestion;

public abstract class Emission {


	private String nom;
	private int heure;
	private int duree;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getHeure() {
		return heure;
	}
	public void setHeure(int heure) {
		this.heure = heure;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Emission() {

	}
		
	public Emission(String nom,int duree) {
		this.nom = nom;
		this.duree = duree;
	}
	
	
}
