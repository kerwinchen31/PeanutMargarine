public class MFDriver
{  
    public static void main(String[] args) {
	int q = 50000;
	for (int x = 1000; x < q; x += 200){
	    int[][] k = new int[x][x];
	    MatrixFinder.populate(k);
	    MatrixFinder.roar(k, 2 * x * (x - 1));
	}
	
    }
}
