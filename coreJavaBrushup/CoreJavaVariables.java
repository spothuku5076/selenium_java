/**
 * 
 */
package coreJavaBrushup;

import java.util.ArrayList;

/**
 * @author User
 *
 */
public class CoreJavaVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		System.out.println(myNum);
		String myName = "Sai Lalitesh Pothukuchi";
		System.out.println(myName);
	     float mydec = 5.99f;
	     double mydec1 = 5.99;
	     System.out.println("The values of mydec is " + mydec + " " + "and mydec1 is " + mydec1);
	     boolean x = true;
	     
	     
	     /* Arrays */
	     int[] arr = new int[2];
	     arr[0] =1;
	     arr[1] = 2;
	     
	     
	     int[] arr2 = {1,2,3,4,5};
	     
	     for (int i=0;i<arr.length;i++)
	     {
	    	 if(i==0)
	    	 {
	    		 System.out.println("The value of " + i+"th element in an array arr is "+arr[i]);
	    	 }
	    	 else if(i==1)
	    	 {
	    		 System.out.println("The value of " + i+"st element in an array arr is "+arr[i]);
	    	 }
	    	 else
	    	 {
	    		 System.out.println("The value of " + i+"nd element in an array arr is "+arr[i]);
	    	 }
	    	 
	     }
	     
	     for (int j=0;j<arr2.length;j++)
	     {
	    	 if(j%10==2)
	    	 {
	    		 System.out.println("The value of " + j+"nd element in an array arr2 is "+arr2[j]);
	    	 }
	    	 else if(j%10==3)
	    	 {
	    		 System.out.println("The value of " + j+"rd element in an array arr2 is "+arr2[j]);
	    	 }
	    	 else if(j%10==1)
	    	 {
	    		 System.out.println("The value of " + j+"st element in an array arr2 is "+arr2[j]);
	    	 }
	    	 else
	    	 {
	    		 System.out.println("The value of " + j+"th element in an array arr2 is "+arr2[j]);
	    	 }
	     }
	     
	     /* Array Lists for dynamically allocated arrays */
	     
		ArrayList a = new ArrayList();
	     a.add("Lalitesh");
	     a.add("is Learning");
	     a.add("Selenium");
	     a.add("for the ");
	     a.add(2);
	     a.add("nd Time");
	     for(int i=0;i<a.size();i++)
	     {
	    	 System.out.println(a.get(i));
	     }
	     
	     

	}

}
