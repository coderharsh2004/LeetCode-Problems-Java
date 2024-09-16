public class Problem1672 {
    public int maximumWealth(int[][] accounts) {
        int a[]=new int[accounts.length];int sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                sum=sum+accounts[i][j];
            }
            a[i]=sum;
            sum=0;
        }
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Problem1672 p=new Problem1672();
        int[][] nums={{1,2,3},{3,2,1}};
        int m=p.maximumWealth(nums);
        System.out.println("Maximum Wealth:"+m);
    }
}
