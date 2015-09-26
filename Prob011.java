/*What is the greatest product of four adjacent numbers in any direction (up, down, left, right, or diagonally) in the 20×20 grid?
Ans:70600674
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class Prob11
{
	public static void main(String args[]) throws IOException
	{
		String file_name = "E:/CP Programs/Java/Euler/Prob11Data.txt";
	
		try
		{
			Readfile file = new Readfile(file_name);
			String[] Arr = file.OpenFile();

			/*for (int i=0; i<20; i++)
			//{
			//	System.out.println(Arr[i]);
			}*/

			int i, j, k=0;
			int Array[][]=new int [20][20];

			for (i=0; i<20; i++)
			{
				for (k=0, j=0; k<20; j+=3, k++)
				{
					Array[i][k]=Integer.parseInt((Arr[i]).substring(j, j+2));
				}
			}

			for (i=0; i<20; i++)
			{	for (j=0; j<20; j++)
					System.out.print(" "+(Array[i][j]));
				System.out.print("\n");
			}
			int ans=0, temp, x=0, y=0;

			for (i=0; i<20; i++)
			{
				for (j=0; j<17; j++)
				{
					temp=(Array[i][j])*(Array[i][j+1])*(Array[i][j+2])*(Array[i][j+3]);
	
					if (temp>ans)
					{	ans=temp; x=i; y=j;}

					temp=(Array[j][i])*(Array[j+1][i])*(Array[j+2][i])*(Array[j+3][i]);
		
					if (temp>ans)
					{	ans=temp; y=i; x=j;}

				}
			}

			for (i=0; i<17; i++)
			{
				for (j=0; j<17; j++)
				{
					temp=Array[i][j]*Array[i+1][j+1]*Array[i+2][j+2]*Array[i+3][j+3];

					if (temp>ans)
					{	ans=temp; x=i; y=j;}

					temp=Array[19-i][j]*Array[18-i][j+1]*Array[17-i][j+2]*Array[16-i][j+3];

					if (temp>ans)
					{	ans=temp; x=19-i; y=j;}
				}
			}

			System.out.println((ans)+" is the answer!"+(x)+", "+(y));

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
	

		String[] Data = new String[20];

		for (int i=0; i<20; i++)
		{
			Data[i]=txt.readLine();
		}

		txt.close();
		return Data;
	}
}