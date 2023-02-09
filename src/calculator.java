import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     while (true){
        float x = sc.nextInt();
        float y = sc.nextInt();
        System.out.println("for add press 1");
        System.out.println(("for sub press 2"));
        System.out.println("for multiply press 3");
        System.out.println("for divide press 4");
        int z = sc.nextInt();
        if (z == 1) {
            System.out.println(x + y);
        } else if (z == 2) {
            System.out.println(x - y);
        } else if (z == 3) {
            System.out.println(x * y);
        } else if (z == 4) {
            System.out.println(x / y);
        }
    }
    }
}
