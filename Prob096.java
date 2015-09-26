//Make a class Sudoku_element, signifying one box or one grid element.
//Each object has an int, char, and a static boolean array 1-9, all preset to true.
//int -> number, char -> quad (a-i)
//If the number(index of array) is present anywhere in row, column or respective 3x3grid, it sets to false.
//If only one true is present for the object, int sets to that number.

class Sudoku_ele
{
	int num;
	char quad;
	boolean isThere[]=new boolean[10];

	Sudoku_ele()
	{
		num=0;
		quad=' ';
		for (int j=0; j<10; j++)
			isThere[j]=true;

	}
}

class Prob96
{
	public static void main(string args[])
	{
		Sudoku_ele s[]=new Sudoku_ele[82];

		for (int i=0; i<82; i++)
			s[i]=new Sudoku_ele();

		
	}
}