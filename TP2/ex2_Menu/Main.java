package ex2_Menu;

import ex2_Exceptions.BoundException;
import ex2_Exceptions.NotIntegerException;
import ex2_Exceptions.NullInputException;

public class Main {

	public static void main(String[] args) throws BoundException, NullInputException, NotIntegerException {

		
		String menu[] ={"choix1", "choix2", "choix3"};
		Menu m = new Menu();
		m.QuestionReponse(menu);
		
	}

}
