package KHS;
import java.io.*;
import java.util.*;

class Point implements Serializable {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

class Circle implements Serializable {
	private Point center;
	private int radius;

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("center = ");
		sb.append(center.toString());
		sb.append(", radius = ");
		sb.append(radius);
		return sb.toString();
	}
}

public class ObjectStreamEx {
	public static void main(String[] args) {
		try {
			Circle c1 = new Circle(new Point(10, 20), 100);
			
			int[] array1 = {1, 2, 3, 4, 5};
			ArrayList<Integer> list1 = new ArrayList<>();
			list1.add(10);
			list1.add(20);
			list1.add(30);
			
			// Writing objects to file
			FileOutputStream fos = new FileOutputStream("test.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c1);
			oos.writeObject(array1);
			oos.writeObject(list1);
			oos.close();
			
			// Reading objects from file
			FileInputStream fis = new FileInputStream("test.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Circle c2 = (Circle) ois.readObject();
			int[] array2 = (int[]) ois.readObject();
			ArrayList<Integer> list2 = (ArrayList<Integer>) ois.readObject();
			ois.close();
			
			System.out.println(c2.toString());
			
			for (int i : array2) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			for (int i : list2) {
				System.out.print(i + " ");
			}
			System.out.println();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
