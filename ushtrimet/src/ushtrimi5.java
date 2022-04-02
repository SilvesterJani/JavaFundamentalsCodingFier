import java.util.Scanner;

public class ushtrimi5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        for(int i = 1; i < nr; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int i) {
        if(i == 1)
            return false;
        for(int j = 2; j < i; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}


