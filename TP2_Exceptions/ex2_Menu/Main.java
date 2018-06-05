package ex2_Menu;

import Exceptions.BoundException;
import Exceptions.NotIntegerException;
import Exceptions.NullInputException;

public class Main {

	public static void main(String[] args) throws BoundException, NullInputException, NotIntegerException {

		
		String menu[] ={"choix1", "choix2", "choix3"};
		Menu m = new Menu();
		
		m.QuestionReponse(menu);
		System.out.println("Please input your choice:");

		
	}

}
