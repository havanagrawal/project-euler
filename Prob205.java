//Ans: 0.5731441

class Prob205
{
	public static void main(String args[])
	{
		int tot1[] = new int[37];			//Cubic Colin
		int tot2[] = new int[37];			//Pyramidal Pete
		
		long ctotal=0;
		long ptotal=0;
		
		long wins=0;
		int temp=0;
		
		long sample=0;
		
		for (int i=0; i<37; i++)
		{
			tot1[i]=0;
			tot2[i]=0;
		}
		
		int x1, x2, x3, x4, x5, x6, x7, x8, x9;
		
		for (x1=1; x1<=6; x1++)
			for (x2=1; x2<=6; x2++)
				for (x3=1; x3<=6; x3++)
					for (x4=1; x4<=6; x4++)
						for (x5=1; x5<=6; x5++)
							for (x6=1; x6<=6; x6++)
								tot1[x1+x2+x3+x4+x5+x6]++;
		
		for (x1=1; x1<=4; x1++)
			for (x2=1; x2<=4; x2++)
				for (x3=1; x3<=4; x3++)
					for (x4=1; x4<=4; x4++)
						for (x5=1; x5<=4; x5++)
							for (x6=1; x6<=4; x6++)
								for (x7=1; x7<=4; x7++)
									for (x8=1; x8<=4; x8++)
										for (x9=1; x9<=4; x9++)
											tot2[x1+x2+x3+x4+x5+x6+x7+x8+x9]++;
				

	//	for (int j=6; j<37; j++)
	//		System.out.println(j+": \t"+tot1[j]);
			
	//	System.out.println();					
	//	for (int j=9; j<37; j++)
	//		System.out.println(j+": \t"+tot2[j]);
			
		for (int k=0; k<37; k++)
		{
			ctotal += tot1[k];
			ptotal += tot2[k];
		}
		sample = ptotal*ctotal;
		System.out.println("Total possibilities of Colin: "+ctotal);
		System.out.println("Total possibilities of Pete: "+ptotal);
		System.out.println("Total possibilitites: "+sample);
		
		
		for (int i=9; i<37; i++)
		{
			for (int j=6; j<i; j++)
				temp+=tot1[j];
				
			wins+=tot2[i]*temp;
			temp=0;
		}

		double ans=(double)wins/(double)sample;
		
		System.out.println("No. of wins: "+wins);
		System.out.println("Probability of Pete winning is: "+ans);
				
	}
}