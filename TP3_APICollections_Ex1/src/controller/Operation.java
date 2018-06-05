package controller;

import java.util.ArrayList;

public class Operation {
 
	
	public void addNote(ArrayList<Double> notes, ArrayList<Integer> coefficients, double note, int coeff){
		notes.add(note);
		coefficients.add(coeff);
	}
	
	public void modifyNote(ArrayList<Double> notes, int index, double note ){
		notes.set(index, note);
	}
	
	public void showAllNote(ArrayList<Double> notes, ArrayList<Integer> coefficients ){
		System.out.println("All notes:\n");
		for(int i = 0; i<notes.size(); i++){
			
			System.out.println(i+":note\t"+notes.get(i)+"\t coeff\t"+coefficients.get(i));

		}
	}
	
	public double calculatAverage(ArrayList<Double> note, ArrayList<Integer> coefficients){
		
		double sumNotes = 0;
		int sumCoeff = 0;
		for (int i = 0; i< note.size(); i++){
			sumCoeff = sumCoeff+coefficients.get(i);
			sumNotes = sumNotes + note.get(i)*coefficients.get(i);
		}
		return sumNotes/sumCoeff;
		
	}
}
