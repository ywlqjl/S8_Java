package ex2;

public class Lot extends Article{

	private Integer nombreArticles; 
	private Double reductions; 
	
	public Lot() {
		// TODO Auto-generated constructor stub
	}

	
	public int getNombreArticles() {
		return nombreArticles;
	}

	public void setNombreArticles(int nombreArticles) {
		this.nombreArticles = nombreArticles;
	}

	public Double getReductions() {
		return reductions;
	}

	public void setReductions(Double reductions) {
		this.reductions = reductions;
	}

	public double calculPrix(double prixUnitaire, double nombre, double reduction ){
		return prixUnitaire*nombre*(1-reduction);
	}
	
	public void ajouterArticle(Article a,int nb,double reduction){
		super.setMarque(a.getMarque());
		super.setNom("lot de "+String.valueOf(nb)+" "+a.getNom());
		super.setPrix(a.getPrix()*nb*(1-reduction));
	}
}
