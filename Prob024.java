/*
A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
*/

class Prob024
{
	public static void main(String args[])
	{
		long base=1, facto=0, remain=0, k=0;
		long n=999999, m=n;

		while (base<n)
		{
			remain=n%base;

			facto += remain * Math.pow(10,(base-1));

			n=n/base;

			base++;
		}
		facto += n * Math.pow(10,(base-1));

		System.out.println("The factoradic of: "+m+" is "+facto);
	}
}