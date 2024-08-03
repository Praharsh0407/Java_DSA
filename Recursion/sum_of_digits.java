public class sum_of_digits {
    public static int sum_digits(int n){
        if (n==0){
            return 0;
        }
        if (n<0){
            return -1;
        }
        // System.out.println(n);
        return n%10 +sum_digits(n/10);
    }
    public static void main(String[] args) {
        int x = 112;
        System.out.println(sum_digits(x));
    }
}
