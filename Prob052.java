//Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
//Ans: 142857

class Prob52
{
		
	public static boolean isPerm(long a, long b)
{
	long array1[]=new long[13];
	long array2[]=new long[13];
	long temp;
	
	int i, count1=0, count2=0, j, k, l;

	boolean isPerm=true;

	for (i=0; i<13; i++)
	{
		array1[i]=0;
		array2[i]=0;
	}
	i=0;

	while (a!=0)
	{
		array1[i]=a%10;
		a=a/10;
		count1++;
		i++;
	}
	i=0;

	while (b!=0)
	{
		array2[i]=b%10;
		b=b/10;
		count2++;
		i++;
	}

	if (count1==count2)
	{
		for (k=1; k<=13; k++)
		{
			for (j=0; j<=count1; j++)
			{
				if ((array1[j])>(array1[j+1]))
				{
					temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}

				if ((array2[j])>(array2[j+1]))
				{
					temp=array2[j];
					array2[j]=array2[j+1];
					array2[j+1]=temp;
				}
			}
		}
	}

	for (i=0; i<=12; i++)
		if (array1[i]!=array2[i])
			isPerm=false;

	return isPerm;
	
}

	public static void main(String args[])
	{

		long x, ans=0;

		for (x=999999; x>=1; x--)
			if (isPerm(x, (2*x)) && isPerm(x, 3*x) && isPerm(x, 4*x) && isPerm(x, 5*x) && isPerm(x, 6*x))
				ans=x;

		System.out.println((ans)+" is the answer!");

	}
}