package ex2;

public abstract class Article {
	

	private String reference;
	private String nom;
	private String marque;
	private double prix;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}


	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}

