public class hcf {
    public static int gcd(int x, int y) {
        int a = Math.max(x, y);
        int b = Math.min(x,y);
        if (a<0||b<0){ 
            return -1;
        }
        if (b ==0){
            return a;
        }
        return gcd(b,a%b);

    }
    public static void main(String[] args) {
        int x = 8;
        int y = 12;
        System.out.println(gcd(x,y));
    }
}
