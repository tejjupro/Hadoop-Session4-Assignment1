package ArraySort;

import java.util.Scanner;
 //This program sorts an array into descending order
public class acad7 {
	
	    public static void main(String[] args) 
	    {

	        int noOfElem, temp;

	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter no. of elements you want in array:");

	        noOfElem = s.nextInt();

	        int a[] = new int[noOfElem];//array of elements whose size as provided by the user.

	        System.out.println("Enter all the elements:");

	        for (int i = 0; i < noOfElem; i++) //As the array position starts from "0" ,iterate till size-1;

	        {
	            a[i] = s.nextInt();//assign input number to array element.

	        }

	        for (int i = 0; i < noOfElem; i++) 
       // loop to consider  one by one element to compare with rest of the elements.
	        {
	            for (int next = i + 1; next < noOfElem; next++) 

	            {
	            	// compare ith element with rest of the elements whether they are less than it. 
	            	//If not swap the ith element with next element, continue if it is equal or greater
	            	//than the next element
	            	
	            	
	                if (a[i] < a[next]) 

	                { // swap using the temp variable.
	                    temp = a[i];
	                    a[i] = a[next];
	                    a[next] = temp;
	                }
	            }
	        }

	        System.out.print("Descending Order:");

	        for (int i = 0; i < noOfElem - 1; i++) 

	        {
	            System.out.print(a[i] + ",");

	        }
	        System.out.print(a[noOfElem - 1]);
	

}
  }
