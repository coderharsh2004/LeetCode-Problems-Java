public class Problem1480 {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        return runningSum;
    }
    public static void main(String[] args) {
        Problem1480 p=new Problem1480();
        int[] nums={1,2,3,4};
        int[] a=p.runningSum(nums);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
