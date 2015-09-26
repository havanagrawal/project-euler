//How many chains, with a starting number below one million, contain exactly sixty non-repeating terms?

//A chain is formed by adding the sum of factorials of digits, forming the next number.

//Ans: 402
class Prob074
{
	static int facts[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

	public static int sum_of_facts (int t)
	{
		int k=t;
		int ret=0;
		
		while (k!=0)
		{
			ret+=facts[(k%10)];
			k/=10;
		}
		return ret;
	}

	public static void main(String args[])
	{
		int size=1000000;
		
		//Contains lengths of loop
		int loop[] = new int[10000000];
		
		int chain[]=new int[61];
		
		int count=0;
		int ans=0;
		int x=0;
		int sum;
		
		for (int k=0; k<10000000; k++)
			loop[k]=0;
			
		//Some initial known loops
		
		loop[0]=loop[1]=1;
		loop[2]=1;
		loop[145]=loop[40585]=1;
		loop[169]=loop[363601]=loop[1454]=3;
		loop[871]=loop[45361]=2;
		loop[872]=loop[45362]=2;

		long start=System.currentTimeMillis();
		
		//*If loop[h]==0
				//Add h to chain
				//Calculate sum of factorials of digits of h
				//If sum is unknown, add sum to chain, increment count
				//Continue till known value is reached, i.e. loop[sum]!=0
				//Add loop[sum] to count
				//For 1st value in chain, i.e., chain[1], loop value is count
				//For each subsequent value, loop is one less than previous, if not previously filled
				//i.e. if loop[chain[i]]!=0, then:
				/*
					loop[chain[0]]=count
					loop[chain[1]]=count-1
					loop[chain[2]]=count-2
					.
					.
					.
				*/
				//Reset chain array, count
		/*IMPORTANT: DO NOT REWRITE THE VALUES OF KNOWN LOOPS
		  ELSE ALGO MAY ENTER INFINITE LOOP
		*/
		
		for (int h=1; h<size; h++)
		{
			if (loop[h]==0)
			{
				sum=h;
				while (loop[sum]==0)
				{
					chain[count]=sum;
					count++;
					sum = sum_of_facts(sum);
				}

				count+=loop[sum];
				
				for (x=0; chain[x]!=0; x++)
				{
					loop[chain[x]]=count-x;
				}
				//System.out.println("\n"+count);
			}
			count=0;
			for (x=0; x<61; x++)
					chain[x]=0;
		}
		
		//System.out.println(sum_of_facts(43));
		for (int i=1; i<size; i++)
			if (loop[i]==60)
				ans++;
				
		long end = System.currentTimeMillis();
		
		System.out.println("The answer is: "+ans);
		System.out.println("Exec time: "+(end-start));
	}
}