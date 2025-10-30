// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int number = Integer.parseInt(args[0]); //0<=number<=999
		int hundreds = (number % 1000) / 100;
		//int hundreds = number / 100; //Iproved it
		int tens = (number % 100) / 10;
		int units = number % 10;
		int[] numWordArray = new int[3];
		numWordArray[0] = hundreds;
		numWordArray[1] = tens;
		numWordArray[2] = units;
		System.out.print(numWordArray[0] + " hundreds, " +
		 					numWordArray[1] + " tens, and " +
							numWordArray[2] + " ones.");
	}
}
