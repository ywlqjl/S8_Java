package ex2_TeleGestion;

public class Reportage extends Emission {

	//Des attributs de Reportage seulement
	private String theme;

	//Des getteres et setters
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	
	//constructions
	public Reportage() {
		super();
	}
	
}
