package KHS;

class Point{ // (6번) Point와 ColorPoint 기본 생성자 추가, 예제 5-3 참고
	private int x, y;	// Point에 toString 메소드를 추가, ColorPoint 의 toString에서 호출되도록
	public Point(int x, int y) {
		this.x = x;	this.y = y;

	
	}
	public Point() {
		move(0,0);
	}
	public int getX() {return x; }
	public int getY() {return y; }
	public void move(int x, int y) {this.x = x;	this.y=y;}
	public String toString() {
		return "(" + getX() + "," + getY() + ")점";
	};
}

class ColorPoint extends Point{
	
	
	// color 데이터 필드
	String color;
	// 생성자
	public ColorPoint(int x, int y, String color) {
		super(x,y); this.color = color;
	}
	public ColorPoint() {
		super(); this.color = "BLACK";
		
	}
	// setXY
	public void setXY(int x, int y) {
		move(x,y);
		
	}
	// setColor
	public void setColor(String color) {
		this.color = color;
	}
	// toString  // show와 비슷하나 문자열을 만들어 print하지 않고 return
	public String toString() {
		return color + " " + super.toString(); 
	};
}
public class Chap5Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorPoint zeroPoint = new ColorPoint();	// 6번에서 추가
		System.out.println(zeroPoint.toString());	// 출력내용 : BLACK색 (0,0) 점
		
		ColorPoint cp = new ColorPoint(5, 5, "yellow");
		cp.setXY(10, 20);
		cp.setColor("red");
		String str = cp.toString();
		System.out.println(str); // 출력내용 : red 색 (10, 20)의 점
		
		
	}

}
