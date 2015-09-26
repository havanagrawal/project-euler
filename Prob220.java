import java.io.*;

class Prob220
{
	public static String Fractal (String s)
	{
		s = s.replace('a', 'x');
		s = s.replaceAll("b", "LFaLb");
		s = s.replaceAll("x", "aRbFR");
		
		return s;
	}

	public static void main(String args[])
	{
		String s = new String("Fa");
		
		for (int i=0; i<=11; i++)
		{	
			System.out.println("Iteration " +i+"\tLength: "+s.length());
			s = Fractal(s);
		}
		
		try
		{
		// Create file 
			FileWriter fstream = new FileWriter("Fractal.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(s);
			//Close the output stream
			out.close();
		}
		catch (Exception e)
		{
			//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}