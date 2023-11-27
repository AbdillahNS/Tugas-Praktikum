import java.util.Scanner;

public class DeretDescendingRekursif01 {
    // Fungsi Rekursif
    static void Rekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            Rekursif(n - 1);
        }
    }

    // Fungsi Iteratif
    static void Iteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Fungsi rekursif:");
        Rekursif(n);

        System.out.println("\nFungsi iteratif:");
        Iteratif(n);
    }
}