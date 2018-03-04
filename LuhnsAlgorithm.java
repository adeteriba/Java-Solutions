/*
 * 
 * The Luhn's Algorithm is used to distinguish valid credit card numbers.

	The Algorithm works as follows: 
	

 */

import java.util.*;
public class LuhnsAlgorithm {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        sc.close();
        int total=0;

        for(int i=0;i<number.length()-1;i++){
            int digit = Integer.parseInt(""+number.charAt(number.length()-i-2));

            if(i%2==0){
                digit=digit*2;
            }
            if(digit>9){
                digit=digit-9;
            }
            total+=digit;
        }
        if((total+Integer.parseInt(""+number.charAt(number.length()-1)))%10==0){
            System.out.println("VALID");
        }else{

            System.out.println("INVALID");

        }
    }

}
