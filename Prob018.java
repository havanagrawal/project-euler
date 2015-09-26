import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class Prob018 {
	public static int find_max(int x[][]) {
		int len=x.length;
		if (len==2) {	
			return (x[1][0]>x[1][1])?(x[0][0]+x[1][0]):(x[0][0]+x[1][1]);
		}
		else {
			int k1[][]=new int[len-1][len-1];
			int k2[][]=new int[len-1][len-1];
			
			for (int i=0; i<len-1; i++)
				for (int j=0; j<=i; j++) {
					k1[i][j]=x[i+1][j];
					k2[i][j]=x[i+1][j+1];
				}
			
			int f1=find_max(k1);
			int f2=find_max(k2);
			
			return f1>f2?(x[0][0]+f1):(x[0][0]+f2);
		}
	}

	public static void main(String args[]) {
		
		int x[][]=new int[100][100];
		String file_name = "E:/CP Programs/Java/Euler/triangle.txt";
	
		try
		{
			Readfile file = new Readfile(file_name);
			String[] Arr = file.OpenFile();

		/*	for (int i=0; i<15; i++)
			{
				System.out.println(Arr[i]);
			}
		*/
			int i, j, k=0;

			for (i=0; i<100; i++)
			{
				for (k=0, j=0; k<=i; j+=3, k++)
				{
					x[i][k]=Integer.parseInt((Arr[i]).substring(j, j+2));
				}
			}
			/*
			for (i=0; i<100; i++)
			{	for (j=0; j<=i; j++)
					System.out.print(" "+(x[i][j]));
				System.out.print("\n");
			}
			*/
			System.out.println(find_max(x));
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class Readfile
{
	private String path;

	public Readfile(String file_path)
	{
		path=file_path;
	}

	public String[] OpenFile() throws IOException
	{
		FileReader fr=new FileReader(path);
		BufferedReader txt = new BufferedReader(fr);
	

		String[] Data = new String[100];

		for (int i=0; i<100; i++)
		{
			Data[i]=txt.readLine();
		}

		txt.close();
		return Data;
	}
}