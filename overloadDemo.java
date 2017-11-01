package OverloadingDemo;

public class overloadDemo {

	public static void main(String[] args) {
		System.out.println("");
		acad6  a = new acad6();
		System.out.println("Incrementing 25 by 10 is " +a.sum(25));
		
		System.out.println("The sum of two integers 67 +78 is " +a.sum(67,78));
		
		System.out.println("The sum of two real numbers 25.0 +34.2 is " +a.sum(25.0f,34.2f));
		
		
		
	}

}
