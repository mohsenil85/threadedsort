import java.util.Random;

public class ArrUtils {
	
	static Random generator = new Random();
	
	
	public static Integer[] creatArr(int size){
		Integer[] testArr = new Integer[10];
		
		for (int i = 0; i < testArr.length; i++){
			Integer bob = generator.nextInt(10);
			testArr[i]=bob;
		}
		return testArr;
	}
	
	
	public static  void printArr(Integer[] arr){
		
		System.out.print("[ ");
		for (Integer i: arr){
			System.out.print(i + " ");
		}
		System.out.print("]");
		System.out.println();
	
	}
}
