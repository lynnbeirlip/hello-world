public class ArrayAppOriginal {

	private double ary [];
	
	ArrayAppOriginal()
	{
		double temp [] = {9.9, 8.8, 7.7, 6.6, 5.5};
		ary = temp;
	}
	
	public double [] getArray()
	{
		return ary;
	}
	
	public void printSecond()
	{
		System.out.println("Second element of the array is: ");
		System.out.println(ary[1]);
	}
	
}

