import java.util.Scanner;

/**
 * test1
 */
public class Test4 {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // System.out.println(a);
        // System.out.println(func(a));
        // System.out.println("Hello World!");
        int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
        bubbleSort1(arr, arr.length);
        for(int i:arr){
          System.out.print(i+", ");
        }

    }
    public static void bubbleSort1(int[] n,int len){
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(n[j]>n[j+1]){
                    int tmp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = tmp;
                }
            }
        }

    }
}