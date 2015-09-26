/*
In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
    1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
How many different ways can £2 be made using any number of coins?
*/
/* Solution logic
Only one solution exists using £2
For the rest,
Let y = a + 2b + 5c + 10d + 20e + 50f + 100g
a<=200
b<=100
c<=40
d<=20
e<=10
f<=4
g<=2
If y equals 200, increment count.
*/
//Ans: 73682
class Prob031
{
	public static void main(String args[])
	{
		int ans=1;
		
		int a, b, c, d, e, f, g;
		int y;
		
		long start=System.currentTimeMillis();
		
		for (g=0; g<=2; g++)
			for (f=0; f<=4; f++)
				for (e=0; e<=10; e++)
					for (d=0; d<=20; d++)
						for (c=0; c<=40; c++)
							for (b=0; b<=100; b++)
								for (a=0; a<=200; a++)
								{
									y = a + 2*b + 5*c + 10*d +20*e + 50*f + 100*g;
									if (y==200)
										ans++;
								}
		long end=System.currentTimeMillis();
		
		System.out.println("The answer is: "+ans);
		System.out.println("Exec time: "+(end-start));
	}
}