import java.util.Scanner;
class Problem1920 {
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<(nums.length);i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Problem1920 p=new Problem1920();
        int[] nums={0,2,1,5,3,4};
        int[] a=p.buildArray(nums);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}