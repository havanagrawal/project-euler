//Find the 10000th element in the sorted radical function list for 1<=n<=100000
//Ans: 21417

class Prob124
{
	public static boolean isSquareFree(long n)
	{
		if (n==2)
			return true;

		for (long i=2; i<=Math.sqrt(n); i++)
			if (n%(i*i)==0)
				return false;

		return true;
	}				

	public static boolean isPrime(long n)
	{
		long j;
		boolean isPrime=true;
	
		if ( n==1 || n==2 || n==3)
			return true;
		else
		{
			for (j=2; j<=Math.sqrt(n); j++)
			{
				if (n%j==0)
					return false;
			}
			return true;
		}
	}							//30

	public static void main(String args[])
	{
		long n=100000;
		int h, k=0;
		long i=0;

		long rad[]=new long[(int)(n+1)];
		long num[]=new long[(int)(n+1)];

		boolean check=false;

		long temp;

		long start=System.currentTimeMillis();

		for (i=0; i<n+1; i++)
		{
			num[(int)i]=i;
			rad[(int)i]=0;					//Line 50
		}

		for (h=1; h<=n; h++)
		{
			if (rad[h]==0)
			{
				if (isPrime(h))
					rad[h]=h;
				else
				{
					for (i=h; i>=1 && check==false; i--)
					{
						if (h%i==0)
							if (isSquareFree(i))
							{
								check=true;
								rad[h]=i;
								//for (k=h; k<=n; k*=h)
								//{ 
								//	rad[k]=i;
								//}
							}
					}
					check=false;
				}
			}
		}
		for (long b=1; b<=n-1; b++)
		{
			for (k=1; k<=(n-1); k++)
			{
				if (rad[k]>rad[k+1])
				{
					temp=rad[k];
					rad[k]=rad[k+1];
					rad[k+1]=temp;

					temp=num[k];
					num[k]=num[k+1];
					num[k+1]=temp;
				}
				if (rad[k]==rad[k+1])
				{
					if (num[k]>num[k+1])
					{
						temp=num[k];
						num[k]=num[k+1];
						num[k+1]=temp;
					}
				}
			}
		}

		long end=System.currentTimeMillis();

		for (int c=1; c<=10000; c++)
			System.out.println(c+"\t"+num[c]+"\t"+rad[c]);

		System.out.println("Exec time: "+(end-start));
	}
}
					