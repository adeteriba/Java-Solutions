// Code to creat a Vertcoin paper wallet
// Created a 64 digit hexadecimal string as my ECDSA private key


import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PrivateKey extends SHA256 {
	public static void main(String[]args) {
		Random random = new Random();
		String Hex = new String();
		String possibleChars = "0123456789ABCDEFG";
		
		for(int i = 0;i<64;i++){
			Hex += possibleChars.charAt(random.nextInt(15));
		}
		System.out.println("Original Hex String: " + Hex);
		System.out.println("");
		
		String Hex80 = 80 + Hex;
		System.out.println("Hex string with 80 added to the front: " + Hex80);
		
		SHA256 newSHA = new SHA256();
		System.out.println("");
		String sha = newSHA(newSHA.sha256(Hex80));
		System.out.println("SHA-256 computed: " + sha);
		for(int i =0;i<8;i++){
			Hex80 += sha.charAt(i);
		}
		
		System.out.println("");
		System.out.println(Hex80);	
		
	}

}
