package UserInput;
//Program to add two integers submitted by user
import java.util.Scanner;

public class acad {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //to read the the numbers from users
		System.out.println("Key in the first integer number");
		int first = s.nextInt();
		System.out.println("Key in the second integer number");
		int second = s.nextInt();
		int sum = first + second;
		System.out.println("The sum of " +first +" and second number " +second+" is " +sum);
	}

}
