// x^2 - Dy^2 = 1
// x^2 - 1 = Dy^2
// y^2 = (x^2 - 1)/D
// x^2 - 1 must be divisible by D
// Further, it must be a perfect square multiple of D
// i.e. D, 4D, 9D, 16D...

// If a certain value of x satisfies the equation for a certain D
// Then it will satisfy the equation for all perfect square multiples of D as well
// Square multiples of D must be less than x^2

// Max x till now: 130576328 (D = 343)
// Max x till now: 263091151 (D = 742)

// Too large to solve using longs
// Solution found using
// http://oeis.org/A000037/b000037.txt (nth non-square)
// http://oeis.org/A033313/b033313.txt (value for minimal x)
import java.util.Hashtable;

class Prob066 {
	public static void main(String args[]) {
		Hashtable<Long, Boolean> squares = new Hashtable<>();
		long start, end, sq_gen, search;
		
		int n = 1000;
		
		long x, y, i;
		long lim = (long)(10000000);
		int j, D;
		
		// Count is n - 1 because we start searching from D = 2
		int count = n - 1;
		
		// found[D] is true if a minimal value for D has been found, else false
		boolean[] found = new boolean[n + 1];
		
		// Generate all squares and store them in hash table
		start = System.currentTimeMillis();	
		for (i = 0; i < lim; i++) {
				squares.put(i * i, true);
		}
		end = System.currentTimeMillis();
		sq_gen = end - start;
		
		// Iterate over x, lower to higher
		// Any solution found ensures that it has occurred for the first time
		// Hence is for minimal x
		
		start = System.currentTimeMillis();
		for (x = 2; count != 0; x++) {
			for (D = 2; D <= n; D++) {
				// If solution for D has not been found yet AND
				// x^2 - 1 is divisible by D AND
				// (x^2 - 1)/D is a perfect square
				if (!found[D] && (x * x % D) == 1 && squares.get(((x * x - 1)/ D)) != null) {
					for (j = 1; j * j * D < x * x && j * j * D <= n; j++) {
						found[j * j * D] = true;
						count--;
					}
					System.out.println(count + "\t" + x + "\t" + D);
				}
			}
		}
		end = System.currentTimeMillis();
		search = end - start;
		
		System.out.println("Time to generate squares: " + sq_gen);
		System.out.println("Time to search for max x: " + search);
		System.out.println("Total time: " + (sq_gen + search));
	}
}