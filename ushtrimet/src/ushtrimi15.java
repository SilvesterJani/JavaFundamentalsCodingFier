import java.util.Scanner;

public class ushtrimi15 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i=0; i<10; i++){
            arr[i]=sk.nextInt();
        }

        for (int i=0; i<10; i++){
            for (int j=i+1; j<10; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}