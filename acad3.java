package methodSum;

import java.util.Scanner;
//accepts two integers from user and finds the sum of them
public class acad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s = new Scanner(System.in); //to read the the numbers from users
			System.out.println("Key in the first integer number");
			int first = s.nextInt();
			System.out.println("Key in the second integer number");
			int second = s.nextInt();
			sum(first,second);
	  
	}
	//method which accepts two integers as parameters, adds them and prints the sum.
		public static void sum(int first, int second){
			int add = first + second;
			
			System.out.println("Inside method sum()");
			
			System.out.println("The sum of " +first +" and second number " +second+" is " +add);
		}
	}


