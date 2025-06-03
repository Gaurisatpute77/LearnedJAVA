package JAVAPackage;

public class Loop {

	public static void main(String[] args) {
		
		// Loop Statement
		
	//1. do-while loop
		
		int i=10; //Initialization
		do {
			
			System.out.println(i); //statements
			i+=10;//inc/dec
			
		}while(i<=100); //condition applied NOTE:Put semicolon 

		
		//2. while loop
		
		int a=100; //Initialization
		
		System.out.println("This is while loop codition:");
		
	while(a>=1) { //condition applied 
		
		System.out.println(a);//statements
		a-=10; //inc/dec
	}
	
	//3. For loop
		
	int b=100;
	
	System.out.println("This is for loop codition:");
	
	for(b=10;b<=100;b+=10) {
	
	System.out.println(b);
		
	
	}
	
	}

}
