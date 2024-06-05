package KHS;

import java.util.Vector;
abstract class Animal{
	private int weight;
	public Animal(int w) {weight = w;}
	public int getWeight() {return weight;}
	public void sound() {System.out.println("...");}
}
class Dog extends Animal{
	private String breed;
	public Dog(String b, int w) {
		super(w);
		breed = b;
	}
	@Override
	public void sound() {System.out.println("멍멍");}
}

class Cat extends Animal{
	private String color;
	public Cat(String c, int w) {
		super(w);
		color = c;
	}
	@Override
	public void sound() {System.out.println("야옹");}
}

public class AnimalEx {	
	public static void soundAnimal(Vector<Animal> v) {
		for(int i = 0; i<v.size(); i++) {
			Animal a = v.get(i);  // upcasting
			a.sound();			  // dynamic binding(호출한 메소드를 runtime에 결정) 
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal a = new Animal(30);  추상 클래스 instance 생성 불가
		Vector<Animal> v = new Vector<Animal>();
		v.add(new Dog("잡종", 20));
		v.add(new Cat("누렁", 5));
		soundAnimal(v);
		
		}
		
	}

