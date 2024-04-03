package KHS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int STUDENTS = 3;
        final int SUBJECTS = 2; 

        
        int[][] scores = new int[STUDENTS][SUBJECTS];

        System.out.println("--------------------------------------------");
		for (int i = 0; i < STUDENTS; i++) {
            for (int j = 0; j < SUBJECTS; j++) {
                while (true) {
                    try {
                        System.out.print("학생" + (i + 1) + " 과목" + (j + 1) + " 점수: ");
                        scores[i][j] = Integer.parseInt(scan.nextLine());
                        break; 
                    } catch (NumberFormatException e) {
                        System.out.println("다시 입력하세요.");
                    }
                }
            }
        }

        // 입력 받은 점수와 학생별 평균 출력
        
        System.out.println("\n");
        for (int i = 0; i < STUDENTS; i++) {
            int sum = 0;
            System.out.print("학생" + (i + 1) + ": ");
            for (int j = 0; j < SUBJECTS; j++) {
                System.out.print(scores[i][j] + " ");
                sum += scores[i][j];
            }
            double average = (double) sum / SUBJECTS;
            System.out.println("평균 = " + average);
        }	
        System.out.println("--------------------------------------------");
	}
	
}

		
		
		
		
		
		
		
		
		
	


