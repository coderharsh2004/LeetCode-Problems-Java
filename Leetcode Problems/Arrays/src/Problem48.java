public class Problem48 {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows / 2;  i++) {
            for (int j = 0; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows-i-1][j];
                matrix[rows-i-1][j] = temp;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Problem48 p=new Problem48();
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        p.rotate(nums);
    }
}
