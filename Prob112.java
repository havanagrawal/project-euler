//Find the least number for which the proportion of bouncy numbers is exactly 99%.
//Ans: 1587000
//Exec time: 750

import java.lang.*;

class Prob112
{
	public static void main(String args[])
	{
		int num=100, count=0, len=0;
		double percent=0;
		String number;
		boolean isInc=true, isDec=true;

		long start=System.currentTimeMillis();
		
		while (percent<99)
		{
			isInc=true;
			isDec=true;

			number=Integer.toString(num);

			len=number.length();

			for (int i=0; i<len-1 && (isInc==true || isDec==true); i++)
			{
				int num1=Integer.parseInt(number.substring(i, i+1));
				int num2=Integer.parseInt(number.substring(i+1, i+2));
				
				if (num1>num2)
					isInc=false;
			
				if (num1<num2)
					isDec=false;
			}

			if (isInc==false && isDec==false)
				count++;

			percent = ((double)count/(double)num)*100;
			num++;
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println((num-1)+" is the answer!");
		System.out.println("Exec time: "+(end-start));

	}
}