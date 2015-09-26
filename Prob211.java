//lim=6400000
//Ans: 105653478
//Exec time: 135172

//lim=64000000
//Ans: 1921151853
//Exec time: 4257016

class Prob211
{
	/*Returns if sum of squares of divisors is a perfect square*/
	static long sm;
	static long sq;
	static int odd;

	public static void main(String args[])
	{
		long lim=6400000;
		long n;
		long ans=1;							//Algo for sum doesn't work for value '1'
		long start=System.currentTimeMillis();
		
		int i, j, k;
		
		//Main Algo
		for (n=2; n<lim; n++)
		{
			sm=1+(n*n);
			sq=(long)Math.sqrt(n);
			odd = (int)n%2;
		
			for (i=(2+odd); i<sq; i+=(odd+1))
				if (n%i==0)
					sm+=i*i + ((n*n)/(i*i));
		
			if (sq*sq==n)
				sm+=n;
		
			sq=(long)Math.sqrt(sm);
			if (sq*sq==sm)
			{
				ans+=n;
				//System.out.println(n);
			}
		}
		long end=System.currentTimeMillis();
		System.out.println("Ans: "+ans);
		System.out.print("Exec time: "+(end-start));
	}
}