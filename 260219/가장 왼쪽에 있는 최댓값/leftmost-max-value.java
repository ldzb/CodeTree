import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int cnt = n;
        while(cnt>0){
            int max = Integer.MIN_VALUE;
            for(int i=0; i<cnt; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            for(int i=0; i<cnt; i++){
                if(arr[i]==max){
                    cnt = i;
                    System.out.print((i+1)+" ");
                    break;
                }
            }
        }
    
    }
}