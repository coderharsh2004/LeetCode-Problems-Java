public class Problem867 {
    public int[][] transpose(int[][] matrix) {
        int transpose[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        Problem867 p=new Problem867();
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        int m[][]= p.transpose(nums);
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
