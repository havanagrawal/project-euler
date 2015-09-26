/*Let us call an integer sided triangle with sides a <= b <= c barely acute if the sides satisfy
a^2 + b^2 = c^2 + 1.

How many barely acute triangles are there with perimeter <= 25,000,000?
*/

// My Note (1) - When a=1, b=c, there are (25,000,000-1)/2 cases, i.e. 12499999 cases. Hence, initialize 'a' loop from 2, and add 12499999 to 'count'
// My Note (2) - 

import java.lang.Math;

class Prob223
{
	public static void main(String args[])
	{
		long a=2, b=1, k=2500L;
		long c=1;

		boolean check=false;

		long count=0;
		double temp;

		for (c=1; c<=(k-2); c++)
		{
			for (b=1; b<c; b++)
			{
				for (a=2; a<=b && check==false && a+b+c<=k; a++)
					if ((a*a+b*b==c*c+1) && a+b>c)
					{
						//System.out.println(a+", "+b+", "+c);
						count++;
						check=true;
					}
				check=false;
			}
		}
		
		System.out.println((count)+" is the answer!");

	}
}