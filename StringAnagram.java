/* Check if two given String is Anagram of each other
 * Your function should return true if two Strings are Anagram, false otherwise
 */

import java.util.*;

public class StringAnagram {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("First word: " + str);
		String srt = sc.nextLine();
		System.out.println("Second word: " + srt);
		System.out.println(check(str,srt));
	}
	
	public static boolean check(String x, String y){
		if(x.length() =! y.length()){
			return false;
	}
		else{
			
		}
			
	}
	
}
