public class decreasing {
   static void decrease(int x){

       if (x==0){
           return;
       }

       System.out.println(x);

       decrease( --x);
    }

    public static void main(String[] args) {
        decrease(5);
    }
}
