package ex2_Menu;
import java.util.*;

import ex2_Exceptions.*;

public class Menu  {

	/**
	 * 
	 * @param n The number of the choices in the menu
	 * @return choix The choice of the user
	 * @throws BoundException
	 * @throws NotIntegerException 
	 */
	public int SaisirChoix(int n) throws BoundException, NullInputException, NotIntegerException{
		
		System.out.println("Please input your choice:");
		if ( n <= 1) {
	        throw new BoundException("The number must be >= 1");
	    }

		Scanner sc = new Scanner(System.in);
		
		if(!sc.hasNext()){
	        //throw new IllegalArgumentException("You should enter a numer!");
	        throw new NullInputException("You should enter a numer!");	
		}
		
		int choix = Integer.parseInt(sc.next());

		if(!Character.isDigit(choix)){
			System.out.println(Character.isDigit(1));
			throw new NotIntegerException("It is not a integer!");
		}
		if(choix <1 || choix > n){
			
	        throw new BoundException("The number must be entre 1 and "+n);
		}
		
		//sc.close();
		return choix;
		
	}
	
	
	
	/**
	 * Afficher the menu
	 * @param menu The list menu 
	 */
	public void AfficheMenu(String menu[]){
		for (int i = 0; i< menu.length; i++){
			System.out.println(i+":"+menu[i]);
		}
		
	}
	
	
	
	/**
	 * Show the choice of the user
	 * @param menu The menu list
	 * @throws NullInputException 
	 * @throws BoundException 
	 * @throws NotIntegerException 
	 */
	public void QuestionReponse(String menu[]) throws BoundException, NullInputException, NotIntegerException{
		
		try{
			
			AfficheMenu(menu);
			int choice = SaisirChoix(menu.length);
			System.out.println("Your choice is:"+ choice + "-" + menu[choice] );
			
		}catch(BoundException e){
			throw new BoundException("The number must be entre 1 and "+menu.length);
			
		}catch(NullInputException e){
			throw new NullInputException("You should enter a numer!");
			
		}catch(NotIntegerException e){
			throw new NotIntegerException("It is not a integer!");
		}
		
	}
}
