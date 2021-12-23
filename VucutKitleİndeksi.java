import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double boy, kilo;
        double vucutKitle;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(metre cinsinden) girin: ");
        boy = input.nextDouble();
        System.out.print("lütfen kilonuzu girin: ");
        kilo = input.nextDouble();
        vucutKitle = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: " + vucutKitle);




	// write your code here
    }
}
