package KHS;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		// Integer intObject = n; autoboxing
		
		Integer intObject = Integer.valueOf(10);
		System.out.println("intObject = " + intObject);
		
		
		//int m = intObject + 10; auto unboxing
		int m = intObject.intValue();
		System.out.println("m = " + m);
	}

}
