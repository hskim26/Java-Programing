package KHS;

class Person{
	
	private int weight;
	int age;
	protected int height;
	public String name;
	public void setWeight(int weight) {	this.weight = weight; }
	public int getWeight() {return weight; }
	
	public Person() {System.out.println("Person()");} // ***추가***
}

class Student extends Person {
	public void set() {
		age = 30;		// 슈퍼클래스의 디폴트 멤버 접근 가능 : 같은 패키지
		name = "홍길동";	// 슈퍼클래스의 public 멤버 접근 가능
		height = 175;	// 슈퍼클래스의 protected 멤버 접근 가능 : 상속(+ 같은 패키지)
		setWeight(99);	// weight은 setWeight()으로 간접 접근
	}
	
	public Student() { System.out.println("Student()"); }
	
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.set();
	}

}
