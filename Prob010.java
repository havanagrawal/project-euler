//Find the sum of all the primes below two million.

class Prob10
{
	public static void main(String args[])
	{
		int i, j;
		long ans=2;
		boolean check=true;


		for (i=3; i<2000000; i++)
		{
			for (j=2; (j<i)&&(check==true); j++)
			{
				if (i%j==0)
					check=false;
			}
			if (check==true)
				ans+=i;

			check=true;
		}
		System.out.println((ans)+" is the answer!");
	}
}

		
