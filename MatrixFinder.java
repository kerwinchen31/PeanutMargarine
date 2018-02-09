/*Our algorithm sort of works like a backwards L. Begin at the top right corner of the matrix. If the value in the matrix is smaller than the target, move down one row and check again. Once you get to a value in that last column that is larger than the target, stay in that row and move to the left, checking if the value is greater than the target. This way, you will find the target if it exists, otherwise, you will see (-1,-1) be returned. */
public class MatrixFinder
{
   public static void populate(int[][] x)
    {
	int n = 0;
	for(int q = 0; q < x.length; q++){
	    for(int p = 0; p < x.length; p++)
		{
		    x[q][p] = n;
		    n +=2;
		}
	}
    }
    
    public static void roar(int[][] matrix, int target){
	String retStr = "(-1,-1)";
	int dimension = matrix.length - 1;
	int x = 0;
	int y = dimension;
        long past, current;
	past = System.nanoTime();
	//System.out.println(dimension);
	//System.out.print(", ");
	try
	  {
 		while (matrix[x][y] != target){
		    if (matrix[x][y] < target) {
			x += 1;
		    }
		    else {
			y -= 1;
		    }
		}
		if (matrix[x][y] == target) {
		    retStr = "(" + x + "," + y + ")";
		}
		current =  System.nanoTime();
		System.out.println(/*dimension + ", " + */(current - past));
	  }
	catch(Exception e)
	  {
	      System.out.println(-1);
	  }
    }

}
