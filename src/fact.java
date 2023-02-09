public class fact {
    static int fact(int x){
          if (x==0){
               return 1 ;
          }
          int ans=1;
          ans = x*fact( x-1);


          return ans;
    }

    public static void main(String[] args) {
        System.out.println(fact(6));
    }
}
