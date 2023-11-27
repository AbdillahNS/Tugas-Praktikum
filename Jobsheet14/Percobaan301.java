import java.util.Scanner;
public class Percobaan301 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc.nextInt();
        System.out.println("Lamanya investasi (tahun) :");
        tahun = sc.nextInt();

        System.out.println("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}