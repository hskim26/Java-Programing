package KHS;
import java.util.Scanner;
public class RSPEx {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s,r,p;
		
		int computer = (int)(Math.random()* 4 + 1);
		
		System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
		int n = scan.nextInt();
		switch(n) {
		case 1:
			if(computer == 1)
				System.out.println("철수(가위) : 컴퓨터(가위)");
				System.out.println("비겼습니다.");
				break;
		case 2:
			if(computer == 1)
				System.out.print("철수(바위) : 컴퓨터(가위)");
				System.out.println("사용자가 이겼습니다.");
			if(computer == 2)
				System.out.print("철수(바위) : 컴퓨터(바위)");
				System.out.println("비겼습니다.");
			if(computer == 3)
				System.out.print("철수(바위) : 컴퓨터(보)");
				System.out.println("컴퓨터가 이겼습니다.");
			break;
		
		case 3:
			if(computer == 1)
				System.out.print("철수(보) : 컴퓨터(가위)");
				System.out.println("컴퓨터가 이겼습니다.");
			if(computer == 2)
				System.out.print("철수(보) : 컴퓨터(바위)");
				System.out.println("사용자가 이겼습니다.");
			if(computer == 3)
				System.out.print("철수(보) : 컴퓨터(보)");
				System.out.println("비겼습니다.");
			break;
			
		case 4:
			break;
		default:
			System.out.println("숫자를 잘못 입력하셨습니다!");
		}
	}

}
