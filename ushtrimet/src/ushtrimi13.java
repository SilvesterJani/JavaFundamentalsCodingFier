
import java.util.Scanner;

public class ushtrimi13 {

    static void afisho(String str){
        String[] array = str.split(" ");
        String p = "";
        for(String s: array){
            p += (s + " ").repeat(2);
        }
        System.out.println(p);
    }
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Give the text");
        String str = sk.nextLine();
        String str2 = sk.nextLine();

        afisho(str);
        System.out.println();
        afisho(str2);
        sk.close();
    }
}