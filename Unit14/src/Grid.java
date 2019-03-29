//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(rows = 0;  rows < grid.length; rows++)
        {
          for( cols = 0; cols < grid[rows].length; cols++)
              {
                  grid[rows][cols] = vals[(int)(Math.random()*5)];    
              }
       }
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int j = 0;
		String firstVal = vals[j];
		int compare = 0;
		int most = 0;
		String mostVal = "";
		for (int i = 0; i < vals.length; i++) {
			for (int n = 0; n < vals.length; n++) {
				if ( vals[n].equals(firstVal)) most++;
				if (most > compare) {
					compare = most;
					mostVal = vals[n];
					}
			}
		firstVal = vals[j++];
		}
		return mostVal;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int i =  0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
			if (grid[i][j] == val) count++;
			}
		}
		return count;
	}

	//display the grid
	public String toString() {
		String output="";
        for(int rows = 0; rows < grid.length; rows++){
        	for(int cols = 0; cols < grid[rows].length; cols++){    
        		output += (grid[rows][cols] + "  "  );    
        	}
        	output += "\n";
        }
    return output;
	
	}
}