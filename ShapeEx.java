package KHS;

abstract class Shape{ // 추상클래스(추상메소드를 가짐)
	
	public abstract void draw(); // 추상메소드: 선언부만 있고 구현부 없음
}

abstract class AAA extends Shape{}

class Line extends Shape{ 
	@Override
	public void draw() {
		System.out.println("Line");
	}
	
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
	
	
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
	
}
public class ShapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape [] = new Shape[3];
		
		shape[0] = new Line(); // upcasting
		shape[1] = new Rect();
		shape[2] = new Circle();
		
		for(int i = 0; i<3; i++) { // 다형성(polymorphism)
			shape[i].draw();
		}
		//Shape shape = new Shape();  추상클래스 객체생성 불가
		
	}

}
