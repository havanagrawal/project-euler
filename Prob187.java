/*1) n is composite.
 *2) For every factor i, there is another factor n/i.
 */
//from 1 to 1001, ans=299
//from 1 to 10001, ans=2625
//from 1 to 100001, ans=23378
//from 1 to 1000001, ans=210035
//from 1 to 10000001, ans=1904324
class Prob187 {
	public static void main(String args[]) {

		int n=100000000;
		boolean isPrime[]=new boolean[n+1];
		
		int i, j;
		int count=0;
		
		int ans=0;
		
		for (i=2; i<=n; i++)
			isPrime[i]=true;
			
		for (i=2; i<=n; i++)
			if (isPrime[i]) {
				count++;
				for (j=2*i; j<=n; j+=i)
					isPrime[j]=false;
			}
		
		int primes[]=new int[count];
		j=0;
		
		for (i=2; i<=n; i++)
			if (isPrime[i]) {
				primes[j]=i;
				j++;
			}
		
		for (i=0; i<count; i++)	{
			for (j=i; j<count; j++)
				if (primes[i]*primes[j]<n)
					ans++;
		}
		System.out.println(ans);
	}
}