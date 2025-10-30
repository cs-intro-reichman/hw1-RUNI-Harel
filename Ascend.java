// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int maxNumToGenerate = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * maxNumToGenerate);
		int b = (int) (Math.random() * maxNumToGenerate);
		int c = (int) (Math.random() * maxNumToGenerate);
		System.out.println(a + " " + b + " " + c);
		int maxABC = Math.max(a, Math.max(b, c));
		int minABC = Math.min(a, Math.min(b, c));
		int midABC = a + b + c - maxABC - minABC;
		System.out.println(minABC + " " + midABC + " " + maxABC);
	}

}
