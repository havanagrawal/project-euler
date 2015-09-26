//If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used? 

//Ans: 21124

class Prob017
{
	public static void main(String args[])
	{
		int n=1, m;
		long count=0;
		long sum=0;

		for (n=1; n<1000; n++)
		{
			/*Checks units digit & tens*/
			if ((n%100)<20)
			{
				m=n%100;

				if (m==1 || m==2 || m==6 || m==10)		//'one, two, six, ten'
					count+=3;
				else if (m==3 || m==7 || m==8)			//'three, seven, eight' 
					count+=5;
				else if (m==4 || m==5 || m==9)			//'four, five, nine'
					count+=4;
				else if (m==11 || m==12)			//'eleven, twelve'
					count+=6;
				else if (m==13 || m==14 || m==18 || m==19)	//'thirteen, fourteen, eighteen, nineteen'
					count+=8;
				else if (m==15 || m==16)			//'fifteen, sixteen'
					count+=7;
				else if (m==17)					//'seventeen'
					count+=9;
			}
			else
			{
				m=n%10;

				if (m==1 || m==2 || m==6 || m==10)
					count+=3;
				else if (m==3 || m==7 || m==8)
					count+=5;
				else if (m==4 || m==5 || m==9)
					count+=4;

				m=(n/10)%10;

				if (m==2 || m==3 || m==8 || m==9)
					count+=6;
				else if (m==4 || m==5 || m==6)
					count+=5;
				else if (m==7)
					count+=7;
			}

			/*Checks hundred digit*/

			if (n>=100)
			{
				count+=7;		//'hundred'

				if (n%100!=0)
					count+=3;	//'and'

				m=n/100;

				if (m==1 || m==2 || m==6)
					count+=3;
				else if (m==3 || m==7 || m==8)
					count+=5;
				else if (m==4 || m==5 || m==9)
					count+=4;
			}
			sum+=count;
			//System.out.println(n+": "+count);
			count=0;
		}
		sum+=11;				//'one thousand'

		System.out.println("The number of letters used are: "+sum);
	}
}

				