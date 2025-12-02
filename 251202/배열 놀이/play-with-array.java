import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<q; i++){
            int x = sc.nextInt();
            if(x == 1){
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            }
            else if(x == 2){
                int b = sc.nextInt();
                int idx = 0; // 못 찾았을 때를 대비해 기본값을 0으로 설정
                
                for(int j=0; j<n; j++){
                    if(arr[j] == b){
                        idx = j + 1; // 찾으면 위치(index + 1) 저장
                        break;       // 가장 먼저 나오는 것을 찾아야 하므로 찾자마자 중단
                    }
                }
                // 찾았으면 위치가, 못 찾았으면 초기값 0이 출력됨
                System.out.println(idx);
            }
            else if(x == 3){
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j=(s-1); j<e; j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}