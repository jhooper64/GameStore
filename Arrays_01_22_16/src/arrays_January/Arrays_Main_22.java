package arrays_January;

public class Arrays_Main_22 
{


	public static void main(String[] args)
	{
		/*int [][] twoDim = new int [5][5];

		int a = (twoDim.length);//5
		int b = (twoDim[0].length);//5

		for(int i = 0; i < a; i++){ // 1 2 3 4 5
		    for(int j = 0; j <b; j++) { // 1 2 3 4 5
		        int x = (i+1)*(j+1);
		        System.out.println(twoDim.length);
		        
		}//end of for i*/
		
		
		/*int rows = 5;
		int cols = 10;

		int[] multD = new int[rows * cols];

		for (int r = 0; r < rows; r++)
		{
		  for (int c = 0; c < cols; c++)
		  {
		     int index = r * cols + c;
		     multD[index] = index * 2;
		     
		     multD[r][c] = x;
		        if (x < 10) {
		            System.out.print(" " + x + " ");
		        } else {
		            System.out.print(x + " ");
		        }
		    }//end of for J
		    System.out.println(); 
		  }*/
		/*String[][] cartoons = 
			
			{{ "Flintstones", "Fred", "Wilma", "Pebbles", "Dino" },
		        { "Rubbles", "Barney", "Betty", "Bam Bam" },
		        { "Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie", "Astro" },
		        { "Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred", "Daphne" } };
			
		    for (int i = 0; i < cartoons.length; i++) 
		    {
		      System.out.print(cartoons[i][0] + ": ");
		      for (int j = 1; j < cartoons[i].length; j++) 
		      {
		        System.out.print(cartoons[i][j] + " ");
		      }
		      System.out.println();
		    }*/
		
		
		    
			double[][][] numbers = new double[][][]	{
			    {
				{  12.44, 525.38,  -6.28,  2448.32, 632.04 },
				{-378.05,  48.14, 634.18,   762.48,  83.02 },
				{  64.92,  -7.44,  86.74,  -534.60, 386.73 }
			    },
			    {
				{  48.02, 120.44,   38.62,  526.82, 1704.62 },
				{  56.85, 105.48,  363.31,  172.62,  128.48 },
				{  906.68, 47.12, -166.07, 4444.26,  408.62 }
			    }
			};

			for(int page = 0; page < 2; page++)
		            for(int table = 0; table < 3; table++)
		                for(int value = 0; value < 5; value++)
		        	    System.out.println("Number = " +
					numbers[page][table][value]);
		
		
	}
		
	

}
