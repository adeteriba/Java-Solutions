// A stack is a data structure 
import java.util.*;

public class BalancedBraces {
	
	private int maxSize;		// Size of the stack
	private Object[] stackArray;
	private int top;		// Top of the stack we created
	
	public BalancedBraces(int x){	//This is used as the constructor
		maxSize = x;		// Used to set the size of the array
		stackArray = new Object[maxSize]; // Used to create the array
		top = -1;	// There is not items on the sack yet
	}
	
	// Initializing the stack methods/functions
	public void push(Object x){		// Put the item on top of the stack
		top++;
		stackArray[top] = x;
	}

    public Object pop() {		// Take a item away from the stack
          return stackArray[top--]; // access item, decrement top
    }


    public Object peek() {		// Used to peek at the top of the stack
          return stackArray[top];
    }

    public boolean isEmpty() {		//Return true is the stack is empty
          return (top == -1);
    }
    
    public boolean isFull() { // Returns true f the stack is full
          return (top == maxSize - 1);
    }
    
    public static void main(String[]args){
    	System.out.println("Enter the braces");
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	//System.out.println("Enter the braces");
    	System.out.println(parenthesesMatching(str));
    	sc.close();
}

	public static boolean parenthesesMatching(String string){
		byte[][] braces = { { '{', '}' }, { '[', ']' }, { '(', ')' } };
		char b1;
		char b2;
		
		BalancedBraces theBalancedBraces = new BalancedBraces(20);
		
		for (int i = 0; i < string.length(); i++) {

            b1 = string.charAt(i);

            // The opening brackets are placed on a stack
            if (b1 == '{' || b1 == '(' || b1 == '[' || b1 == '<') {
            	theBalancedBraces.push(b1);
            }
         
            // When the program comes across a closing bracket it pops from
            // the ‘opening bracket stack’ and this should match

            if (b1 == '}' || b1 == ')' || b1 == ']' || b1 == '>') {

                 if (theBalancedBraces.isEmpty())
                       return false;
                 b2 = (char) theBalancedBraces.pop();
                 switch (b2) {
                 case '{':
                       if (b1 != '}')

                            return false;

                       break;

                 case '(':

                       if (b1 != ')')

                            return false;

                       break;

                 case '[':

                       if (b1 != ']')

                            return false;

                       break;

                 case '<':

                       if (b1 != '>')

                            return false;

                 }
            }
		}
		return theBalancedBraces.isEmpty();

	}
	static String[] braces(String[] values) {
	        String[] res = new String[values.length];
	        for (int i = 0; i < values.length; i++) {
	        	res[i] =  parenthesesMatching(values[i]) ? "YES": "NO";
	        }
	        return res;
		}
	}

