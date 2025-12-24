import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        final int INT_MIN = Integer.MIN_VALUE;
        int max=INT_MIN;
        for(int i=0; i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<10; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);

    }
}