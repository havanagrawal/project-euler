//What is the first term in the Fibonacci sequence to contain 1000 digits?
//Ans: 4782
//(Use convergence for a manual answer.)
import java.math.*;

class Prob025
{
	public static void main(String args[])
	{
		BigInteger a=new BigInteger ("1");
		BigInteger b=new BigInteger ("2");
		BigInteger c=a.add(b);

		int count=3;
		int len=1000;

		while ((c.toString()).length()<len)
		{
			c=a.add(b);
			count++;
			a=b;
			b=c;			
		}
		System.out.println("Term no: "+count+", Term: "+c);

	}
}