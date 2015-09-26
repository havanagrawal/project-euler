class Prob016
{
	public static void main(String args[])
	{
		int num[]=new int[500];
		int i, k, sum=0;
		int n=999;		//for 2^(n+1)

		for (i=0; i<500; i++)
		{
			num[i]=0;
		}

		num[0]=2;
	
		for(k=0; k<n; k++)
		{
			for (i=0; i<500; i++)
				num[i]*=2;

			for (i=0; i<500; i++)
				if (num[i]>=10)
				{
					num[i+1]++;
					num[i]%=10;
				}
		}
		
		for (i=0; i<500; i++)
			sum+=num[i];

		System.out.println("the sum is: "+sum);
	}
}