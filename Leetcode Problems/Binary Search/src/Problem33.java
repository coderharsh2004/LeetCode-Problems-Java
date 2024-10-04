import java.sql.SQLOutput;

public class Problem33 {
    public int search(int[] nums, int target) {
        int mid=0;
        int start = 0, end = nums.length - 1;int flag=0;
        while (start <= end) {
            mid = (end+start)/2;
            if (nums[mid]==target){
                flag=1;
                break;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if (nums[mid] <= target && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        if(flag==1)
            return mid;
        return -1;
    }
    public static void main(String[] args) {
        Problem33 p = new Problem33();
        int nums1[]={4,5,6,7,0,1,2};
        int target1=0;
        int nums2[]={4,5,6,7,0,1,2};
        int target2=3;
        int nums3[]={1};
        int target3=0;
        System.out.println(p.search(nums1,target1));
        System.out.println(p.search(nums2,target2));
        System.out.println(p.search(nums3,target3));
    }
}
