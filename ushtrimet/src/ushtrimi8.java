import java.util.Scanner;

public class ushtrimi8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char veprimi = sc.next().charAt(0);
        System.out.print("Nr1: ");
        float nr1 = sc.nextFloat();
        System.out.println("Nr2: ");
        float nr2 = sc.nextFloat();

        while(Character.compare(veprimi, '/') == 0 && nr2 == 0) {
            System.out.println("Numri 2 nuk mund te jete 0: ");
            nr2 = sc.nextFloat();
        }
        float result = 0;

        switch (veprimi) {
            case '+':
                result = nr1 + nr2;
                break;
            case '-':
                result = nr1 - nr2;
                break;
            case '*':
                result = nr1 * nr2;
                break;
            case '/':
                result = nr1 / nr2;
                break;
            default:
                System.out.println("Invalid");
        }

        System.out.println("Resultati:" + result);

    }
}

