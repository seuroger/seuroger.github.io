import java.util.Scanner;

/**
 * test1
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);
        System.out.println(func(a));
        System.out.println("Hello World!");

    }
    public static int func(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return func(n-1)+func(n-2);
    }
}