//11 terms: 2328ms
//15 terms: 25s
//17 terms: 259s

class Prob119
{
	public static long sum(long x)
	{
		long sm=0;
		String s=""+x;
		int len=s.length();
		
		for (int i=0; i<len; i++)
			sm+=s.charAt(i)-'0';
		
		return sm;
	}

	public static void main(String args[])
	{
		long sm=0;
		long num=0;
		
		long start=System.currentTimeMillis();
		
		for (long i=10; i<1000000000; i++)
		{
			sm=sum(i);
			num=i;
			
			if ((sm%2)==(num%2))
				while (num%sm==0)
					num/=sm;
				
			if (num==1)
				System.out.println(i);
		}
		
		long end=System.currentTimeMillis();
		System.out.println("Exec time: "+(end-start));
	}
}