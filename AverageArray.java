import java.util.*;

public class AverageArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		double result = 0;
		double sum = 0;
		
		for(int i = 0;i<5;i++){
			array[i] = sc.nextInt();
			sum = array[i]+sum;
			result = sum/5;
		}
		System.out.println("The average number in the array is " + result);
	}
	
}
