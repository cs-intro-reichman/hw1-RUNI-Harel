// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		//futureValue = currentValue ⋅ (1 + rate)!
		String currentValue = args[0]; // >=0
		String rate = args[1];; //(an integer between 0 and 100, inclusive)
		String n = args[2];; // >=0

		int IntcurrentValue = Integer.parseInt(currentValue);
		Double doubleRate = Double.parseDouble(rate);
		int Intn = Integer.parseInt(n);
		Double futureValue = IntcurrentValue * Math.pow((1 + doubleRate/100), Intn);
		int intFutureValue = (int) Math.floor(futureValue);
		System.out.printf("After %d years, $%d saved at %.1f%% will yield $%d%n", Intn, IntcurrentValue, doubleRate, intFutureValue);
		//System.out.printf("After %a years, $%b saved at %c% will yield $%d", n, currentValue, rate, futureValue);
	}
}