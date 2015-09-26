/*Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.*/

//(1) - Check till the sqrt of the product. Product must be 4 digit. So start from 1000.

//Ans: 45228

class Prob032
{
	public static boolean isPandigital(String s)
	{
		int i, j;
		boolean b[]=new boolean[9];
		boolean ret=true;

		for (i=0; i<9; i++)
			b[i]=false;

		for (i=0; i<9; i++)
		{
			j=(((int)s.charAt(i))-48-1);

			if (j==(-1))
			{
				ret=false;
				break;
			}
			b[j]=true;
		}

		for (i=0; i<s.length(); i++)
			if (b[i]!=true)
				ret=false;

		return ret;
	}

	public static String toString(int k)
	{
		return (""+k);
	}

	public static void main(String args[])
	{
		int prod=0, i=9;
		long sum=0;
		boolean check=false;
		String s=new String();

		for (prod=1234; prod<=9876; prod++)		//(1)
		{
			for (i=12; i<=prod && check==false; i++)
			{
				if (prod%i==0)
				{
					s=(toString(prod)+toString(i)+toString(prod/i));
				
					if (Integer.parseInt(s)>=123456789 && Integer.parseInt(s)<=987654321)
					{
						check=isPandigital(s);

						if (check==true)
						{
							System.out.println(i+" X "+(prod/i)+" = "+prod);
							sum+=(long)prod;
						}
					}
				}
			}
			
			
			check=false;
		}

		System.out.println("The answer is: "+sum);
	}
}