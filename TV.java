package KHS;

public class TV {
	// 이름(String), 연도(int), 크기(int) 데이터 필드 선언
	// 생성자 1개, get 메소드 3개

	String Name;
	int Year, Size;
	
	//생성자 1개
	public TV(String n, int y, int s) {Name = n; Year = y; Size = s;}
	
	// get 메소드 3개
	public String getName() {return Name;}
	public int getYear() {return Year;}
	public int getSize() {return Size;}
	
	
	
	
	
	
	
public static void main(String[] args) {
		
		
		
		
		
		
		TV myTV = new TV("LG", 2017, 32); // 생성자 호출
		
		// get 메소드 3개 사용
		System.out.println(myTV.getName()+ "," + myTV.getYear() + "," + myTV.getSize());
	}

}
