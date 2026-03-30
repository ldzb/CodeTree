import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr= new int[10];
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        int m_max = 0;
        int m_min = 1000;

        for(int i=0; i<10; i++){
            if(arr[i] < 500){
                if(arr[i] > m_max)
                    m_max = arr[i];
            }
            else{
                if(arr[i]< m_min)
                    m_min = arr[i];
            }
        }

        System.out.print(m_max+" "+m_min);
    }
}