import java.util.Scanner;

public class PemilihanPercobaan101soal {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input01.nextInt();

        String status = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + status);
    }
}