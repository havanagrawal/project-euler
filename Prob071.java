//For k=10000, num/den=4283/9994

class Prob071
{
	public static long GCD (long i, long j)
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
		else
			return j;
	}	

	public static void main(String args[])
	{
		long num, den, leftnum=2, leftden=5, k=1000000;

		long start=System.currentTimeMillis();

		for (den=(k*9)/10; den<=k; den++)
		{
			num=(k*4)/10;
			//num=1;

			while (num<den)
			{
				if ((num*leftden>den*leftnum))
					if ((3*den)>(7*num))
						if (GCD(num, den)==1)
						{
							leftnum=num;
							leftden=den;
//							System.out.println("Fraction to the left of 3/7 is: "+leftnum+"/"+leftden);
						}

				if (den%2==0 && num%2!=0)
					num+=2;
				else
					num++;
			}
		}
					
		long end=System.currentTimeMillis();

		System.out.println("Fraction to the left of 3/7 is: "+leftnum+"/"+leftden);
		System.out.println("Exec. time: "+(end-start));
	}
}