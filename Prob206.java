//Find the unique positive integer whose square has the form 1_2_3_4_5_6_7_8_9_0,
//where each “_” is a single digit.

/*My note (1): Only a multiple of 10 can have 0 as its last digit
in its square. Further, it HAS to be ending in 00.
This reduces the number, and simplifies the problem slightly, to:
1_2_3_4_5_6_7_8_9*/
/*My note(2): Use a macro or function(try recursion) to return n%10, and n/100*/

//Ans: 1389019170

class Prob206
{
	public static void main(String args[])
	{
		long i, j, n, ans=0;
		boolean check=false;

		for (i=1; i<1389026620&&check==false; i++)
		{
			n=i*i;
			if (n%10==9)
			 {
			   n/=100;
			   if (n%10==8)
			   {
			     n/=100;
			     if (n%10==7)
			     {
				n/=100;
				if (n%10==6)
				{
				  n/=100;
				  if (n%10==5)
				  {
				    n/=100;
				    if (n%10==4)
				    {
				      n/=100;
				      if (n%10==3)
				      {
					n/=100;
					if (n%10==2)
					{
					  n/=100;
					  if (n%10==1)
					  {
					    ans=i;
					    check=true;
					  }
					}
				      }
				    }
		        	  }
		      		} 
			      }
		            }
			  }
		}
		System.out.println((ans)+" is the answer!");

	}
}