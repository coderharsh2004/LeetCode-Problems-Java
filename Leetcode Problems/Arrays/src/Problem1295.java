public class Problem1295 {
    public int findNumbers(int[] nums) {
        int len=nums.length;int ans=0;
        for(int i=0;i<len;i++){
            int c=0;
            while(nums[i]!=0){
                c++;
                nums[i]=nums[i]/10;
            }
            if(c%2==0)
                ans++;
            else
                continue;
        }
        return ans;
    }
    public static void main(String[] args) {
        Problem1295 p=new Problem1295();
        int[] nums={12,345,2,6,7896};
        int a=p.findNumbers(nums);
        System.out.println("Answer:"+a);
    }
}
