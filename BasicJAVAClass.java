package JAVAPackage; //Created a Package 

public class BasicJAVAClass {  // created class BasicJAVAClass

public int B; //declare instance variable


public BasicJAVAClass() //default constructor
{
	//initialized the instance variable
	this.B=3;
}
public static String C="hello static";//initialized the static variable
	
	public static void main(String[] args) { //Main statement of the class. Main class return first. 
		
		BasicJAVAClass ObjCreate1= new BasicJAVAClass(); //creation an object 
		
		System.out.println("Print the instance variable:"+ObjCreate1.B); //Print the instance variable
		
		int a=10; //initialized local variable (local variable used in the method)
		
		String a1="Hello";
		
		System.out.println("Print the local variable:"+a+"\n"+a1);
		
		System.out.println("Print the static variable:"+ BasicJAVAClass.C);
		

	}

}
