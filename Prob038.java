// Note (1) - 9182<i<=9876.

//Ans: 932718654

class Prob038
{
	public static boolean isPan9(String s)		//Will accept only 9 digit numbers.
	{
		int i=0, j;
		boolean b[] = new boolean[9];

		boolean ret=true;

		for (j=0; j<=8; j++)
			b[j]=false;

		for (j=0; j<=8; j++)
			if (s.charAt(j)==48)
				return false;
			else
				b[(s.charAt(j)-49)]=true;

		for (j=0; j<=8; j++)
			if (b[j]!=true)
				ret=false;

		return ret;
	}
			

	public static void main(String args[])
	{
		int i=9876;

		for (i=9876; i>9182; i--)
			if (isPan9(""+i+""+(2*i)))
				System.out.println(i+""+(2*i));
	}
}