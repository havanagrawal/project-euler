/*
1 683 44287 838861 8138021 51828151 247165843 954437177 3138105961 9090909091 23775972551
*/
/*FIT(1) = 1
 *FIT(2) = 1365
*/

//Ans: 37076114526

class Prob101
{
	public static void main(String args[])
	{
		long n;
		long ns;	//n^2
		long nc;	//n^3
		long ans=0;
		
		int deg;	//Number of terms to consider
		long pos;	
		int diff_no;
		long fit=0;
		
		long series[] = {1, 683, 44287, 838861, 8138021, 51828151, 247165843, 954437177, 3138105961L, 9090909091L, 23775972551L};
		
		/*
		for (n=1; n<=11; n++)
		{
			ns=n*n;
			nc=ns*n;
			ans = 1 - n + ns - nc + ns*ns - ns*nc + nc*nc - nc*nc*n + nc*nc*ns - nc*nc*nc + nc*nc*nc*n;
			System.out.println(ans+"\t");
		}
		*/
		
		for (deg=1; deg<=10; deg++)
		{
			fit=0;
			long differences[][] = new long[deg][deg];
			
			for (int k=0; k<deg; k++)
				differences[0][k]=series[k];
			
			for (diff_no=1; diff_no<deg; diff_no++)
			{
				for (int k=0; k<deg-1; k++)
				{
					differences[diff_no][k] = differences[diff_no-1][k+1] - differences[diff_no-1][k];
				}
			}
			for (int x=0; x<deg; x++)
				fit+= differences[x][deg-x-1];
		
			ans+=fit;
		
			System.out.println(deg+"\t"+fit);
		}
		System.out.println("The answer is: "+ans);
	}
}