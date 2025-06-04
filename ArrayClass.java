package JAVAPackage;

public class ArrayClass {

	public static void main(String[] args) {
		
		//Approach 1 
		
		int a[]= new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a.length);
		
		//Approach 2
		//int B[]= {1,2,3,4,5};
		
		//By using normal for loop	
//		for(int i=0;i<=a.length;i++) {
//			
//			System.out.println(a[i]);
//		}
		for(int x:a) {
			
			System.out.println(x);
		}
		
	}

}
