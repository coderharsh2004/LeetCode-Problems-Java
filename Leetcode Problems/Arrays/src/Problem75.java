public class Problem75 {
    public int[] sortColors(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<(len-i-1);j++){
                if(nums[j]>nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Problem75 p=new Problem75();
        int[] nums={2,0,2,1,1,0};
        int[] a=p.sortColors(nums);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
