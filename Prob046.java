//What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
//Ans:5777

class Prob046 {
	
	public static boolean isSquare(int k) {
		int p = (int)Math.sqrt(k);
		
		return p*p==k?true:false;
	}

	public static void main(String args[]) {
	
		int n=1000000;		//Size
		int t=0;
		
		int i, j, k;
		
		boolean isPrime[] = new boolean[n];
		boolean found=false;
		int primes[]=new int[n];
		
		for (i=0; i<n; i++)
			isPrime[i]=true;
			
		for (j=2; j<n; j++)
			if (isPrime[j]==true)
				for (k=2*j; k<n; k+=j)
					isPrime[k]=false;
					
		for (int l=2; l<n; l++)
			if (isPrime[l]==true)
			{
				primes[t]=l;
				t++;
			}
			
		for (i=9; i<n; i+=2) {
			found=false;
			if (isPrime[i]==false) {
				for (j=0; primes[j]<i && found==false; j++)
					if (isSquare((i-primes[j])/2))
						found=true;
				
				if (found==false)
					System.out.println(i);
			}
		}
		
	}
}