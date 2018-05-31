package ex2_TeleGestion;

public class Fiction extends Emission{


	//Des attributs de fiction seulement
	private int anneeRealisation;
	private String nomRealisateur;
	private boolean rediffusion;
	
	//Des getteres et setters
	public int getAnneeRealisation() {
		return anneeRealisation;
	}
	public void setAnneeRealisation(int anneeRealisation) {
		this.anneeRealisation = anneeRealisation;
	}
	public String getNomRealisateur() {
		return nomRealisateur;
	}
	public void setNomRealisateur(String nomRealisateur) {
		this.nomRealisateur = nomRealisateur;
	}
	public boolean isRediffusion() {
		return rediffusion;
	}
	public void setRediffusion(boolean rediffusion) {
		this.rediffusion = rediffusion;
	}
	
	//constructioin
	public Fiction() {
		super();
	}
	
	
	
	
}
