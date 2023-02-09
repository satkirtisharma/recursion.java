public class both_inc_dec {
    static void incdec(int x){

        if (x==0)
            return;
        System.out.println(x);

        incdec(x-1);
        System.out.println(x);
    }
    public static void main(String[] args) {
        incdec(5);
    }
}
