package KHS;
import java.util.*;
class Location{
	private String city;
	private int lat, lon;
	
	public Location(String c, int la, int lo) {
		this.city = c;
		this.lat = la;
		this.lon = lo;
	}
	public String getCity() {
		return city;
	}
	public int getLat() {
		return lat;
	}
	public int getLon() {
		return lon;
	}
}
// 4개 쌍을 put으로 삽입 : 서울 37 126, LA 34 -118, 파리 2 48, 시드니 151 -33
// 모든 도시 출력은 안함
// 도시 이름 입력받아 위도, 경도 출력
// 도시가 없으면 없음, 도시이름에 exit 입력하면 프로그램 종료

public class Chap07Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Location> loc = new HashMap<String, Location>();
		Scanner scanner = new Scanner(System.in);

		Location S = new Location("서울", 37, 126);
		Location L = new Location("LA", 34, -118);
		Location P = new Location("파리", 2, 48);
		Location SY = new Location("시드니", 151, -33);
		
		loc.put("서울", S);
		loc.put("LA", L);
		loc.put("파리", P);
		loc.put("시드니", SY);
		
		while(true) {
			System.out.print("도시이름 >>");
			String city = scanner.next();
			if(city.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			Location name = loc.get(city);
			if(name == null)
				System.out.println(city + "는 없습니다.");
			else
				System.out.println(name.getCity() + " " + name.getLat() + " " + name.getLon());
			
		}
	}

}
