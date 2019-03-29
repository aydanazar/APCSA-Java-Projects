//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> totals = new ArrayList<Integer>();
        for(int i = 0; i < m.length; i++) {
            int rowTotal = 0;
            for(int item: m[i]) {
                rowTotal += item;
            }
            totals.add(rowTotal);
        }
        return totals;
    }
    
    public static void printMatrixRows(int[][] matrix) {
        System.out.println("Row totals are :: " + 
                TotalRow.getRowTotals(matrix));
    }
}
