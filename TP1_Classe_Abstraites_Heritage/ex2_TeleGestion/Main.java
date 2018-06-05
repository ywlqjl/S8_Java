package ex2_TeleGestion;

public class Main {

	public static void main(String[] args) {

		Fiction f1 = new Fiction();
		f1.setNom("Earth");
		f1.setAnneeRealisation(2016);
		f1.setDuree(2);
		f1.setNomRealisateur("Andre");
		f1.setRediffusion(false);
	
		
		Reportage r1 = new Reportage();
		r1.setNom("GuoBaoDangAn");
		r1.setDuree(4);
		r1.setTheme("Culture");
		
		Reportage r2 = new Reportage();
		r2.setNom("Animal World");
		r2.setDuree(3);
		r2.setTheme("Animal");
		
		//Divertissement durent systématiquement 2h
		Divertissement d1 = new Divertissement();
		d1.setNom("Tank War");
		d1.setDuree(2);
		
		Divertissement d2 = new Divertissement();
		d2.setNom("Kenan");
		d2.setDuree(2);
		
		System.out.println(d2.getDuree());
		
		
	}

}
