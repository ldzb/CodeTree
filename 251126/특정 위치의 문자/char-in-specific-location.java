import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        
        char A = sc.next().charAt(0);
        
        int cnt = -1;
        
        for(int i = 0; i < 6; i++) {
            if(arr[i] == A) {
                cnt = i;
                break;
            }
        }
        
        if(cnt == -1)
            System.out.println("None");
        else
            System.out.println(cnt);
    }
}