/*By counting carefully it can be seen that a rectangular grid measuring 3 by 2 contains eighteen rectangles.
Although there exists no rectangular grid that contains exactly two million rectangles, find the area of the grid with the nearest solution.
*/
//Ans: 2772

class Prob085
{
	public static void main(String args[])
	{
		long a, b, sa, sb;
		long low = 1999000L;
		long high = 2001000L;
		long n=2000000L;
		long no_of_rect=0;
		long ansa=0, ansb=0, area=0;

		for (a=1; a<=2000; a++)
			for (b=1; b<=2000; b++)
			{
				sa = a*(a+1)/2;
				sb = b*(b+1)/2;
				no_of_rect = sa*sb;

				if (no_of_rect<n && no_of_rect>low)
				{
					low=no_of_rect;
					ansa=a;
					ansb=b;
					area=a*b;
				}

				else if (no_of_rect>n && no_of_rect<high)
				{
					high=no_of_rect;
					ansa=a;
					ansb=b;
					area=a*b;
				}
			}

		System.out.println("a = "+ansa+", b = "+ansb);
		System.out.println("Area = "+area);
		System.out.println("The low is: "+low);
		System.out.println("The high is: "+high);
		
	}
}