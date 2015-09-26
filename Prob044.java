//Ans: 5482660
//Exec time: 2068

class Prob044
{
	public static boolean isPentagonal(long p, long x[])
	{
		long q = (long)(Math.sqrt(24*p + 1));
		int n=0;
		if (q*q==(24*p+1))
			n=(int)((1+q)/6);
		
		if (x[n]==p)
			return true;
		
		return false;
	}

	public static int rank(long p)
	{
		long q = (long)(Math.sqrt(24*p + 1));
		int n=(int)((1+q)/6);
		return n;
	}
	
	public static void main(String args[])
	{
		long pents[] = new long[30000];
		int i=0, j;
		int length=10000;
		
		long start=System.currentTimeMillis();
		
		for (i=0; i<pents.length; i++)
			pents[i]=(i*(3*i - 1))/2;

		//for (i=0; i<20; i++)
		//	System.out.print(pents[i]+"\t");
	
		System.out.println("i \tj\tP[i]+P[j]\n");
	
		for (i=1; i<length-2; i++)
			for (j=i+1; pents[i]+pents[j]>=pents[j+1] && j<length-2; j++)
					if (isPentagonal((pents[i]+pents[j]), pents))
					{
						//System.out.println(i+"\t"+j+"\t"+rank(pents[i]+pents[j]));
						if (isPentagonal((pents[j]-pents[i]), pents))
						{
							System.out.println(i+"\t"+j+"\t"+rank(pents[i]+pents[j])+"\tFound!!!");
							System.out.println("The answer is: "+(pents[j]-pents[i]));
						}
					}
		long end=System.currentTimeMillis();
		System.out.println("Exec time: "+(end-start));
	}
}