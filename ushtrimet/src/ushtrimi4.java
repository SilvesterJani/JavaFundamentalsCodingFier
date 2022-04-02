import java.util.Scanner;

public class ushtrimi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numer = sc.nextInt();
        while(numer < 1) {
            System.out.println("Vendosni nje numer >= 1");
            numer = sc.nextInt();
        }
        for(int i = 1; i <= numer; i++) {
            if((i % 3 == 0) && (i % 7 ==0)) {
                System.out.println("Fizz Buzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}