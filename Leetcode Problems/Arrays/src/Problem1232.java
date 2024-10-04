public class Problem1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int n=coordinates.length;int c=0;
        int dx=coordinates[1][0]-coordinates[0][0];
        int dy=coordinates[1][1]-coordinates[0][1];
        for(int i=1;i<n-1;i++){
            int x=coordinates[i+1][0]-coordinates[i][0];
            int y=coordinates[i+1][1]-coordinates[i][1];
            if(x*dy==y*dx)
                c++;
            else
                continue;
        }
        if(c==(n-2))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Problem1232 p=new Problem1232();
        int test1[][]={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        int test2[][]={{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(p.checkStraightLine(test1));
        System.out.println(p.checkStraightLine(test2));
    }
}
