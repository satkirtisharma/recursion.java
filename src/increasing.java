public class increasing {
    static void increase(int x){
        if (x==0){
            return ;
        }
        increase(--x);
        System.out.println(x);

    }

    public static void main(String[] args) {
        increase(5);
    }
}
