import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int cnt=0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j])
                    cnt++;
            }
            if(cnt == 1){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
        }
        System.out.println(max);

    }
}