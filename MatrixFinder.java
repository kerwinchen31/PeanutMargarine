public class MatrixFinder
{
    public String asd(int[][] matrix, int target)
    {
	int dimension = matrix.length - 1;
	int x = 0;
	int y = dimension;
	while ( matrix[x][y] != target ) &&
