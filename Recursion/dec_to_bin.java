public class dec_to_bin {
    public static int convert(int num){
        if (num ==0){
            return 0;
        }
        return num%2 + 10*(convert(num/2));
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(convert(x));
    }
}
