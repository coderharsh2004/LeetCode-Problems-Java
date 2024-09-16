public class Problem1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Problem1929 p=new Problem1929();
        int[] nums={1,3,2,1};
        int[] a=p.getConcatenation(nums);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
