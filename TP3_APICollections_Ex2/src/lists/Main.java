package lists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Ici c'est un exemple de la methode: creer un objet.
		SetOperations s = new SetOperations();
		
		//Ici c'est un exemple de la methode statique
		ArrayList<Integer> set1 = SetOperations.Create(1);
		ArrayList<Integer> set2 = SetOperations.Create(2);

		set1.add(2);
		set1.add(5);
		set1.add(11);
		s.showAllElements(set1);
		set2.add(6);
		set2.add(1);
		s.showAllElements(set2);

		s.setUnion(set1, set2);
		s.setIntersection(set1, set2);
		
		s.appartenance(set1, 11);
		s.nbElements(set1);
		
	}

}
