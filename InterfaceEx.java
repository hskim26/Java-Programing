package KHS;

interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();	// public abstract 생략
	void receiveCall(); // public abstract 생략
	default void printLogo() {	// public 생략
		System.out.println("** Phone **");
	}
}

interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자 갑니다.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요.");
	}
	
	
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	
	

	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}



//class SamSungPhone implements PhoneInterface{
//	@Override
//	public void sendCall() {
//		System.out.println("띠리리리링");
//	}
//	
//	@Override
//	public void receiveCall() {
//		System.out.println("전화기 왔습니다.");
//	}
//	
//	public void flash() {
//		System.out.println("전화기에 불이 켜졌습니다.");
//	}
//}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
				
		
		
//		PhoneInterface p = new SamSungPhone(); // interface 참조는 ... 구현한 객체를 가리킬 수 있음
//		
//		p.printLogo();
//		p.sendCall();
//		p.receiveCall();
//		// p.flash();
//		
//		
//		SamSungPhone phone  = new SamSungPhone();
//		phone.printLogo();
//		phone.sendCall();
//		phone.receiveCall();
//		phone.flash();
	}

}
