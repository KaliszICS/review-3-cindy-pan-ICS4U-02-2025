

class Notes {
	public static void main(String[] args) {
		
		//char

		char c;
		c = 'a'; //it uses single quotes not double quotes like String

		//String.charAt(index)

		String word;
		word = "Hello";
		System.out.println(word.charAt(0));

		//indexes start at 0, and end at 1 less than the length of the string

		//Errors and Exceptions

		//Syntax Errors - Errors for the "spelling and grammar" of coding
		//Runtime Errors - Errors that happen due to a value
		//Logical Errors - Error where your program has an unexpected result

		//Syntax Errors - The errors happen during compilation, in other words, your code does not run at all

		//Spelling mistakes, missing brackets, semi-colons, other symbols
		// in num;
		//Look at the line number and the error for information


		//Runtime - These errors happen during execution (after compiling)

		//division by 0
		//wrong data types - scanner

		// System.out.println(5/0);
		//Line number for the error
		//An exception, potentially with more information

		//Logical Errors - Unexpected result

		//similar variables, use the wrong one
		//wrong symbols/operators
		//order of operations

		// Booleans

		//comparison - work on any primitive type, that isn't a boolean mostly
		// equals (==), not equals(!=), greater than (>), less than (<), greater than OR equals to(>=), less than OR equal to (<=)
	
		System.out.println(7 < 5);
		System.out.println(5 < 7);

		System.out.println(5 < 5);
		System.out.println('a' < 'c');
		System.out.println('Z' < 'a'); //characters are compared by their ASCII values
		
		//compare NON-primtive values - strings

		System.out.println("hello".equals("bye"));
		System.out.println(!"hello".equals("bye")); //NOT the whole result
	
		//AND OR and NOT
		
		//combining booleans
		//AND - &&, both booleans on either side are true, the result will be true
		//any other combination of booleans results in a false

		System.out.println(true && true);
		System.out.println(7 < 9 && 7 < 10);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		//OR - ||, one of the two booleans, or both are true, the result is then true
		//It is only false, when both booleans on either side are false

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		//NOT - !, swaps the booleans value
		System.out.println(!true); 
		System.out.println(!false);
		// true == true
		// true == false
		// false == false
		// false == true

		//ORDER OF OPERATION of booleans
		//NOT -> AND -> OR

		System.out.println(true || false && !true);
		// true || false && false
		// true || false
		// true

		//change the order of operations using brackets
	}
}
