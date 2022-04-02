import java.util.Scanner;

public class ushtrimi12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje fjali: ");
        String fjalia = sc.nextLine();
        int counter = 0;
        for(int i = 0; i < fjalia.length(); i++) {
            if(Character.isSpaceChar(fjalia.charAt(i))) {    //metod
                counter++;
            }
        }
        System.out.println("Numri i spaces: " + counter);
        System.out.println("Perqindja e karaktereve space eshte: " +
                ((double)counter/fjalia.length())* 100);
    }
}