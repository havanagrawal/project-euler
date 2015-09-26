//How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
/*The ordinal position of the day within the year (e.g. March 25, 1999 was day 84). We'll call this the year_ordinal.
 *The ordinal position of the day within the week for January 1 of that year (where Sunday is 1, Monday is 2 etc.). The ordinal position of the day within the week we'll call the week_ordinal and week_ordinal for January 1 we'll refer call week_ordinal(1/1). This value depends on the year.

Formula:((year_ordinal - 1)  + (week_ordinal(1/1) - 1) ) modulo 7 + 1

The week_ordinal(1/1) can be found by the three formulas

      1.  a = (year - 1901) mod 28
      2.  b = floor(a/4)
      3.  week_ordinal(1/1) = (2 + a + b) modulo 7 + 1 
*/


class Prob019
{
	public static void main(String args[])
	{
		/*These are the year ordinals*/

		int leap[]={1, 32, 61, 92, 122, 153, 183, 214, 245, 275, 306, 336};
		int year[]={1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};

		int week_ordinal_for_year=3;		//The day of 1st Jan for that year (1901)
		int week_ordinal;

		int current_year=1901;

		int a, b;

		boolean isLeap=true;

		int Sundays=0;

		while (current_year!=2001)
		{
			if (current_year%100==0)
			{
				if (current_year%4==0)
					isLeap=true;
			}
			else if (current_year%4==0)
				isLeap=true;
			else
				isLeap=false;

			if (isLeap)
			{
				for (int i=0; i<12; i++)
				{
					week_ordinal=(((leap[i] - 1)+(week_ordinal_for_year - 1))%7) + 1;

					if (week_ordinal==1)
						Sundays++;
				}
			}
			else
			{
				for (int i=0; i<12; i++)
				{
					week_ordinal=((year[i] + week_ordinal_for_year - 2)%7) + 1;

					if (week_ordinal==1)
					{
						//System.out.println("Month no: "+(i+1));
						Sundays++;
					}
				}
			}
			current_year++;

			a=(current_year-1901)%28;
			b=(int)Math.floor((double)a/4);
			week_ordinal_for_year=((2+a+b)%7)+1;
		}
		System.out.println("The number of Sundays that fell on the first of the month are: "+Sundays);
	}
}