public class Problem1780 {
    public boolean checkPowersOfThree(int n) {
        while(n!=0){
            if(n%3==2)
                return false;
            n=n/3;
        }
        return true;
    }
    public static void main(String[] args) {
        Problem1780 p = new Problem1780();
        System.out.println(p.checkPowersOfThree(12));
    }
}
