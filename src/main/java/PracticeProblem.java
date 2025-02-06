import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		//Get a string using "In: " as the prompt. Output the first character of the string.
		//Get a boolean using "In: " as the prompt. Output the opposite boolean.
		//Get an integer using "In: " as the prompt. Output true if the number is greater than 5. False otherwise.
		//Get a double using "In: " as the prompt. Output true if the number is between -2 and 2 (inclusive). False otherwise.
		//Get a String using "In: " as the prompt. Output true if the string is "Hello World". False otherwise
		//Get 2 integers using "In: " as the prompt. Output true if the first integer is less than or equal to the second. False otherwise.
		//Get 2 doubles using "In: " as the prompt. Output true if the first integer is greater than the second. False otherwise.
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		String text;
		System.out.print("In: ");
		text = in.nextLine();
		System.out.print(text.charAt(0)+"\n");
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		boolean test;
		System.out.print("In: ");
		test = in.nextBoolean();
		in.nextLine();
		System.out.print(!test+"\n");

	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int greater;
		greater = in.nextInt();
		boolean out = (greater > 5);
		System.out.print(out+"\n");

		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double numDoub;
		numDoub = in.nextDouble();
		boolean outAgain = (numDoub <= 2);
		boolean outPut = (numDoub >= (-2));
		System.out.print((outPut && outAgain) + "\n");
		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String textAgain;
		textAgain = in.nextLine();
		boolean tester = ("Hello World" .equals(textAgain));
		System.out.print(tester + "\n");
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int numA, numB;
		numA = in.nextInt();
		System.out.print("In: ");
		numB = in.nextInt();
		boolean compare = (numA <= numB);
		System.out.print(compare + "\n");
		
	}

	public static void q7() {
		//Write question 7 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double dA, dB;
		dA = in.nextDouble();
		System.out.print("In: ");
		dB = in.nextDouble();
		boolean testAgain = (dA > dB);
		System.out.print(testAgain + "\n");
		
	}

}
