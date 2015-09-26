//Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

//My Note: Acc. to Wiki, the upper limit to be checked for is 20161.

//Make code memory-efficient.

//Ans: 4179871

class Prob23
{
	public static boolean isAbundant(int n)
	{
		int j, sum=0;
		boolean ret=false;
		
		for (j=1; j<n; j++)
			if (n%j==0)
				sum+=j;

		if (sum>n)
			ret=true;

		return ret;
	}

	public static void main(String args[])
	{
		int i=1, j=1, sum=0;
		boolean Acheck=false;
		
	//	Acheck=false signifies that it CANNOT be written as the sum of two abundant numbers.

		for (i=1; i<=20161; i++)
		{
			for (j=1; j<i && Acheck==false; j++)
				if (isAbundant(j))
					if (isAbundant(i-j))
						Acheck=true;

			if (Acheck==false)
				sum+=i;

			Acheck=false;
		}

		System.out.println((sum)+" is the answer!");

	}
}