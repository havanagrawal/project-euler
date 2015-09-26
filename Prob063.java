import java.math.*;
class Prob063
{
	public static void main(String args[])
	{
		long start=System.currentTimeMillis();

		int sum=0;

		for (int a=1; a<=9; a++)
			sum+=(int)(1/(1-Math.log10(a)));

		long end=System.currentTimeMillis();

		System.out.println("Ans = "+sum);
		System.out.println("Exec. Time: "+(end-start));
	}
}