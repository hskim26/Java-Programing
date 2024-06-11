package KHS;
// MyArray<S>
// 원소 10개까지 add(item) 가능
//get(index)는 요소객체 리턴, 범위 벗어나면 null 리턴

class MyArray<S>{
	int tos;
	Object[] stck;
	public MyArray() {
		tos = 0;
		stck = new Object[10];
	}
	public void add(S item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++;	
		}
	public  S get(int index) {
		if(index < 0 || index > tos - 1)
			return null;
		tos--;
		return (S)stck[tos];
	}
}

//class GStack<T>{
//	int tos;
//	Object[] stck;
//	public GStack() {
//		tos = 0;
//		stck = new Object[10];
//	}
//	public void push(T item) {
//		if(tos == 10)
//			return;
//		stck[tos] = item;
//		tos++;
//	}
//	public T pop() {
//		if(tos == 0)
//			return null;
//		tos--;
//		return (T)stck[tos];
//	}
//}
public class MyStack {

	public static void main(String[] args) {
		MyArray<Integer> intArray = new MyArray<Integer>();
		
	
		for(int n = 1; n<=11; n++)
			intArray.add(n);
		for(int n = 0; n<11; n++) {
			Integer intObj = intArray.get(n);
			if(intObj != null)
				System.out.println(intObj);
		}
		
		
		
//		GStack<String> stringStack = new GStack<String>();
//		
//		stringStack.push("seoul");
//		stringStack.push("busan");
//		stringStack.push("LA");
//	
//		for(int n = 0; n<3; n++)
//			System.out.println(stringStack.pop());
//		
//		GStack<Integer> intStack = new GStack<Integer>();
//		
//		intStack.push(1);
//		intStack.push(2);
//		intStack.push(3);
//	
//		for(int i = 0; i<3; i++) {
//			System.out.println(intStack.pop());
//		}
//	
	
	}

}
