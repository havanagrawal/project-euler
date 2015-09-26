//Ans: 40886
//Exec time: 47ms


import java.math.BigInteger;

class Prob080
{
	public static void main(String args[])
	{
		BigInteger zero = new BigInteger(""+0);
		BigInteger one = new BigInteger(""+1);
		BigInteger two = new BigInteger(""+2);
		BigInteger ten = new BigInteger(""+10);
		BigInteger twenty = new BigInteger(""+20);
		BigInteger hun = new BigInteger(""+100);
		BigInteger i;
		BigInteger ans=zero;
		BigInteger nm=two;
		BigInteger x, y;
		BigInteger sum=zero;
		
		int n=100;
		int dig=0;
		
		long start=System.currentTimeMillis();
		
		for (x=two; x.compareTo(hun)<0; x=x.add(one))
		{
			dig=0;
			nm=x;
			ans=zero;
			while (dig<n)
			{
			
				for (i=zero; (i.multiply((twenty.multiply(ans)).add(i))).compareTo(nm)<=0; i=i.add(one)){}			//i*(20*ans+i)<=nm
			
				i=i.subtract(one);
		
				y=i.multiply((twenty.multiply(ans)).add(i));
		
				nm=nm.subtract(y);							//nm-=i*(20*ans+i);
		
				ans=(ten.multiply(ans)).add(i);				//ans=(10*ans)+i;
				sum=sum.add(i);
			
				nm=nm.multiply(hun);						//nm*=100;
				dig++;
			}
		}
		for (x=two; x.compareTo(ten)<0; x=x.add(one))		//Subtract all perfect squares
			sum=sum.subtract(x);
			
		long end=System.currentTimeMillis();	
			
		System.out.println(sum);
		System.out.println("Exec time: "+(end-start));
	}
}