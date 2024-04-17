package KHS;

public class ValuePassing {

	static void increase(int m) {
		m = m + 1;
	}
	
	static void increase(Circle c) {
		c.radius++;
	}
	
	static void increase(int [] array) {
		for (int i = 0; i<array.length; i++)
			array[i]++;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		increase(n);    // 호출 시 n (정수) 값이 m으로 복사
		
		System.out.println(n);
	
		Circle pizza = new Circle(10);
		increase(pizza);	// 호출 시 pizza (참조) 값이 c로 복사
		System.out.println(pizza.radius);
		
		
		int a[] = {1, 2, 3, 4, 5};
		increase(a);		// 호출 시 a (참조)값이 array로 복사
		for (int i = 0; i<a.length; i++)
			System.out.println(a[i]);
		
		
		
		
	}

}
