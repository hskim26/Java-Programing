package KHS;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Week04 {
	
	// args는 바꿔도 됨
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// p.167 (11번) 명령행 인자를 정수로 바꾸어 정수 값의 평균을 출력

		
// 예외처리 이용, 정수 변환 성공(예외 발생X) 시 sum에 합산하고 데이터 개수 증가시킴
// 힌트: int i = Integar.parseInt("10"); 하면 i에 10이 대입됨	

// 명령행 : 2 3 4 => 평균 = 3
// 명령행 : 1 2 3 4 => 평균 = 2.5
// 명령행 인자: 1 2 3 a 5 => 평균 = 2.75

// p.169 (15번) 실수 입력 시 입력을 다시 받도록 수정	
// 곱하려는 두 수 입력 >> 2.5 4
// 실수 입력 X
// 곱하려는 두 수 입력 >> 4 3
// 4 x 3 = 12

		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("곱하려는 두 수 입력 >> ");
		
		
		while(true) {
		try {
			int n = scan.nextInt();
			int m = scan.nextInt();
			 System.out.print(n + "x" + m + " = " + n * m);
			 break;
		}
		catch(InputMismatchException e) {
			System.out.println("정수 아님, 다시 입력");
			System.out.print("곱하려는 두 수 입력 >> ");
			scan.next();
			continue;
		}
		//scan.nextline();
		}
		
		scan.close();
		
		

//		System.out.println("정수 3개를 입력하세요");
//		int sum = 0, n = 0;
//		for(int i = 0; i<3; i++) {
//			System.out.print(i+ ">>");
//			try {
//				n = scan.nextInt();
//			}
//			catch(InputMismatchException e) {
//				System.out.println("정수 아님, 다시 입력");
//				scan.next();
//				i--;
//				continue;
//			}
//			sum += n;
//		}
//		System.out.println("합은 " + sum);
		
		
		
//		int sum = 0, count = 0;
//
//		
//		for(int i = 0; i<args.length; i++) 
//			try{
//				
//				sum += Integer.parseInt(args[i]);
//				count++;
//			}
//					
//		
//		catch(NumberFormatException e) {
//			System.out.println("정수 변환 불가 " + args[i]);
//		}
//		   
//		System.out.println("평균 = " + (double)sum / count);
		
		
		
		
//		while(true) {
//		
//			int [] intArray = new int[] {0,1,2,3,4};
//			
//			try {
//				for(int i = 0; i<6; i++)
//					System.out.println(intArray[i]);
//			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
//			}
//			
//		}
			
			
			
//			int dividend;
//			int divisor;
//		
//			System.out.print("나뉨수 :");
//			dividend = scan.nextInt();
//			System.out.print("나눗수 :");
//			divisor = scan.nextInt();
//		try {
//			System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
//			break;
//		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			e.printStackTrace();
//		}
//}
		
		
		
		
		
//		double sum = 0.0;
//		
//		System.out.println("인자 개수 = " + args.length);
//		for(int i = 0; i<args.length; i++)
//			sum += Double.parseDouble(args[i]);
//		
//		System.out.println("합계 :" + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

