public class Problem1470 {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i*2]=nums[i];
            ans[i*2+1]=nums[i+n];
        }
        return ans;
    }
    public static void main(String[] args) {
        Problem1470 p=new Problem1470();
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] a=p.shuffle(nums,n);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
