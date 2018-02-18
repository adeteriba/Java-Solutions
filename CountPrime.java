// Enter a number and find the distance between the prime number after it and the prime number before it

import java.util.*;

public class CountPrime {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		System.out.println(nextPrime(str)-prevPrime(str));
		sc.close();
	}
	public static int nextPrime(int x){
		x++;
		for(int i = 0;i<x;i++){
			if(x%1==0){
				x++;
				i=2;
			}
			else{
				continue;
			}
		}
		return x;
	}
	
	public static int prevPrime(int x){
		x++;
		for(int i = 0;i<x;i++){
			if(x%1==0){
				x++;
				i=2;
			}
			else{
				continue;
			}
		}
		return x;
	}

}
