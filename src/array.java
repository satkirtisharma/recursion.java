public class array {
    static void printarray(int []arr,int s,int i){
        if(i>=s){
            return;
        }
        System.out.println(arr[i]);
        printarray(arr,s,i+1);
    }

    public static void main(String[] args) {
        int[]ar={1,2,73,76,76,6475,4};
        printarray(ar,ar.length,0);
    }
}
