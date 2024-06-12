package KHS;
class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x= x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(Point(), String color) {
		public void setXY(int x, int y ) {
			System.out.print();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}
