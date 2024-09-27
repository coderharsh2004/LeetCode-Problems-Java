public class Problem300 {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int output[]=new int[n];
        output[0]=1;
        for(int i=1;i<n;i++){
            output[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]>=nums[i])continue;
                int pa=output[j]+1;
                if(pa>output[i])
                    output[i]=pa;
            }
        }
        int best=1;
        for(int i=0;i<n;i++){
            if(output[i]>best)
                best=output[i];
        }
        return best;
    }
    public static void main(String[] args) {
        Problem300 p=new Problem300();
        int nums1[]={10,9,2,5,3,7,101,18};
        int nums2[]={0,1,0,3,2,3};
        int nums3[]={7,7,7,7,7,7,7};
        System.out.println(p.lengthOfLIS(nums1));
        System.out.println(p.lengthOfLIS(nums2));
        System.out.println(p.lengthOfLIS(nums3));
    }
}
