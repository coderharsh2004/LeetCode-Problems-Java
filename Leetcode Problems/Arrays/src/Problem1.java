public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int ans[]=new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Problem1 p=new Problem1();
        int[] nums={2,7,11,15};
        int target=9;
        int[] a=p.twoSum(nums,target);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
