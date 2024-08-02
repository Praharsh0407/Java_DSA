public class Fibonacci {
    public static int fibonacci(int n){
        if (n<1){
            return -1;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println(fibonacci(x));
    }
}
