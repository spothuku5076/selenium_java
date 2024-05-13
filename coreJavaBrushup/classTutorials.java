/**
 * 
 */
package coreJavaBrushup;

/**
 * @author User
 *
 */
public class classTutorials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* First object for the class should be created, then using that object the method i
		 * should be called
		 */
		classTutorials ct = new classTutorials();
		ct.getUserData();
		
		/*
		 * Since getNum is a static method which means class has access to the method, so
		 * no need to create the class object, instead directly we can access it
		 */
		getNum(); 
		
		/* Calling a method from other class 
		 * Since it does not belong to this class i.e, not static, obviouslly we have to create an
		 * object for this class and using that class object, we can access that metho*/
		TalkUser tu = new TalkUser();
		tu.sing();
		

	}
	
	public String getUserData() {
		String Name = "Sai Lalitesh Pothukuchi";
		return Name;
	}
	
	public static int getNum()
	{
		int num =6;
		return num;
	}

}
