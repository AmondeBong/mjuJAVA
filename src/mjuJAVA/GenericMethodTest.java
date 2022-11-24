package mjuJAVA;

import java.util.*;

public class GenericMethodTest {
	
	public static <T> void printArray(T[] array) {
		
		T s1;
		List<T> list1 = Arrays.asList(array);
		Iterator e1 = list1.iterator();
		
		while(e1.hasNext()) {
			s1 = (T)e1.next();
			System.out.println(s1);
		}
	}
	
	public static void main(String[] args) {
		Integer[] i = {10,20,30,40,50};
		String a[] = new String[] {"A","B","C","D","E"};
		List<String> list = Arrays.asList(a);
		
		printArray(i);
		printArray(a);
		
	}
}
