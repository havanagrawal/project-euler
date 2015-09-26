class Prob064 {
	
	public static void main(String args[]) {
	
		int x;
		int n=1000;
		double og, temp;
		int count[]=new int[n+1];
		int ans=0;
		int max=0;
		int t=0;
		
		int a[]=new int[15];
		
		for (x=0; x<=n; x++)
			count[x]=1;
		
		
		for (x=2; x<=n; x++) {
			
			temp = Math.sqrt(x);
			og = (1/(temp-(int)temp));					
			temp=(1/(temp-(int)temp));					//This is subtracting a0
			temp=(1/(temp-(int)temp));					//This is subtracting a1
			while ((int)(10000*og)!=(int)(10000*temp)) {
			
				temp=(1/(temp-(int)temp));
				count[x]++;
			}
			if (count[x]>max) {
				max=count[x];
				t=x;
			}
			if (count[x]%2!=0)
				ans++;
		}
		System.out.println("The answer is: "+ans);		
		System.out.println(t+" count: "+max);
	}
}
