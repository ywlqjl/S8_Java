package ex2;

public class Ex2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stylo s1= new Stylo();
		s1.setCouleur("Red");
		s1.setNom("Pen"); 
		s1.setMarque("M");
		s1.setPrix(2);
		s1.setReference("001");
		
		Lot lot1 = new Lot();
		lot1.ajouterArticle(s1, 100, 0.2);
		lot1.setReference("lot001");
		System.out.println(lot1.getNom());
		System.out.println(lot1.getMarque());
		System.out.println(lot1.getPrix());
		
	}

}
