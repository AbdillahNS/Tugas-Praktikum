import java.util.Scanner;

public class Fibonacci01 {

  public static int jumlahMarmut(int n) {
    if (n == 0 || n == 1) {
      return n;
    } else {
      return jumlahMarmut(n - 1) + jumlahMarmut(n - 2);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan bulan: ");
    int bulan = scanner.nextInt();

    int jumlah = jumlahMarmut(bulan);
    System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + jumlah);
  }
}
