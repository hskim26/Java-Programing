package KHS;
import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
	
		// 이름과 점수 HashMap
		HashMap<String,Integer> scoreMap = new HashMap<String, Integer>();
		
		// 5개의 점수 저장
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 :"+ scoreMap.size());
		
		Set <String> keys = scoreMap.keySet();  //key 문자열을 가진 집합 Set 컬렉션
		ArrayList<String> keyList = new ArrayList<String>(keys);	// List를 만듦
		Collections.sort(keyList);			// static 메소드		    // List 정렬
		Iterator <String> it = keyList.iterator();	// 문자열을 순차 접근하는 Iterator
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
		
		
	}

}
