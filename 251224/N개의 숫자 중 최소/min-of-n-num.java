import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            if(arr[i]<min)
                min=arr[i];
        }
        for(int i=0; i<n; i++){
            if(arr[i]==min)
                cnt++;
        }
        System.out.print(min+" "+cnt);
    }
}