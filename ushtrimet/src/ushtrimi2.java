import java.util.Scanner;

public class ushtrimi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vendos peshen e trupit");
        float weight = scanner.nextFloat();
        System.out.println("vendos gjatesin");
        int height = scanner.nextInt();
        float gjatesiaMeter = (float) height / 100;
        float bmi = weight / (gjatesiaMeter * gjatesiaMeter);
        double bmi2 = weight / Math.pow(gjatesiaMeter, 2);
        System.out.println(bmi);

        if (bmi < 18.5 || bmi > 24.9) {
            System.out.println("not optimal");
        } else {
            System.out.println("optimal");


        }
    }
}