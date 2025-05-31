package JAVAPackage;

public class ConditionStatement {

	public static void main(String[] args) {
		int person_age=20;

		System.out.println("Person age for voting:"+person_age);
		
		//Using the if-else condition 
		if(person_age>=18)
			System.out.println("Person is eligible for vote");
		else {

			System.out.println("Person is not eligible for vote");
		}

	}

}
