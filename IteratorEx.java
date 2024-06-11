package KHS;
import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100); // 인덱스 2자리에 삽입
		
		Iterator<Integer> it = v.iterator(); // Iterator를 이용한 모든 정수 출력하기
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		int sum = 0;		// Iterator를 이용하여 모든 정수 더하기
		it= v.iterator();	// Iterator 객체 얻기, 첫 번째 요소를 가리킴
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " +sum);
	}

}
