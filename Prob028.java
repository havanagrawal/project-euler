/*Count -> Total number of diagonal elements
 *rt -> Right top 
 *lts -> Left top sum
 *lb -> Left bottom
 *rts -> Right top Sum
 *lta -> Add to left top
 *lba -> Add to left bottom
 */

//Ans: 669171001

class Prob28
{
	public static void main(String args[])
	{
		long rt=1, lt=1, lb=1, rts=0, lta=6, lba=4, count=2, lts=0, rba=2, rb=1, lbs=0;
		long rbs=0; 

		int n=1001;				//For a "n by n" spiral.

		for (rt=1; rt<=n; rt+=2)		//Right Top
			rts+=(rt*rt);

		
		while (count<=((n+1)/2))			//Left top
		{
			lt+=lta;
			lts+=lt;
			lta+=8;
			count++;
		}

		count=2;

		while (count<=((n+1)/2))
		{
			lb+=lba;
			lbs+=lb;
			lba+=8;
			count++;
		}
		
		count=2;

		while (count<=((n+1)/2))
		{
			rb+=rba;
			rbs+=rb;
			rba+=8;
			count++;
		}

		System.out.println("Sum of rt is: "+(rts));
		System.out.println("Sum of lt is: "+(lts));
		System.out.println("Sum of rb is: "+(rbs));
		System.out.println("Sum of lb is: "+(lbs));
		System.out.println("Sum of diagonals is: "+(rbs+lts+lbs+rts));
	}
}