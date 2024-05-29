package KHS;

abstract class Calc{
	int a,b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract public int calculate(); // 추상 메소드 
}

class Add extends Calc{
	@Override
	public int calculate() {  // 추상클래스 override
		return a + b;
	}
}

class Sub extends Calc{
	@Override
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc{
	@Override
	public int calculate() {
		return a * b;
	}
}

class Div extends Calc{
	@Override
	public int calculate() {
		return a / b;
	}
}
public class CalcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x, y;
//		Add add = new Add();
//		add.setValue(1,2);
//		System.out.println(add.calculate());
		
//		int x, y;
//		Sub sub = new Sub();
//		sub.setValue(1,2);
//		System.out.println(sub.calculate());

//		int x, y;
//		Mul mul = new Mul();
//		mul.setValue(1,2);
//		System.out.println(mul.calculate());
//		
//		int x, y;
//		Div div = new Div();
//		div.setValue(2,1);
//		System.out.println(div.calculate());
		
		
	}

}
