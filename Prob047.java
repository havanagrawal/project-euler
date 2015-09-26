//Find the first four consecutive integers to have four distinct primes factors. What is the first of these numbers?

//Ans:134043

class Prob047
{
	public static void main(String args[])
	{
		
	
		int primes[] = new int[100000];
		boolean isPrime[]=new boolean[10000000];
		int x[] = new int[1000000];
		
		int i;
		int count=0;
		
		long start = System.currentTimeMillis();
		
		//Developing all primes (More than 100000 primes)
		for (i=0; i<isPrime.length; i++)
			isPrime[i]=true;
			
		for (i=2; i<isPrime.length; i++)
			if (isPrime[i]==true)
				for (int k=2*i; k<isPrime.length; k+=i)
					isPrime[k]=false;
					
		int k=2;
		i=0;			
		while (i!=primes.length)
		{
			if (isPrime[k]==true)
			{
				primes[i]=k;
				i++;
			}
			k++;
		}
		
		//for (i=0; i<primes.length; i++)
			//System.out.print(primes[i]+"\t");
		
		x[0]=0;
		x[1]=1;
		x[2]=1;
		
		//Counts no. of distinct prime factors

		for (int j=2; j<x.length; j++)
		{
			if (isPrime[j]==false)
			{
				int p=j;
				for (k=2; isPrime[p]!=true; k++)
				{
					if (isPrime[k]==true)
						if (p%k==0)
						{
							count++;
							while (p%k==0)
								p/=k;
						}
				}
				count++;
				x[j]=count;
			}
			else
				x[j]=1;
				
				count=0;
		}
		
		int q=0;
		int fact4[] = new int[1000000];
		for (int t=2; t<1000000; t++)
		{
			if (x[t]==4)
			{
				fact4[q]=t;
				q++;
			}
		}
		
		
		for (q=0; q<fact4.length-3; q++)
			if (fact4[q]+1==fact4[q+1])
				if (fact4[q]+2==fact4[q+2])
					if (fact4[q]+3==fact4[q+3])
					{
						System.out.println(fact4[q]+"\t"+fact4[q+1]+"\t"+fact4[q+2]+"\t"+fact4[q+3]);
						break;
					}
		
		long end = System.currentTimeMillis();
		System.out.print("Exec time: "+(end-start));
		
	}
}