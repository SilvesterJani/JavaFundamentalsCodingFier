import java.util.Scanner;

public class ushtrimi12v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje fjali: ");
        String fjalia = sc.nextLine();
        int counter = 0;
        char[] karakteret = fjalia.toCharArray();
        for(char k: karakteret) {
            if(Character.isSpaceChar(k))
                counter++;
        }

//        for(int i = 0; i < karakteret.length; i++) {
//            if(Character.isSpaceChar(karakteret[i])) {
//                counter++;
//            }
//        }
        System.out.println("Numri i spaces: " + counter);
        System.out.println("Perqindja e karaktereve space eshte: " +
                ((double)counter/fjalia.length()) * 100);
    }
}