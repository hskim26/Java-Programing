package KHS;




class Circle{
	int radius;
	
	// 반지름을 10으로 지정하는 기본생성자 추가, 반드시 아래 생성자를 호출해야 함!
	public Circle() {
		this(10);
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}




public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		
		
		Circle c [] = new Circle[5];	// 객체참조 5개
	
	
	for(int i = 0; i<c.length; i++)
		c[i] = new Circle(); // 객체를 생성하여 각 참조가 객체를 가리키도록 함
	
	for(int i = 0; i<c.length; i++)
		System.out.print((int)(c[i].getArea()) + " ");
		
		
	}

}
