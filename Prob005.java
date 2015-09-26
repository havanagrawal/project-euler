//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

class Prob005
{
	public static void main(String args[])
	{
		int i=21;

		while (!(i%20==0 && i%19==0 && i%18==0 && i%17==0 && i%16==0 && i%15==0 && i%14==0 && i%13==0 && i%12==0 && i%11==0))
			i++;

		System.out.println ((i)+" is the answer!");
	}
}
