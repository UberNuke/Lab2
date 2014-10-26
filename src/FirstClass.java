/**
 * My first java Project
 */



/**
 * @author Razvan
 * My fisrt Java Class...
 */

public class FirstClass {

	static int countObjects;
	private String myName;

	
	/**
	 * Constructor
	 * 
	 * @param Name
	 */
	public FirstClass(String Name)
	{
		countObjects++;
		myName = Name;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Working first class");
		speak();
		FirstClass myObject = new FirstClass("Razvan");
		myObject.sayMyName();
	}

	/**
	 * Static function saying "Hello World".
	 */
	public static void speak()
	{
		System.out.println("Hello World");
	}
	
	/**
	 * 	Say my name Say my name.
	 */
	public void sayMyName()
	{
		System.out.println("My name is "+myName);
	}

}
