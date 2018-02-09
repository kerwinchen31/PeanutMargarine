/*Our algorithm sort of works like a backwards L. Begin at the top right corner of the matrix. If the value in the matrix is smaller than the target, move down one row and check again. Once you get to a value in that last column that is larger than the target, stay in that row and move to the left, checking if the value is greater than the target. This way, you will find the target if it exists, otherwise, you will see (-1,-1) be returned. */
public class MatrixFinder2
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
 
    public static void main(String[] args) {
	/*
	int[][] matrix = {{1,2,3}, {2,3,4}, {3,4,5}};
        System.out.println(roar(matrix, 4));
        System.out.println(roar(matrix, 9));
        int[][] matrix2 = {{1,3,5}, {3,7,8}, {5,12,15}};
        System.out.println(roar(matrix2, 8));
        System.out.println(roar(matrix2, 20));
        int[][] matrix3 = {{1,20,21}, {3,23,33}, {4,24,34}};
        System.out.println(roar(matrix3, 33));
        System.out.println(roar(matrix3, 0));
        int[][] matrix4 = {{1,2,4,7}, {3,5,8,11}, {6,9,12,16}, {10,13,15,16}};
        System.out.println(roar(matrix4, 6));
        System.out.println(roar(matrix4, 19));
        int[][] matrixN = {};
        System.out.println(roar(matrixN, 5));
        int[][] matrixO = {{1}};
        System.out.println(roar(matrixO, 3));
        System.out.println(roar(matrixO, 1));
	*/
	int q = 50000;
	for (int x = 1000; x < q; x += 200){
	    int[][] k = new int[x][x];
	    MatrixFinder2.populate(k);
	    roar(k, 2 * x * (x - 1));
	}
	
    }
}
