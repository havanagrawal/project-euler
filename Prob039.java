/*If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p <= 1000, is the number of solutions maximised?
*/

//Tip: a+b>c, so a+b+c>2c, but a+b+c<=1000, so 2c<=1000, so c<500.
//Tip 2: Use p in the loop, as p is always even, faster execution time.
//Ans: 840

class Prob39
{
	public static void main(String args[])
	{
		int a, b, c, max=0, ans=0;
		
		//Array index is the perimeter. Value at any index is number of solutions for that perimeter.
		int p[]= new int [1001];

		for (c=1; c<=1000; c++)		//c is a temp
			p[c]=0;

		for (c=1; c<=500; c++)
			for (b=1; b<=c; b++)
				for (a=1; a<=b; a++)
					if ((c*c==a*a+b*b) && (a+b+c)<=1000)
						p[a+b+c]++;

		for (c=1; c<=1000; c++)
			if (p[c]>max)
			{
				max=p[c];
				ans=c;
			}
		System.out.println((ans)+"is the answer!");
	}
}
					