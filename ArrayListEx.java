package KHS;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next();
			a.add(s);
		}
		
		for(int i =0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		// 문제 : 실수 4개를 입력받아 ArrayList에 삽입 후 모든 실수값 출력
		ArrayList<Double> d = new ArrayList<Double>();
		for(int i =0; i<4; i++) {
			double b = scanner.nextDouble();
			d.add(b);
		}
//		for(int i =0; i<a.size(); i++) {
//			double s  = d.get(i);
//			System.out.println(s);
//		}
		
		int longestIndex = 0;
		for(int i = 0; i<a.size(); i++)
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		System.out.println("\n 가장 긴 이름은 : " + a.get(longestIndex));
		scanner.close();
		
		
		
		
		
		
		
		
		
	}

}
