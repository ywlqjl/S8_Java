package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Double> notes = new ArrayList<Double>();
		ArrayList<Integer> coefficients = new ArrayList<Integer>();
		
		Operation noteOperation = new Operation();
	
		while(true){
		  
			Menu menu = new Menu();
		    menu.showMenu();
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
		    int choice = scanner.nextInt();
		    
			switch(choice) 
			{ 
			   case 1: 
			       System.out.println("add:"); 
			       System.out.println("Please input the note:"); 
			       double note = scanner.nextDouble();
			       
			       System.out.println("Please input the coefficient:"); 
			       int coeff = scanner.nextInt();
			       noteOperation.addNote(notes, coefficients, note, coeff);
			       break; 
			   case 2: 
			       System.out.println("modify:"); 
			       System.out.println("Please input the index of the note to modify:"); 
			       int index = scanner.nextInt();
			       noteOperation.modifyNote(notes,index, notes.get(index));
			       
			       break; 
			   case 3: 
			       System.out.println("showALl:"); 
			       noteOperation.showAllNote(notes,coefficients);
			       break; 
			   case 4: 
			       System.out.println("Average:"+noteOperation.calculatAverage(notes, coefficients)+"\n"); 
			       break; 		   
			   default: 
			       System.out.println("exit"); 
			       break; 
			} 
		}
	    
		

		
	}

}
