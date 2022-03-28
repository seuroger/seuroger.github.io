import java.util.*;

/**
 * test1
 */
public class Test5 {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // System.out.println(a);
        // System.out.println(func(a));
        // System.out.println("Hello World!");
        int[] arr = {1,2,2,22};
        solution(arr, arr.length);
        // bubbleSort1(arr, arr.length);
        // for(int i:arr){
        //   System.out.print(i+", ");
        // }

    }
    public static void solution(int[] n,int len){
        Set<Integer> set = new HashSet<Integer>();
        for(int i:n){
            if(!set.add(i)){
                System.out.println("true");
                
            }
        }
        System.out.println("false");
    }
}