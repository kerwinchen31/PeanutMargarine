public class BigMatrix
{
    int[][] a;
    public BigMatrix()
    {
	a = new int[1000][1000];
	populate(a);
    }
    public BigMatrix(int d)
    {
	a = new int[d][d];
	populate(a);
    }
    public void populate(int[][] x)
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
    public String toString()
    {
	String ans = "";
	for(int[] d:a){
	    ans += "[";
	    for(int g:d){
		ans += g;
		ans += ", ";
	    }
	    ans += "]";
	    ans += "\n";
	}
	return ans;
    }
		
    public static void main(String[] args){
	BigMatrix x = new BigMatrix(50);
	System.out.println(x);
    }
}
		    
