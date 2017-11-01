package MultiplesNum;

import java.util.Scanner;

public class acad5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //to read the the numbers from users
		System.out.println("Key in the  number");
		int first = s.nextInt();
		
		System.out.println("The multiples of the given number are ");
		
		for (int i = 1; i<=10; i++){
			System.out.println(+first +" * " +i +" = " +first*i);
		}
		

	}

}
