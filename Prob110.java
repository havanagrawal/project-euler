//Extension of Prob108
/*Observations: 
After n=360, following values are multiples of 60.
*/
class Prob110
{
	public static void main(String args[])
	{
		long n=2;
		long k;
		long no_of_soln=0;
		long target=2000;
		long prev_max=0, maxn=0, prevmaxn=0;
		
		long start = System.currentTimeMillis();
		
		while (no_of_soln<=target)
		{
			no_of_soln=0;
			if (n>=360 && n%60==0)
				n+=60;
			else if (n%2==0)
				n+=2;
			else
				n++;
			
			for (k=1; k<=n; k++)
			{
				if ((n*n)%k==0)
					no_of_soln++;
			}
			if (no_of_soln>prev_max)
			{
				prev_max=no_of_soln;
				prevmaxn=maxn;
				maxn=n;
				System.out.println(n+"\t"+no_of_soln);
				n+=(maxn-prevmaxn)/4;
			}
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Value of n: "+maxn);
		System.out.println("No of solutions: "+no_of_soln);
		System.out.println("Exec time: "+(end-start));
	}
}