//Ans: 2269

import java.math.BigInteger;

class Binary {

	int num[]={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int i;
	
	Binary() {	
	}
	
	Binary(int x) {
		for (i=0; x!=0 && i<16; i++) {
			num[i]=x%10;
			x/=10;
		}
	}
	
	
	void addOne () {
	
		boolean added=false;
		for (i=0; !added; i++) {
			if (num[i]==0) {
				num[i]=1;
				added=true;
			}
			else {
				num[i]=0;
			}
		}
	}
	
	int countOnes() {
		int count=0;
		for (i=0; i<16; i++)
			if (num[i]==1)
				count++;
				
		return count;
	}
	
	public String toString() {
		String s="";
		for (i=0; i<16; i++)
			s=num[i]+s;
		
		return s;
	}
}				

class Fraction {
	
	static BigInteger zero=new BigInteger("0");
	static BigInteger one=new BigInteger("1");
	
	BigInteger num, den;
	
	public static BigInteger GCD(BigInteger i, BigInteger j)
	{
		while (i.compareTo(zero)!=0 && j.compareTo(zero)!=0)
		{
			if (i.compareTo(j)>0)
				i=i.mod(j);
			else
				j=j.mod(i);
		}

		if (j.compareTo(zero)==0)
			return i;
		
		return j;
	}
	
	Fraction() {
		num=zero;
		den=one;
	}
	
	Fraction (BigInteger n, BigInteger d) {
		num=n;
		den=d;
	}
	
	Fraction mul (Fraction f) {
		
		Fraction k=new Fraction();
		
		k.num = num.multiply(f.num);
		k.den = den.multiply(f.den);
		
		BigInteger gcd=GCD(num, f.den);
		
		k.num=(k.num).divide(gcd);
		k.den=(k.den).divide(gcd);
		
		return k; 
	}
	
	Fraction add (Fraction f) {
		
		Fraction k=new Fraction();
		
		k.num = (num.multiply(f.den)).add(den.multiply(f.num));
		k.den = den.multiply(f.den);
		
		BigInteger gcd=GCD(k.num, k.den);
		k.num=(k.num).divide(gcd);
		k.den=(k.den).divide(gcd);	
		
		return k;
	}
	
	Fraction sub (Fraction f) {
		
		Fraction k=new Fraction();
		
		k.num = (num.multiply(f.den)).subtract(den.multiply(f.num));
		k.den = den.multiply(f.den);
		
		BigInteger gcd=GCD(k.num, k.den);
		
		k.num=(k.num).divide(gcd);
		k.den=(k.den).divide(gcd);
		
		return k;
	}
	
	public String toString() {
	
		return num+"/"+den;
	}
}

class Prob121
{
	static BigInteger zero=new BigInteger("0");
	static BigInteger one=new BigInteger("1");

	public static BigInteger fact(long x) {
		long ans=1;
		for (int i=2; i<=x; i++)
			ans*=i;
			
		return new BigInteger(""+ans);
	}

	public static BigInteger sum(long x) {
	
		long ans=0;
		for (int i=1; i<=x; i++)
			ans+=i;
			
		return new BigInteger(""+ans);
	}
	
	public static void main(String args[]) {
		
		Binary b=new Binary();
		
		long start=System.currentTimeMillis();
		
		int n=15;
		Fraction P[]=new Fraction[n+1];
		int count=0;
		
		int k;
		Fraction f=new Fraction();
		
		Fraction onef=new Fraction();
		
		Fraction ans=new Fraction(zero, one);
		
		for (k=0; k<=n; k++)
			P[k]=new Fraction();
		
		P[n] = new Fraction(one, fact(n+1));
		P[n-1] = new Fraction((sum(n)), fact(n+1));
		
		do {
		
			count=b.countOnes();

			if (count>n/2 && count<=n-2) {
				f.num=f.den=one;
				
				for (k=0; k<n; k++) {
					if (b.num[k]==1)
						f=f.mul(new Fraction(one, new BigInteger(""+(k+2))));
					else
						f=f.mul(new Fraction(new BigInteger(""+(k+1)), new BigInteger(""+(k+2))));
				}
				P[count]=(P[count]).add(f);
			}
			b.addOne();
		}
		while (count!=n);
		
		for (k=0; k<=n; k++)
			P[k]=P[k].sub(onef);
		
		for (k=n/2 + 1; k<=n; k++)
			System.out.println(k+" blue discs: \t"+P[k]);
			
		for (k=n/2 + 1; k<=n; k++)
			ans=ans.add(P[k]);
		
		long end=System.currentTimeMillis();
		
		System.out.println("Probability of winning is: "+ans);
		System.out.println("Minimum money to be allocated is: "+((ans.den).divide(ans.num)));
		System.out.println("Exec time: "+(end-start));
	}
}