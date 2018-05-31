package ex1_SalaireGestion;

public class Commerciaux extends Employe{

	private double chiffreAffaire;
	
	
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	public Commerciaux(String name, int age, int telNumber){
		super(name, age, telNumber);
	}
	
	public Commerciaux(String name, int age, int telNumber, double chiffreAffaire) {
		super(name, age, telNumber);
		this.chiffreAffaire = chiffreAffaire;
	}


	public double getSalaire(){
		super.setWeekSalaire(this.chiffreAffaire* 0.9);
		return super.getSalaire();
		
	}
	
	
	public void setInfoSalaire(int age, int telNumber, double chiffreAffaire) {
		this.setAge(age);
		this.setTelNumber(telNumber);
		this.chiffreAffaire = chiffreAffaire;
		//what's the difference?
	}
}
