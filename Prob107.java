//Optimize the given network for minimum spanning (minimum weighted path)
//Using Prim's Algorithm

//Ans:The maximum weight is: 261832
//The sum is: 2153

import java.util.Scanner;
import java.io.*;

class Prob107
{
	public static void main(String args[])
	{
		//n=No of nodes
		int n=40;
	
		int adj[][]=new int[n][n];
		boolean selected[]=new boolean[n];
		int smallest_edge;
		int node1=0, node2=0;
		
		//node=Initial Node
		int node=0;
		selected[node]=true;
		
		int i, j, k;
		int sum=0, max=0;
		int edges=0;
		
		Scanner sc=new Scanner(System.in);
	
		String file_name = "E:/CP Programs/Java/Euler/Prob107Data.txt";
	
		try
		{
			FileInputStream fstream = new FileInputStream("E:/CP Programs/Java/Euler/Prob107Data.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			i=0;
			while ((strLine = br.readLine()) != null)   
			{
				String s[]=strLine.split(" ");
				
				for (j=0; j<=i; j++)
				{
					//System.out.print(s[j]+" ");
					adj[i][j]=adj[j][i]=Integer.parseInt(s[j]);
				}
				i++;
				//System.out.println();
			}

			in.close();
		}
		catch (Exception e)
		{
			System.err.println("Error: " + e.getMessage());
		}
		
		for (int p=0; p<n; p++)
		{
			for (int t=0; t<=p; t++)
			{
				//System.out.print("Enter adj["+p+"]["+t+"]: ");
				//adj[p][t]=adj[t][p]=sc.nextInt();
				max+=adj[p][t];
			}
		}
		
		
		for (k=0; k<n-1; k++)
		{
			smallest_edge=1000;
			for (i=0; i<n; i++)
			{
				if (selected[i]==true)
				{
					//System.out.println("Node "+i+" is being considered now.");
					for (j=0; j<n; j++)
					{
						if (adj[i][j]!=0 && adj[i][j]<smallest_edge && selected[j]!=true)
						{
							node1=i;
							node2=j;
							smallest_edge=adj[i][j];
						}
					}
				}
			}
			
			selected[node1]=true;
			selected[node2]=true;
			System.out.println("Edge: "+node1+", "+node2);
			sum+=smallest_edge;
		}
		
		System.out.println("The maximum weight is: "+max);
		System.out.print("The sum is: "+sum);
		
	}
}
		