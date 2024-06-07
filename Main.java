package KHS;

import java.util.ArrayList;
import java.util.Scanner;

// Step 1: SoundMaker interface
interface SoundMaker {
    void sound();
}

// Step 2: SoundMaker 인터페이스를 구현하는 Animal 추상클래스
abstract class Animal implements SoundMaker {
    private int weight; // 반드시 private으로 지정

    public Animal(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "weight = " + weight;
    }
}

// Step 3: Animal을 상속받는 Dog 클래스
class Dog extends Animal {
    public Dog(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Dog, " + super.toString();
    }

    @Override
    public void sound() {
        System.out.print("Bow-wow");
    }
}

// Step 4: Animal을 상속받는 Cat 클래스
class Cat extends Animal {
    public Cat(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Cat, " + super.toString();
    }

    @Override
    public void sound() {
        System.out.print("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("1.Add, 2.Remove, 3.Show all, 4.Make them sound, 5.Exit");
            System.out.print("Choose a number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1.Dog, 2.Cat");
                    System.out.print("Choose a number: ");
                    int type = scanner.nextInt();
                    System.out.print("Enter weight: ");
                    int weight = scanner.nextInt();
                    if (type == 1) {
                        animals.add(new Dog(weight));
                    } else if (type == 2) {
                        animals.add(new Cat(weight));
                    }
                    break;

                case 2:
                    System.out.print("Enter an index to remove (0~" + (animals.size() - 1) + "): ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < animals.size()) {
                        animals.remove(index);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    for (Animal animal : animals) {
                        System.out.println(animal.toString());
                    }
                    break;

                case 4:
                    for (Animal animal : animals) {
                        animal.sound();
                        System.out.println();
                    }
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
