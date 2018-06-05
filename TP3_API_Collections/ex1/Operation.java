package ex1;

import java.util.ArrayList;

public class Operation {
 
	/**
	 * Add note into the list
	 * @param notes
	 * @param coefficients
	 * @param note
	 * @param coeff
	 */
	public void addNote(ArrayList<Double> notes, ArrayList<Integer> coefficients, double note, int coeff){
		notes.add(note);
		coefficients.add(coeff);
	}
	
	/**
	 * Modify an element in the list
	 * @param notes
	 * @param index
	 * @param note
	 */
	public void modifyNote(ArrayList<Double> notes, int index, double note ){
		notes.set(index, note);
	}
	
	/**
	 * Show all the elements 
	 * @param notes
	 * @param coefficients
	 */
	public void showAllNote(ArrayList<Double> notes, ArrayList<Integer> coefficients ){
		System.out.println("All notes:\n");
		for(int i = 0; i<notes.size(); i++){
			
			System.out.println(i+":note\t"+notes.get(i)+"\t coeff\t"+coefficients.get(i));

		}
	}
	
	/**
	 * Calculate the average of the list
	 * @param note
	 * @param coefficients
	 * @return average
	 */
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
