// Read in a number N and outputs the distance between the closet prime number
// And the prime number that precedes it

import java.util.Scanner;

public class PrimeQuestion {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		System.out.println((nextPrime(str))-(prevPrime(str)));
		sc.close();
		
	}
	public static int nextPrime(int x){
		x++;
		for(int i = 2;i<x;i++){
			if(x%i==0){
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
		x--;
		for(int i = 2;i<x;i++){
			if(x%1==0){
				x--;
				i=2;
			}
			else{
				continue;
			}
		}
		return x;
	}
	
}
