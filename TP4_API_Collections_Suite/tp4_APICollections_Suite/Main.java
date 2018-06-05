package tp4_APICollections_Suite;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		ListOperation l = new ListOperation();
		LinkedList<String> list = new LinkedList<String>();
		
		while(true){
			Menu menu = new Menu();
			menu.AfficherMenu();
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int choix = sc.nextInt();
			menu.Choix(choix, l, list);
		}
		
//		ListOperation lo = new ListOperation();
//		LinkedList<String> list = lo.CreateList();

		//list.addFirst("head");
//		lo.ajouterElement(list, "Rouge");
//		lo.ajouterElement(list, "Vert");
//		lo.ajouterElement(list, "Noir");
//		lo.ajouterElement(list, "Jaune");
//		lo.ajouterElement(list, "Bleu");
//		lo.afficherAll(list);
//		lo.afficherSublistAvecPos(list, 3);
//		lo.ajouterElementParPosition(list, "0", 1);
//		lo.afficherAll(list);

//		lo.afficherInverse(list);
//		System.out.println(list.poll());
		
//		lo.ajouterElementEnQueue(list, "q1", "q2");
//		lo.ajouterElementEnTete(list, "t1", "t2");
//		lo.afficherAll(list);
//		lo.afficherAvecIndex(list);
//		lo.appartenance(list, "t1");
//		lo.supprimerElement(list, "t2");
//		lo.supprimerPremier(list);
//		lo.supprimerDernier(list);
//		lo.permuter(list, "Noir", "Rouge");
//		lo.melanger(list);
//		lo.afficherAll(list);
//		
//		LinkedList<String> list2 = lo.CreateList();
//		list2 = lo.duplicate(list);
//		lo.afficherAll(list2);
//		lo.afficherAll(list);

//		String[] a = {"a", "b","c"};
//		int[] index = {1,2,4};
//		lo.EmplacementSpecifique2(list,a,index);
//		lo.afficherAll(list);

//		String firstElement = lo.recupererFirstElement(list);
//		System.out.println(firstElement);
		
//		System.out.println(lo.LinkToArray(list));
		
//		System.out.println(lo.listVide(list));
//		System.out.println(lo.comparerLists(list, list2));
		
	}

}
