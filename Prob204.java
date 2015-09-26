//Ans: 2944730
class Prob204 {
	public static void main(String args[]) {
		
		int n=1000000000;
		int i, k;
		int p=0;
		int count=0;
		int primes[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		long start = System.currentTimeMillis();
		
		for (i=1; i<=n; i++) {
			k=i;
			p=0;
			while (k>100 && p<primes.length) {
				while (k>100 && k%primes[p]==0)
					k/=primes[p];
					
				p++;
			}
			if (k<=100)
				count++;
		}
		long end = System.currentTimeMillis();
		System.out.println("The answer is: "+count);
		System.out.println("Exec time: "+(end-start));
	}
}