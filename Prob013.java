//Work out the first ten digits of the sum of the following one-hundred 50-digit numbers. (Prob13Data)


//Ans: 5537376230

import java.io.*;
import java.math.*;

class Prob013
{
	public static void main(String args[])
	{
		BigInteger b[] = new BigInteger[100];
		BigInteger sum=new BigInteger("0");

		try
		{
			FileInputStream f=new FileInputStream("Prob13Data.txt");
			DataInputStream d=new DataInputStream(f);
			BufferedReader br=new BufferedReader(new InputStreamReader(d));

			String s;
			int i=0;

			do
			{
				s=br.readLine();
				b[i]=new BigInteger(s);
				sum=sum.add(b[i]);
				i++;
			}
			while (i!=100);

			System.out.println("The number is: "+sum);
			d.close();
		}
		catch (Exception e)
		{
			System.out.println("Exception occured :( "+e);
		}
	}
}