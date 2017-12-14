public class NestedForLoopsAnswer {
	public static void main (String[] args) {
		
		String texts[][] = {
				{"dog", "cat", "bat"},
				{"fox", "box", "hat"}
		};
				
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(texts[row][col]);
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}
	