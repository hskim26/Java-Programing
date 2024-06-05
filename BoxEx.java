package KHS;
// immutable (String, Integer, ....처럼 변경할 수 없는 것) <=> mutable

public class BoxEx {
	public static void increment (int n) {
		n++;
	}
	
	public static void increment(Integer intObject) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		increment(i);
		System.out.println("i = " + i);
		
		int intObject =  1;
		increment(intObject);
		
		int j = intObject;
		System.out.println("intObject = " + j);
		
	}

}
