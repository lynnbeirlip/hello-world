public class NestedForLoops extends TwoDArrayOriginal{
			
		NestedForLoops()
		{
			super();
		}

		public void printStrArray()
		{
			String[][] strPrint = returnStr();
			for (int i = 0; i < strPrint.length;i++)
			{
				for (int j = 0; j < strPrint[0].length;j++)
				{
					System.out.println(strPrint[i][j]);
				}
				
			}
		}
		
	}


}
