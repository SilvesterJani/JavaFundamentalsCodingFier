import java.util.Scanner;

public class ushtrimi10 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}