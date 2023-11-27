import java.util.Scanner;
public class PenjumlahanRekursif01 {
    public static int penjumlahanRekursif(int n) {
        if (n == 1) {
            System.out.print(n);
            return 1;
        } else {
            int hasil = n + penjumlahanRekursif(n - 1);
            System.out.print("+" + n);
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan f: ");
        int f = sc.nextInt();
        System.out.print("Deret: ");
        int hasil = penjumlahanRekursif(f);
        System.out.println(" = " + hasil);
    }
}