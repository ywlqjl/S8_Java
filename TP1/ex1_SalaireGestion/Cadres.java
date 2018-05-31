package ex1_SalaireGestion;

public class Cadres extends Employe{

	private double salaryPerHour;
	private double time;
	
	public Cadres(String name, int age, int telNumber){
		super(name, age, telNumber);
	}
	
	public Cadres(String name, int age, int telNumber, double time, double salaryPerHour) {
		super(name, age, telNumber);
		this.salaryPerHour = salaryPerHour;
		this.time =time;
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
	
	public double getSalaire(){
		super.setWeekSalaire(this.salaryPerHour*35+(this.time-35)*1.5*this.salaryPerHour);
		return super.getSalaire();
		
	}
	
	public void setInfoSalaire(int age, int telNumber, double time, double salaryPerHour) {
		this.setAge(age);
		this.setTelNumber(telNumber);
		this.setTime(time);
		this.setSalaryPerHour(salaryPerHour);
	}

}
