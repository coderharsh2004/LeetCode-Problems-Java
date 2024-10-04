public class Problem26 {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Problem26 p = new Problem26();
        System.out.println(p.removeDuplicates(new int[]{1,1,2,3,3,4}));
        System.out.println(p.removeDuplicates(new int[]{1,1,2,3,3,4,4,4,5,5}));
    }
}
