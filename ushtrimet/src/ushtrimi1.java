import java.util.Scanner;

public class ushtrimi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        float pi = 3.14f;
        System.out.println("vendos diametrin: ");
        float diameter = scanner.nextFloat();

        System.out.println("Perimetri: " + Math.PI * diameter);


    }
}
