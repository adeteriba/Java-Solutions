//Reverse the inputted array

import java.util.*;

public class ReverseArray {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		for(int i = 0;i<array.length;i++){
			array[i] = sc.nextInt();
		}
		System.out.println("The inputted array: " + Arrays.toString(array));
		System.out.println("The array in reverse order : " + Arrays.toString(arraybackwards(array)));
	}
	
		//To reverse an int array, you swap items up until you reach the midpoint
		public static int[] arraybackwards(int[] x){
			for(int i = 0;i<x.length/2;i++){
				int str = x[i];
				x[i] = x[x.length - i - 1];
				x[x.length - i - 1] = str;	
			}
			return x;
		}
	}
