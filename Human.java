package KHS;

public class Human {
	
	String name;
	int age;
	double height, weight;
	
	// 생성자 name 값을 받는 생성자
	public Human(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		// 이름이 "홍길동"인 Human 객체를 생성하여 aHuman 참조변수로 가리킴
		Human aHuman = new Human("홍길동");
		// aHuman 객체에 age는 21, height는 180.5  weight는 73.2를 대입
		aHuman.age = 21;   aHuman.height = 180.5;  aHuman.weight = 73.2;
		
		// 크기가 5인 Human 객체의 배열을 생성
		
		Human array [] = new Human[5];
		// 이름을 모두 "홍길동"으로 하여 5개 객체 생성
		
		for(int i =0; i<5; i++) {
			array[i] = new Human("홍길동");
			
			
		}
		
		
	
		
	}

}
