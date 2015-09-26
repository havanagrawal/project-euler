/*
 * a + b + c <= 1_500_000
 */

import java.util.*;

class PythagoreanTriple implements Comparable{
	long a;
	long b;
	long c;
	
	PythagoreanTriple(long a, long b, long c) {
		assert(a*a + b*b == c*c);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	PythagoreanTriple multiply(long k) {
		return new PythagoreanTriple(k * a, k * b, k * c);
	}
	
	long length() {
		return a + b + c;
	}
	
	public String toString() {
		return "(" + a + ", " + b + ", " + c + ")";
	}
	
	public int compareTo(Object o) {
		PythagoreanTriple p = (PythagoreanTriple)o;
		
		return (int)(this.length() - p.length());
	}

	public int hashCode() {
		return ("" + a + b + c).hashCode();
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof PythagoreanTriple)) {
			return false;
		}
			
		PythagoreanTriple p = (PythagoreanTriple)o;
		if (p.a == a && p.b == b && p.c == c) {
			return true;
		}
		return false;
	}
	
}

class Prob075 {
	
	static Set<PythagoreanTriple> st = new TreeSet<>();
	public static final long limit = 1_500_000;
	
	public static void generateTriples(long a, long b, long c) {
		if (a + b + c > limit) {
			return;
		}
		else {
			PythagoreanTriple A = new PythagoreanTriple(a - 2*b + 2*c,
														2*a - b + 2*c,
														2*a - 2*b + 3*c);
														
			PythagoreanTriple B = new PythagoreanTriple(a + 2*b + 2*c,
														2*a + b + 2*c,
														2*a + 2*b + 3*c);
														
			PythagoreanTriple C = new PythagoreanTriple(-a + 2*b + 2*c,
														-2*a + b + 2*c,
														-2*a + 2*b + 3*c);
														
			st.add(A);
			st.add(B);
			st.add(C);
			generateTriples(A.a, A.b, A.c);
			generateTriples(B.a, B.b, B.c);
			generateTriples(C.a, C.b, C.c);
		}
	}
	
	public static void main(String args[]) {
		
		st.add(new PythagoreanTriple(3, 4, 5));
		generateTriples(3, 4, 5);
		
		Map<Long, Integer> freq = new TreeMap<Long, Integer>();
		
		for (PythagoreanTriple p : st) {
			long len = p.length();
			for (int i = 1; i*len <= limit; i++) {
				long t = i*len;
				
				if (freq.containsKey(t)) {
					freq.put(t, freq.get(t) + 1);
				}
				else {
					freq.put(t, 1);
				}
			}
		}
		int count = 0;
		for (Long len : freq.keySet()) {
			if (freq.get(len) == 1) {	
				count++;
			}
		}
		System.out.println(freq.size() + "\t" + count);
	}
}