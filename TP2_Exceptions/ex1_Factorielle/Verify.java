package ex1_Factorielle;
import java.util.Scanner;

import Exceptions.BoundException;
import Exceptions.NullInputException;

public class Verify {

	private Scanner sc = null;
	
	public Verify() {
		sc = new Scanner(System.in);
	}
	
	public int VerifyInput() throws Exception{
		System.out.println("Please input a number for calculating:");
		String str = sc.nextLine();
		
		if(str.isEmpty() || str.equals(" ")) 
			throw new NullInputException("You should input a number!");
		
		int base = Integer.parseInt(str);
		
		if(base < 0)
			throw new BoundException("The number must be positive!");
		
		if(!(base%2==0 || base % 2 ==1) )
			throw new NumberFormatException("The number isn't integer!");
		
		if(base < 0 || base > 12)
			throw new BoundException("The number must be >= 0 and <= 12!");
			
		return base;

	}
}
