//Ans: 14316

import java.util.Vector;

class Prob095
{
	public static Integer sum_of_div(Integer x)
	{
		int ans=1;
		int y = x.intValue();
		
		for (int i=2; i<=Math.sqrt(y); i++)
			if (y%i==0)
			{
				ans+=i;
				if (y/i!=i)
					ans+=y/i;
			}

		return new Integer(ans);
	}

	public static void main(String args[])
	{
		int n=1000000;
		
		int size=0;
		int maxsize=0;
		
		Integer j;
		Integer temp;
		Integer one=new Integer(1);
		
		long start = System.currentTimeMillis();
		
		Vector v = new Vector();		//Contains a chain
		
		for (int i=2; i<n; i++)
		{
				j = new Integer(i);
				
				while ((!v.contains(j)) && j<1000000)		//While no element repeats in the chain
				{
					v.addElement(j);
					j = sum_of_div(j);
				}
				if (j<1000000)
				{
					size=v.size();
					if (j.equals(v.firstElement()))
					{
						if (size>maxsize)
						{
							System.out.println(v.size());
							maxsize=size;
						}
					}					
				}
				v.removeAllElements();
		}
		long end = System.currentTimeMillis();
		System.out.println("Exec time: "+(end-start));
		
		//for (int i=1; i<10; i++)
		//	System.out.println(i+"\t"+count[i]);
	}
}