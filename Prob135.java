//1) 0<2d<=x<=5d
//2) d!=0.

class Prob135
{
	public static void main(String args[])
	{
		int x=2, d, n=1000000;
		long count10=0;
		long count[]=new long[n+1];
		double t;

		for (int i=0; i<n+1; i++)
			count[i]=0;

		for (d=1; d<1000; d++)
		{
			for (x=2*d+1; x<=5*d; x++)
			{
				if (d<x)				
				{
					t=(x*x)-((x-d)*(x-d))-((x-2*d)*(x-2*d));
				
					if (t<n && t>0)
						count[(int)t]++;

					if (t==1155)
						System.out.println(x+", "+(x-d)+", "+(x-2*d)+", CD= "+d);	
				}				
			}
		}

		for (int i=0; i<n; i++)
			if (count[i]==10)
				count10++;


//		System.out.println("No. of solutions for n=1155 are: "+count[1155]);
		System.out.println("The answer is: "+(count10));
	}
}