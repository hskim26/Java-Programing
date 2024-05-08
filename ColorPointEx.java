package KHS;

class Point{	// super class(부모, 기본)
	private int x, y;
	public void set(int x, int y) {	this.x = x; this.y = y;}
	public void showPoint() {System.out.println("(" + x + "," + y +")");}

	public Point(int x, int y) {System.out.println("Point(x,y)"); this.x = x; this.y = x;}
}
class ColorPoint extends Point { // Point를 상속받은(확장한) ColorPoint 선언, sub class(자식, 파생)
	private String color;
	public void setColor(String color) {	this.color = color; }
	public void showColorPoint() {
		System.out.print(color);   
		this.showPoint(); // Point 클래스의 showPoint() 호출
	}
	



public class ColorPointEx { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point();	// Point 객체 생성
		p.set(1, 2);	p.showPoint();
		ColorPoint cp = new ColorPoint();	// ColorPoint 객체 생성
		cp.set(3,4); cp.setColor("red");	cp.showColorPoint();
 		
		
		
	}

}
