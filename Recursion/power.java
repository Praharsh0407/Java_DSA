public class power {
    public static int pow(int x, int y){
        if (y==0){
            return 1;
        }
        if (y<0){
            return -1;
        }
        return x*pow(x,y-1);
    }

    public static void main(String[] args) {
        int x = 4;
        int y = -2;
        System.out.println(pow(x,y));
    }
}
