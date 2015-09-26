import java.io.*;

class Prob282
{
	public static long A(long m, long n)
	{
		long ret=0;

		if (m==0)
			ret = (n+1);
		else if (m>0 && n==0)
			ret = (A(m-1, 1));
		else if (m>0 && n>0)
			ret = (A(m-1,A(m, n-1)));

		return ret;
	}

	public static void main(String args[])throws IOException
	{
		long sum=0;
//		System.out.println(A(3, 3));

		long A[][] = new long[14][14];


		for (int i=0; i<=3; i++)
		{
			for (int j=0; j<=7; j++)
			{
				A[i][j]=A(i, j);
				System.out.print("\t"+A[i][j]);
			}

			System.out.println();
		}

		

/*		for (int n=0; n<=6; n++)
		{
			sum+=A(n, n);
		}*/

//		System.out.println((sum)+" is the answer!");

	}
}