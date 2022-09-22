package mjuJAVA;

public class ArrayTest1 {
	public static void main(String[]args) {
		int [] arr1 =  new int[10];
		int [] arr2;
		arr2 = new int[10];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = i;
			arr2[i] = i*2;
		}
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]+" ");
			System.out.println(arr2[j]);
		}
		System.out.println("");
		
		int [] numbers = {10,20,30,40,50};
		for(int value: numbers) { //for(배열의 변수:배열의 이름)
			System.out.print(value+" ");
		}
		System.out.println("");
		
		String[] pizza = {"Pepperoni", "Mushrooms", "Onions" ,"Sausage", "Bacon"};
		for(String topping: pizza) {
			System.out.print(topping+" ");
		}
	}
}

