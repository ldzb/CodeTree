import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        int[] brr = new int[b];
        for(int i=0; i<a; i++)
            arr[i]=sc.nextInt();
        for(int i=0; i<b; i++)
            brr[i]=sc.nextInt();
        int cntA=-1;
        int cntB=-1;
        int cntC=0;

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(arr[i]==brr[j]){
                    cntA=i;
                    cntB=j;
                    break;
                }
            }
        }
        for(int i=0;i<=cntB; i++){
            if(arr[cntA+i]==brr[i])
                cntC++;
        }
        if(cntC==cntB)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}