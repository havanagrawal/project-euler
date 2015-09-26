//Ans: 190569291
//Exec time: 12000
//P(k, n) is the number of ways you can write n using integers greater than or equal to k
//Try using arrays instead of the regular java stack, since n is small
class Prob076 {

	static int partition(int k, int n)	{
		if (k>n)
			return 0;
		else if (k==n)
			return 1;
		else
			return (partition(k+1, n) + partition (k, n-k));
			
	}
	public static void main(String args[])	{
		
		long start=System.currentTimeMillis();
		System.out.println("The answer is: "+(partition(1, 100)-1));
		long end=System.currentTimeMillis();
		System.out.println("Exec time: "+(end-start));
		
	}
}