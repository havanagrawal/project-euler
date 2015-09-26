//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

class Prob006
{
	public static void main(String args[])
	{
		int i, num1=0, num2=0, ans;
		
		for (i=1; i<=100; i++)
		{
			num1+=(i*i);
			num2+=i;
		}
		ans=(num2*num2)-num1;
		System.out.println((ans)+" is the answer!");

	}
}