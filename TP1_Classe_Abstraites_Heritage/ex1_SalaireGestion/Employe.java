package ex1_SalaireGestion;

public abstract class Employe implements Salaire {

	
	private String name;
	private int age;
	private int telNumber;
	private double weekSalaire;


	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public Employe(String name, int age, int telNumber) {
		this.setName(name);
		this.setAge(age);
		this.setTelNumber(telNumber);
	}
	
	public Employe(String name, int age, int telNumber, double time, double turnover, double salaryPerHour ){
		
	}

	
	public int getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(int telNumber) {
		this.telNumber = telNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeekSalaire() {
		return weekSalaire;
	}

	public void setWeekSalaire(double weekSalaire) {
		this.weekSalaire = weekSalaire;
	}
	
	
	
	public double getSalaire(){
		return this.weekSalaire;
		
	}
	
	public void setInfoSalaire(){
		
	}
}
