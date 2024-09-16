public class Problem1572 {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat[0].length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==j)
                    sum=sum+mat[i][j];
                else if((i+j)==(mat.length-1))
                    sum=sum+mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Problem1572 p=new Problem1572();
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        int m=p.diagonalSum(nums);
        System.out.println("Maximum Wealth:"+m);
    }
}
