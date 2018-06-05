package ex1;

public class Ex1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex1
		Line l1 = new Line();
		Cercle c1 = new Cercle();
		Point p1 = new Point();
		Point p2 = new Point();
		Figure f1 = new Figure();
		f1.ajouter(p1);
		f1.ajouter(p2);
		f1.ajouter(l1);
		f1.ajouter(c1);
		f1.dessiner();
		f1.tranlater();
	}

}
