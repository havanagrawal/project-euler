import java.text.*;

class Prob043
{
	public static void main(String args[])
	{
		/*
		for (int i=500; i<600; i++)
			if (i%11==0)
				System.out.println(i);
		

		for (int j=100; j<950; j++)
			if (j%13==0)
					System.out.print(j + "\t");
		
		
		for (int k=280; k<910; k++)
			if (k%17==0)
				System.out.print(k+"\t");	
		
		
		for (int l=100; l<1000; l++)
			if (l%7==0)
				if (l%100 == 52 || l%100 == 53 || l%100 == 57)
					System.out.print(l+"\t");
		*/
		
		long d1 = 1430952867L;
		long d2 = 4130952867L;
		long d3 = 1460357289L;
		long d4 = 4160357289L;
		long d5 = 1406357289L;
		long d6 = 4106357289L;
		
		System.out.print(d1+d2+d3+d4+d5+d6);
	}
}