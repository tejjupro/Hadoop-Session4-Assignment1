package OddEvenNum;

import java.util.Scanner;

public class acad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //to read the the numbers from users
		System.out.println("Key in the begining of the  number");
		int first = s.nextInt();
		System.out.println("Key in the last number");
		int second = s.nextInt();
		if(first %2 ==0){
			System.out.println("The even numbers are");
			for (int i=first; i<=second; i=i+2){
				System.out.print(i+ " ");}
			    System.out.println();
				System.out.println("The odd numbers are");
				for (int i=first+1; i<=second; i=i+2){
					System.out.print(i+ " ");
			}
		}
			
			else{
				
				System.out.println("The odd numbers are");
				for (int i=first; i<=second; i=i+2){
					System.out.print(+i+ " ");
				}
				System.out.println();
				System.out.println("The even numbers are");
				for (int i=first+1; i<=second; i=i+2){
					System.out.print(i+ " ");
			}
			}
		
	}
}
			
		
	


