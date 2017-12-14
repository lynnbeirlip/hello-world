
public class ArrayAppFor {
	public static void main (String[] args) {
		double[] values = {9.9, 8.8, 7.7, 6.6, 5.5};
		
		for(int i=0; i<values.length; i++) {
			System.out.printf("%.2f ", values[i]);
		}
	}
}