
public class TwoDArrayOriginal {
	
	String[][] str = new String[2][3];
	
	//A2DArray()
	public void main ()

	{
		String [][] temp = {{"a", "b", "c"}, {"x", "y", "z"}};
		str = temp;
	}
	
	public void printString ()
	{
		//System.out.println(Arrays.deepToString(str));
		System.out.println(str[1][2]);
	}
	
	public String[][] returnStr()
	{
		return str;
	}
}
