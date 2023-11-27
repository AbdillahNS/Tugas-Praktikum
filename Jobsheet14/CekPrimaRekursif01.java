import java.util.Scanner;

public class CekPrimaRekursif01 {
    static boolean isPrime(int n, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        if (isPrime(n, n - 1)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
