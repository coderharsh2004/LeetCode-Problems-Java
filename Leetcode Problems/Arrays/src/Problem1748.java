public class Problem1748 {
    public int sumOfUnique(int[] nums) {
        int len=nums.length;
        int flag=0,sum=0;
        for(int i=0;i<len;i++){
            flag=0;
            for(int j=0;j<len;j++){
                if(i!=j && nums[i]==nums[j])
                    flag=1;
            }
            if(flag==0)
                sum=sum+nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Problem1748 p=new Problem1748();
        System.out.println(p.sumOfUnique(new int[]{1,2,3,2}));
        System.out.println(p.sumOfUnique(new int[]{1,1,1,1,1}));
        System.out.println(p.sumOfUnique(new int[]{1,2,3,4,5}));
    }
}
