package KHS;

class Person {
	String name, id;
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	String grade, dept;
	public Student(String name) {super(name);}
}




public class UpcastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student("Kim");  // 업캐스팅
		Student s = new Student("Lee");
		p = s; // 업캐스팅
		
		System.out.println(p.name);
		
		//p.grade = "A"; //컴파일 오류
		//p.dept = "CS";
		
		//s.grade = "A"; 업캐스팅
		//s.dept = "CS"; 업캐스팅
		
		if(p instanceof Student) {
		Student t = (Student)p; // 다운캐스팅
		
		t.grade = "A";
		t.dept = "CS";
		}
		
		Person q = new Person("Park");  // 다운캐스팅 실패 사례
		
		if(q instanceof Student) {
		Student u = (Student)q;
		u.grade = "A";
		u.dept = "CS";
		}
		
		
		
	}

}
