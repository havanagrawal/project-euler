import java.io.*;

class Prob099
{
	public static long GCD(long i, long j)
	{
		while (i!=0 && j!=0)
		{
			if (i>j)
				i%=j;
			else
				j%=i;
		}

		if (j==0)
			return i;
		else
			return j;
	}

	public static void main(String args[])
	{
		long bases[]=new long[1001];
		long exps[]=new long[1001];

		long base=0, exp=0, temp=0;
		long obase=0, oexp=0;
		long highb=0, highe=0;

		int i;
		int ans=0;

		try
		{
			FileInputStream f=new FileInputStream("Prob099Data.txt");
			DataInputStream d=new DataInputStream(f);
			BufferedReader br=new BufferedReader(new InputStreamReader(d));

			String s;
			i=0;

			do
			{
				i++;
				s=br.readLine();

				bases[i] = (Long.valueOf(s.substring(0, s.indexOf(',')))).longValue();
				exps[i] = (Long.valueOf(s.substring((s.indexOf(',') + 1)))).longValue();
				
			}
			while (i!=1000);

			d.close();
		}
		catch (Exception e)
		{
			System.out.println("Exception occured :( "+e);
		}
		/*
		highb=bases[5];
		highe=exps[5];

		i=1;

		while (i!=1000)
		{
			obase=bases[i];
			base=bases[i];
			oexp=exps[i];
			exp=exps[i];
						
			long gcd=GCD(base, highb);
			temp=highb;

			boolean check=(exp>highe)?true:false;

			long diff=check?(exp-highe):(highe-exp);

			base/=gcd;
			temp/=gcd;
			double num1=Math.pow(base,oexp);
			double num2=Math.pow(temp, highe);
			double num3=Math.pow(gcd, diff);
		

			if (check)
			{
				//System.out.println("In check");
				if (num1*num3 > num2)
				{
					highb=obase;
					highe=oexp;
					ans=i;
				}
			}
			else
			{
				System.out.println("In else");
				if (num1 > num2*num3)
				{
					//System.out.println(obase+"^"+oexp);
					highb=obase;
					highe=oexp;
					ans=i;
				}
			}
			i++;
		}

		System.out.println("The line number is: "+ans+", The value is: "+highb+"^"+highe);
		*/
		
		double largest=0;
		ans=0;
		for (i=0; i<1000; i++)
		{
			if (exps[i]*Math.log((double)bases[i])>largest)
			{
				ans=i;
				largest=exps[i]*Math.log((double)bases[i]);
				System.out.println(bases[i]+"^"+exps[i]);
			}
		}
		System.out.println(bases[i]+"^"+exps[i]);
		System.out.println("The answer is: "+ans);
			
			
	}
}