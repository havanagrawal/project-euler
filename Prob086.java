/*For integer solution, either:
1) x, y+z
2) y, x+z
3) z, x+y
must be the smaller sides of a Pythagorean Triplet.

Since I am considering x<=y<=z, (x+y)^2 + z^2 is always the shortest path.
Hence (x+y, z) must be a P.T. pair.
*/
//Ans: 1818
class Prob086
{
	public static void main(String args[])
	{
		int M;
	
		int x, y, z;
		int p, rt;
		int i, j;
		int ans=0;
		
		double l1, l2, l3;
		double shortest;
		
		long start=System.currentTimeMillis();
		
		for (M=1817; M<1850 && ans<1000000; M++)
		{
			ans=0;
			boolean PT[][] = new boolean[2*M+1][2*M+1];
		
		
			for (i=0; i<=2*M; i++)
				for (j=0; j<=2*M; j++)
					PT[i][j]=false;
				
			for (i=1; i<=2*M; i++)
				for (j=1; j<=i; j++)
				{
					p = i*i + j*j;
					rt = (int)Math.sqrt(p);
			
					if (rt*rt==p)
						PT[j][i]=PT[i][j]=true;
				}

		/*for (i=1; i<=20; i++)
			for (j=1; j<=i; j++)
				if (PT[i][j])
					System.out.println(j+", "+i);*/
		
		for (z=1; z<=M; z++)
			for (y=1; y<=z; y++)
				for (x=1; x<=y; x++)
				{
					if (PT[x+y][z])
						ans++;
				}
		}
		long end=System.currentTimeMillis();
		
		System.out.println("The answer is: "+ans);
		System.out.println("Value of M: "+(M-1));
		System.out.println("Exec time: "+(end-start));
			
	}
}