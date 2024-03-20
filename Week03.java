package KHS;

import java.util.Scanner;









public class Week03 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 자연수 n을 입력받아(자연수 아니면 다시 입력받음)
		// n개의 요소를 가지는 배열을 생성한 후
		// 정수(음수 포함) n개를 입력받아 배열에 저장하면서
		// 가장 큰 수를 구하여 출력
		
		// p.166 (7번) 정수 10개를 저장하는 배열을 만들고 1~10 범위 난수를 생성하여 배열에 저장
		// 배열 내용(정수 10개)와 평균을 출력
		// 힌트: 1~10 범위 정수 생성 (int)Math.random() * 10 + 1
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
//		int intArray[][] = new int[4][];
//		intArray[0] = new int[3];
//		intArray[1] = new int[2];
//		intArray[2] = new int[3];
//		intArray[3] = new int[2];
//		
//		for(int i = 0; i<intArray.length; i++)
//			for(int j = 0; j<intArray[i].length; j++)
//				intArray[i][j] = (int)(Math.random() * 100 + 1);
//		
//		for(int i = 0; i<intArray.length; i++) {
//			for(int j = 0; j<intArray[i].length; j++)
//				System.out.print(intArray[i][j] + " ");
//			System.out.println();
//		}

		
		
//		//p.141
//		
//		int intArray[][] = { {0}, {1,2},{3,4,5}, {6,7,8,9}, {10}, {11,12,13}};
//		
//		//p.142 line 13-17
//		for(int i = 0; i<intArray.length; i++) {
//			for(int j = 0; j<intArray[i].length; j++)	//intArray[i].length 는 i 행의 길이
//				System.out.print(intArray[i][j]+" ");
//			System.out.println();
//		}
		

		
		//		int i[][] = new int[2][5];
//		int size1 = i.length;
//		int size2 = i[0].length;
//		int size3 = i[1].length;
//		
//		
//		System.out.println(size1 + " " + size2 + " " + size3);
//		
//		// p.140 3-10
//		double score[][] = {{3.3 , 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
//		double sum =0;
//		
//		for(int year = 0; year < score.length; year++) // 각 학년 별로 반복
//			for(int term = 0; term < score[year].length; term++) // 각 학년의 학기별로 반복
//				sum += score[year][term]; // 전체 평점 합
//		
//		int n = score.length; // 배열의 행 개수, 4
//		int m = score[0].length; // 배열의 열 개수, 2
//		System.out.println("4년 전체 평점 평균은 "+ sum / (n*m));
//		
		
		
		
		
		
//		enum Week{월, 화, 수, 목, 금, 토, 일}
//		int [] n = {1,2,3,4,5};
//		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
//		
//		int sum = 0;
//		for(int k : n) {
//			System.out.print(k + " "); //반복되는 k 값 출력
//			sum += k;
//		}
//		System.out.println("합은 " + sum);
//		
//		for (String s : names)
//			System.out.print(s + " ");
//		System.out.println();
//		
//		for(Week day : Week.values()) // 나열형.values()는 배열이므로 for each 사용 가능
//			System.out.print(day + " ");
//		System.out.println(Week.values().length); //  length 필드 사용가능

		
		
//		int intArray[] = new int[10]; //배열의 선언과 생성
//		int sum = 0;
//		
//		
//		
//		for(int i = 0; i <intArray.length; i++) {
//			intArray[i] = (int)(Math.random() * 10 + 1); // 키보드에서 입력받은 정수 저장
//		    sum += intArray[i];
//		    System.out.print(intArray[i]+ " ");
//		}
//			
//		
//		System.out.print("\n평균은 " + (double)sum / intArray.length);
		
		
		
		
//		int intArray[] = new int[5]; //배열 생성
//		int n;
//		
//		do {
//			System.out.print("자연수 입력 : ");
//			n = scan.nextInt();	
//		}while(n<1);
//											//int max = 0; // 현재 가장 큰 수
//		
//		
//		System.out.println("정수 " + n + " 개를 입력하세요.");
//		
//		
//		int max = 0;
//		
//	    for(int i =0; i<n; i++) {
//	    	
//			intArray[i] = scan.nextInt(); // 입력받은 정수를 배열에 저장
//			if(intArray[i]>intArray[max])  // intArray[i]가 현재 가장 큰 수보다 크면
//			 max = i;// max를 i로 변경
//			
//			
//			
//		}
//		
//		System.out.print("가장 큰 수는 " + intArray[max] + "입니다.");
	}

}
