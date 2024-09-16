public class Problem66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
    public static void main(String[] args) {
        Problem66 p=new Problem66();
        int[] nums={1,2,3};
        int[] a=p.plusOne(nums);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
