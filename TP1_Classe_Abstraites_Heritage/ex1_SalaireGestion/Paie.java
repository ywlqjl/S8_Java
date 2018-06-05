package ex1_SalaireGestion;

import java.util.ArrayList;
import java.util.List;

public class Paie {

	public static void main(String[] args) {

		Ouvriers ou1 = new Ouvriers("Jac", 35, 29001);
		Ouvriers ou2 = new Ouvriers("Novan", 32, 29002);
		Ouvriers ou3 = new Ouvriers("Marie", 29, 29003);
		
		Commerciaux c1 = new Commerciaux("A", 39, 10001);		
		Commerciaux c2 = new Commerciaux("B", 42, 10002);
		
		Collaborateurs co1 = new Collaborateurs("Paul", 52, 351289);
		
		List<Employe> list = new ArrayList<Employe>();
		list.add(ou1);
		list.add(ou2);
		list.add(ou3);
		list.add(c1);
		list.add(c2);
		list.add(co1);
		


		
		//print the number of the employers
		System.out.println(list.size());
		//print all the employers
		for(int i=0; i<list.size();i++){  
		    System.out.println(list.get(i).getName()+"\t"+list.get(i).getAge()+"\t"+list.get(i).getTelNumber());  
		}  
		
		
		ou1.setInfoSalaire(35, 20000, 40, 10);
		ou1.getSalaire();
		System.out.println(ou1.getName()+" gagne "+ou1.getSalaire()+" euros");
	}

}
