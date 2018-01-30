//To find the mode, first put the numbers in order, then count how many of each number. 
//A number that appears most often is the mode.

import java.util.*;

public class Mode {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] array = new int[5];
	for(int i = 0; i<5;i++){
		array[i] = sc.nextInt();
	}
	
	int record = 0;
	int recordnumber = 0;
	for(int k= 0; k<5;k++){
		int count = 0;
		for(int j = 0;j<5;j++){
			if(array[k] == array[j])
				count++;
		}
		if(count>record){
			record=count;
			recordnumber = array[k];
			}
		}
		System.out.println(recordnumber);
	}
	
}
