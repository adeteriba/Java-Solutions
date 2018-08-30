/*
Enter a number and have the program generate PI up to that many decimal places. 
*/

import java.util.*;
import java.math.BigDecimal;

public class PI {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of digits you want after the decimal for Pi: ");
		int x = sc.nextInt();
		BigDecimal y = new BigDecimal(7.0);
		BigDecimal pi = new BigDecimal(22.0).divide(y, x, BigDecimal.ROUND_UP);
		
		if (x<1 || x>100){
			System.out.println("Invalid Entry");
		}else{
			System.out.println(pi);
		}
		sc.close();
	}
}
