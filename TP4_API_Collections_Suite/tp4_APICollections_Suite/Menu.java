package tp4_APICollections_Suite;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu {

	/**
	 * construction
	 */
	public Menu() {
	}

	/**
	 * show the items of the menu
	 */
	public void AfficherMenu(){
		System.out.println("===========Opérations sur les listes chainées===========");
		System.out.println("1.Creer une liste vide");
		System.out.println("2.Ajouter des elements");
		System.out.println("3.Afficher tous les elements de la liste");
		System.out.println("4.Afficher tous les elements dans le sens invese");
		System.out.println("5.Ajouter un element donne a une position specifique de la liste");
		System.out.println("6.Inserer deux elements en tete");
		System.out.println("7.Inserer deux elements en queue");
		System.out.println("8.Ajouter des elements donnees a des emplacements specifiques");
		System.out.println("============================================");
		System.out.println("Votre choix:");
		
	}
	
	/**
	 * Get the choice of the user
	 * @param choix
	 * @param l
	 * @param list
	 */
	public void Choix(int choix, ListOperation l, LinkedList<String> list){
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		switch(choix) 
		{ 
		   case 1: 
		       System.out.println("Donner des elements, exit by '-1':");
		       
		       while(true){
		    	   String temp = scanner.nextLine();
		    	   if(temp.equals("-1"))
		    		   break;
		    	   else{
			    	   l.ajouterElement(list,temp);
			    	   System.out.println(temp);
		    	   }
		    	   
		       }
		       break; 
		   case 2: 
		       System.out.println("Afficher tous les éléments de la liste :"); 
		       l.afficherAll(list);
		       break; 
		   case 3: 
		       System.out.println("Afficher les éléments de la liste à partir d’une position donnée :");
		       int pos = scanner.nextInt();
		       l.afficherSublistAvecPos(list,pos);
		       break; 		   
		   default: 
		       System.out.println("exit"); 
		       break; 
		} 
	}
}
