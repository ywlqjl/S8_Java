package ex1_SalaireGestion;

public class Collaborateurs extends Employe{
	
	private double chiffreAffaire;
	private double salaryPerHour;
	private double time;
	
	
	public Collaborateurs(String name, int age, int telNumber){
		super(name, age, telNumber);
	}
	
	public Collaborateurs(String name, int age, int telNumber, double chiffreAffaire, double time, double salaryPerHour) {
		super(name, age, telNumber);
		this.chiffreAffaire = chiffreAffaire;
		this.salaryPerHour = salaryPerHour;
		this.time = time;
	}

	

	public double getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(double salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	public double getSalaire(){
		super.setWeekSalaire(this.chiffreAffaire * 0.9 + this.salaryPerHour*35 + this.salaryPerHour * (this.time-35)*1.5);
		return super.getWeekSalaire();
		
	}
	
	public void setInfoSalaire(int age, int telNumber, double time, double salaryPerHour, double chiffreAffaire) {
		this.setAge(age);
		this.setTelNumber(telNumber);
		this.setSalaryPerHour(salaryPerHour);
		this.setTime(time);
		this.setChiffreAffaire(chiffreAffaire);
	}

}
