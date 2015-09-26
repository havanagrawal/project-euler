/*
rad(n) is multiplicative (though not completely multiplicative), which means that:
rad(ab)=rad(a)*rad(b), iff GCD(a,b)=1.												(1)
Since we have GCD(a, b)=GCD(a, c)=GCD(b, c)=1,
rad(abc)=rad(a)*rad(b)*rad(c)
*/

/*Best case till now:
The answer is: 541276
Exec time: 27531
*/
class Prob127
{
	public static int GCD(int i, int j)
	{
		while (i!=0 && j!=0)
		{
			if (i>j)
				i%=j;
			else
				j%=i;
		}

		if (j==0)
			return i;
			
		return j;
	}

	public static void main(String args[])
	{
	
		int a, b, c=3;
		int rad;
		
		int limit=120000;
		
		int sum=0;				
		int i, j, k=0;
		
		long start = System.currentTimeMillis();
		
		//Get all primes below 120000
		
		boolean isPrime[]=new boolean[150000];
		int primes[] = new int[15000];
		
		for (i=0; i<120000; i++)
			isPrime[i]=true;
			
		for (i=2; i<120000; i++)
		{
			if (isPrime[i]==true)
			{
				for (j=i; j<120000; j+=i)
					isPrime[j]=false;
					
				primes[k]=i;
				k++;
			}
		}
		
		//The main algorithm
		
		for (c=3; c<limit; c++)
		{				
			for (a=1; a<=c/2; a++)
			{
				b=c-a;
				//n=a*b*c;
				if (GCD(a, b%a)==1)
				{
					rad=1;
					
					//rad(n)=rad(abc)=rad(a)*rad(b)*rad(c)
					
					for (int p=0; primes[p]<=c; p++)
					{
						//primes[p] will divide either a or b or c but not both or all three of them. (1)

						if (c%primes[p]==0 || b%primes[p]==0 || a%primes[p]==0)
							rad*=primes[p];
							
						if (rad>=c)
							break;
					}

					if (rad<c)
					{
						//System.out.println(a+"\t"+b+"\t"+c+"\t"+rad);
						sum+=c;
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		
		System.out.println("The answer is: "+sum);
		System.out.println("Exec time: "+(end-start));
	}
}