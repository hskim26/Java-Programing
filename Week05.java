package KHS;

import java.util.Scanner;

public class Week05 {
	
		int radius;
		String name;
		
		//this.멤버 -> 객체 자신에 대한 레퍼런스 
		
		// 생성자: new로 객체를 생성할 때 호출됨, 생성자 여러 개 선언 가능
		public Week05() {this.radius = 1; 	this.name = "";} // 기본 생성자
		public Week05(int r, String n) { this.radius = r; this.name = n;}
		
		
		public double getArea() {
			return 3.14*radius*radius;
		}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		Week05 pizza = new Week05(10,"자바피자");
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
		
		Week05 donut = new Week05();
		donut.name = "자바도넛";
		System.out.println(donut.name + "의 면적은 " + donut.getArea());
		
			
	}
		
}
