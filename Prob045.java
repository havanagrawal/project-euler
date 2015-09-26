/*Triangle number which is also pentagonal and hexagonal*/

class Prob045
{
	public static void main(String args[])
	{
		long d, n, k;
		boolean found=false;

		for (d=1; d<=100000; d++)
		{
			k=d*((3*d)-1)/2;

			for (n = (long)(Math.sqrt(k)-1)/2; n<=(Math.sqrt(k)-1) && found==false; n++)
			{
				if (n*((2*n)-1)==k)
				{
					found=true;
					System.out.println(k);
				}
			}
			found=false;
		}
	}
}