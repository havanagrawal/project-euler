//Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
//Note: The period of the repeating decimal of 1/p is equal to the order of 10 modulo p (Value of smallest k, such that (10^k)%p==1;
//Note 2 (Revisit): It is impractical to solve for k, seeing that since out upper limit is 1000, 10^997 is not computable.

//Ans: 983

class Prob026
{
	public static void main(String args[])
	{
		int limit=1000;
	
		boolean d[]=new boolean[limit+1];

		
		
		int i, t;
		int ans=0, temp=0;
		int p;
		int num;
		int r;
		int k;
		boolean remainder[];

		for (i=0; i<limit+1; i++)
			d[i]=true;

		for (i=2; i<=limit; i*=2)	//Powers of 2 will have finite decimal
		{
			d[i]=false;
			
			if (i*10<=limit)
				d[i*10]=false;
		}

		for (i=5; i<=limit; i*=5)	//Powers of 5 will have finite decimal
		{
			d[i]=false;
			if (i*10<=limit)
				d[i*10]=false;
		}

		for (i=10; i<=limit; i*=10)	//Powers of 10 will have finite decimal
			d[i]=false;

		int period=1;
		int max_period=0;
			
		for (i=2; i<limit+1; i++)
		{			
			if (d[i])
			{
				for (k=2*i; k<limit+1; k+=2*i)
					d[k]=false;
					
				remainder = new boolean[i];
			
				for (k=1; k<i; k++)
					remainder[k]=false;
				
				r=1;
				period=0;
				for (p=1; p<i && remainder[r]==false; p++)
				{
					remainder[r]=true;
					period++;
					r = (r*10)%i;
				}
				if (period>max_period)
				{
					max_period=period;
					System.out.println(i+":\t"+period);
				}
			}
		}
		//System.out.println("The answer is: "+ans);
	}
}