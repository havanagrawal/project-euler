//What is the largest prime factor of the number 600851475143?
/*Note: Instead of checking for factors of the number, and further checking for prime-ness,
 *its better to use the following algorithm,
 *since the number keeps reducing in each iteration,
 *and the last number remaining is the greatest prime factor.
 */

class Prob3
{
	public static void main(String args[])
	{
		long i=2, j, ans=0, k=600851475143L;

		while (i<k)
		{
			if (k%i==0)
				k=k/i;
			else
				i++;
		}
		ans=k;
		System.out.println((ans)+" is the answer!");
	}
}