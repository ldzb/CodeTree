import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = 100;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]-arr[i]>=0 && arr[j]-arr[i]<result)
                    result = arr[j]-arr[i];
            }
        }
        System.out.println(result);
    }
}