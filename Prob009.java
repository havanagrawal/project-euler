//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

class Prob9
{
	public static void main(String args[])
	{
		int i, j, k, ans=0;

		for (i=1; i<=10000; i++)
		{
			for (j=1; j<=10000; j++)
			{
				for (k=1; k<=10000; k++)
				{
					if ((k*k==i*i+j*j)&&(i+j+k==1000))
					{
						ans=i*j*k;
						System.out.println((ans)+"is the answer!");
					}
				}
			}
		}
	}
}