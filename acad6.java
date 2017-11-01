package OverloadingDemo;

public class acad6 {
	
	//Overloaded methods
	
	public int sum(int a, int b)
	{
		System.out.println("inside sum(int a,int b)");
		return a+b;
	}
  public float sum(float a , float b)
	  {
	  System.out.println("inside sum(float a,float b)");
		  return a+b;
	  }
  public int sum(int a){
	  System.out.println("inside sum(int a)");
	  return a+10;
  }
  
  }

