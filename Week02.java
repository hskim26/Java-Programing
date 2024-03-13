package KHS;

import java.util.Scanner;
// p.110 (3) 금액을 입력받아 500 동전, 100동전, 50동전, 10동전, 1동전 몇개인지 출력
// 금액입력 : 1167
// 2 1 1 1 7
// (2번) 2자리 정수를 입력받고 10의 자리와 1의 자리가 같은지 출력
// 2자리 정수입력: 77
// 같음, 10의 자리 = 7, 1의 자리 = 7
// p.112 (11번) 정수를 입력받아 3 4 5 는 봄, 6 7 8 은 여름, 9 10 11 은 가을, 12 1 2 는 겨울, 그 외 잘못입력
// 자연수 n을 입력받아 1+2+...+n=??? 출력하도록 수정
// "1~10 범위 자연수 n을 입력받아(범위 벗어나면 다시 입력) 1+2+...+n=??? 출력하도록 수정

public class Week02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		                                        //int [] intArray1 = { 1, 2, 3, 4, 5};
		                                        //int [] intArray2 = new int[] {1, 2, 3, 4, 5};
												//int [] intArray3 = new int[5];
		
		
//		int n;
//		do {
//			System.out.print("1~10 범위 자연수 입력 : ");
//			n = scan.nextInt();
//		}while(n < 1 || n >10);
//	
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			sum = sum + i;  // sum += i;
//			System.out.print(i);
//			if (i<n) {
//				System.out.print("+");
//	
//			}
//		}
//		System.out.println("=" + sum);
		
	
	
//		System.out.print("자연수 입력: ");
//		int n = scan.nextInt();
//		int sum = 0;
//		
//		//for(int i = 1; i <= n; i++) {
//			
//		int i = 1;
//		while(i<=n) {
//		sum += i;
//			System.out.print(i);
//			if(i<n) {
//				System.out.print("+");
//			}
//			i++;
//		}
//		System.out.println("=" + sum);
		
		
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;  // sum += i;
//			System.out.print(i);
//			if (i<10) {
//				System.out.print("+");
//		
//			}
//		}
//		System.out.println("=" + sum);
		

		
//		int Season = scan.nextInt();
//		
//		switch(Season) {
//													// case 3,4,5: ~~ Java에서는 OK
//		case 12:
//			System.out.println(Season + " 는 겨울");
//			break;
//		case 1:
//			System.out.println(Season + " 은 겨울");
//			break;
//		case 2:
//			System.out.println(Season + " 는 겨울");
//			break;
//		case 3:
//			System.out.println(Season + " 은 봄");
//			break;
//		case 4:
//			System.out.println(Season + " 는 봄");
//			break;
//		case 5:
//			System.out.println(Season + " 는 봄");
//			break;
//		case 6:
//			System.out.println(Season + " 은 여름");
//			break;
//		case 7:
//			System.out.println(Season + " 은 여름");
//			break;
//		case 8:
//			System.out.println(Season + " 은 여름");
//			break;
//		case 9:
//			System.out.println(Season + " 는 가을");
//			break;
//		case 10:
//			System.out.println(Season + " 은 가을");
//			break;
//		case 11:
//			System.out.println(Season + " 은 가을");
//			break;
//		default:
//			System.out.println("잘못입력");
//		}
		
		
		
		
//		char grade;
//		System.out.print("정수입력: ");
//		int score = scan.nextInt();
//		switch(score / 10) {
//		
//		case 10:
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//		default:
//			grade = 'F';
//			break;
//		}
//		System.out.println("학점 = " + grade);		
		
		
		
//		System.out.print("2자리 정수입력: ");
//		int a = scan.nextInt();
//		
//		int a10 = a / 10;
//		int a1 = a % 10;
//		
//		if(a10 == a1) {
//			System.out.print("같음, 10의 자리 = " + a10 + ", 1의 자리 = " + a1 );
//			
//		}
//		else
//			System.out.print("다름, 10의 자리 = " + a10 + ", 1의 자리 = " + a1);
//		
		
		
		

		
//		System.out.print("금액입력 : ");
//		int amount = scan.nextInt();
//		
//		int coin500 = amount / 500;
//		int coin100 = (amount % 500) / 100;
//		int coin50 = (amount % 100) / 50;  //((amount % 500)% 100)/50;
//		int coin10 = (amount % 50) / 10;  //(((amount % 500)% 100)%50) / 10;
//		int coin1 =  amount % 10;         //((((amount % 500)%100)%50)%10) / 1;
//		
//		if (amount > 0) {
//			
//			System.out.println(coin500 + " " + coin100 + " " + coin50 + " " + coin10 + " " + coin1 + " ");
//			
//		}
//		else
//			System.out.println("다시 입력해주세요");
		
//		System.out.print("점수를 입력하세요: ");
//		
//		int score = scan.nextInt();
//		
//		
//		if (score >= 60) {
//			System.out.print("학년을 입력하세요: ");
//			int year = scan.nextInt();
//			
//			if(year != 4)
//				System.out.println("합격");
//			else if(score >= 70)
//				System.out.println("합격");
//			else
//				System.out.println("불합격");
//		
//		}
//		else
//			System.out.println("불합격");
//		
		
		
		
		
		
		


		
		
		
		
		
		
//		System.out.print("정수 : ");
//		int time = scan.nextInt();
//		int sec = time % 60;
//		int min = (time / 60) % 60;
//		int hour =(time / 60) / 60;
//		
//		System.out.println(time + " = " + hour + "시 " + min + "분 " + sec + "초 ");
//		
		
	}

}
