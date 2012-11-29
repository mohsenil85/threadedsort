
public class Main {
	public static void main(String [] args){
		
		Integer[] testArr = ArrUtils.creatArr(10);
		
		System.out.println("BEFORE");
		ArrUtils.printArr(testArr);
				
		Quicksort.sort(testArr);
		System.out.println("AFTER");
		ArrUtils.printArr(testArr);
	}
	
}
