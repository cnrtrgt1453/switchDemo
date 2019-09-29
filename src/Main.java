import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner not=new Scanner(System.in);
        System.out.println("Notu giriniz: ");
        String grade=not.nextLine();

        switch (grade) {
            case "A":
                System.out.println("Mükemmel, Geçtiniz");
                break;  //break programı bitirmek için kullanılır.

            case "B":
                System.out.println("Çok güzel, Geçtiniz");
                break;

            case "C":
                System.out.println("İyi : Geçtiniz");
                break;

            case "D":
                System.out.println("Fena değil : Geçtiniz");
                break;

            case "FF":
                System.out.println("Malesef Kaldınız..");
                break;

            default:
                System.out.println("Geçersiz bir not girdiniz..");
        }

    }
}
