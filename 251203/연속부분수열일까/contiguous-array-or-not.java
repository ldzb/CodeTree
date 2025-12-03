import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        int[] brr = new int[b];
        
        for(int i=0; i<a; i++) arr[i]=sc.nextInt();
        for(int i=0; i<b; i++) brr[i]=sc.nextInt();

        boolean isSubarray = false; // 찾았는지 결과를 저장할 변수

        // 1. arr을 훑으면서 시작점을 찾습니다.
        // i는 a - b 까지만 가면 됩니다. (남은 공간이 b보다 작으면 어차피 못 들어감)
        for(int i = 0; i <= a - b; i++) {
            
            // 2. 만약 arr[i]가 brr의 첫 글자(brr[0])와 같다면? 검사 시작!
            if (arr[i] == brr[0]) {
                
                // 여기서부터 b개만큼 연속으로 똑같은지 확인합니다.
                int cntC = 0;
                for(int j = 0; j < b; j++) {
                    if (arr[i + j] == brr[j]) {
                        cntC++;
                    }
                }

                // b개를 다 확인했는데 개수가 똑같다면? 찾은 것!
                if (cntC == b) {
                    isSubarray = true;
                    break; // 찾았으니 더 이상 arr을 뒤져볼 필요 없음
                }
            }
        }

        if(isSubarray)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}