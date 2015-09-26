/*
A number chain is created by continuously adding the square of the digits in a number to form a new number until it has been seen before.
Any chain that arrives at 1 or 89 will become stuck in an endless loop. What is most amazing is that EVERY starting number will eventually arrive at 1 or 89.
How many starting numbers below ten million will arrive at 89?
*/

// Ans: 8581146
// Exec time: 1671ms

class Prob092
{
	public static int Sum(int t)
	{
		String s = ""+t;
		int sum=0;
		
		for (int i=0; i<s.length(); i++)
		{
			char k=s.charAt(i);
			sum+=(k-'0')*(k-'0');
		}
		return sum;
	}

	public static void main(String args[])
	{
		
		int ends[] = new int[10000000];		//0 if not encountered, 1 for ends in 1, 2 for ends in 89.
		
		for (int i=0; i<ends.length; i++)
			ends[i]=0;
			
		//Some initial values that are known:
		ends[44]=ends[32]=ends[13]=ends[10]=ends[1]=ends[100]=1;
		ends[23]=ends[31]=1;
		
		ends[85]=ends[89]=ends[145]=ends[42]=ends[2]=2;
		ends[98]=ends[24]=ends[61]=ends[73]=2;
		ends[20]=ends[4]=ends[16]=ends[37]=ends[58]=2;
		
		int temp[]=new int[1000];
		
		int target = 10000000;
		int count=0;			//Count for 89
		
		int sum=0;
		
		long start = System.currentTimeMillis();
		
		for (int k=1; k<target; k++)
		{
			if (ends[k]!=1 && ends[k]!=2)		//Calculate sum of squares of digits, add to temp array, till an encountered value is reached.
			{
				int p=1;
				sum=k;
				//System.out.print("\n"+k);
				
				while (ends[sum]!=1 && ends[sum]!=2)
				{
					temp[p]=sum;
					p++;
					sum=Sum(sum);
					//System.out.print(" -> "+sum);
				}
				if (ends[sum]==1)				//Encountered value ends in 1
				{
					for (int x=1; x<p; x++)
					{
						ends[temp[x]]=1;
						temp[x]=0;				//Resets all values of temp
					}
				}
				else							//Encountered value ends in 89
				{
					for (int x=1; x<p; x++)
					{
						ends[temp[x]]=2;
						temp[x]=0;
					}
				}
			}
		}
		for (int j=1; j<target; j++)
			if (ends[j]==2)
				count++;
				
		long end = System.currentTimeMillis();
		System.out.println("\nNumber of integer chains ending in 89 are : "+count);
		System.out.println("Exec time: "+(end-start));
	}
}