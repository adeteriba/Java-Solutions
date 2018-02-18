import java.util.*;
public final class ASCII {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String sentence = sc.nextLine();
		String binaryString=""; 
		sc.close();
		
		//To order to convert the inputed string to ASCII, go through each letter and cast it to an int
		for(int i=0; i < sentence.length(); i++){ 
			int decimalValue = (int)sentence.charAt(i);   
			//Integer.toBinaryString( ) is used to convert int to a binary string
			String binaryValue = Integer.toBinaryString(decimalValue);      
			for(int j=7;j>binaryValue.length();j--){
				binaryString+="0";           
			}
			binaryString += binaryValue+" "; 
			}
			System.out.println(binaryString);   
		
		// Prints out the result in binary
		System.out.println(binaryString);
		
		int[] array = new int[256];
		for(int i=0; i < sentence.length(); i++){    
			array[(int)sentence.charAt(i)]++;    
			}
		
		for(int i=0; i<array.length; i++){
			if(array[i]>0){ 
				System.out.println("'"+(char)i +"'  appeared  "+array[i]+" times");
			}
		}
	
	}
			
}
