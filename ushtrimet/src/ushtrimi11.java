import java.util.Scanner;

public class ushtrimi11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje fjale: ");
        String fjalaUser = sc.nextLine();
        String fjalaMax = "";
        while (!fjalaUser.equals("Enough!")) {
            if(fjalaUser.isBlank()) {
                System.out.println("No text provided");
                fjalaUser = sc.nextLine();
            }
            if(fjalaMax.length() < fjalaUser.length() && !fjalaUser.equals("Enough!")) {
                fjalaMax = fjalaUser;
            }
            fjalaUser = sc.nextLine();
        }

        if(!fjalaMax.isBlank())
            System.out.println("Fjala me e gjate eshte: " + fjalaMax);
    }
}









