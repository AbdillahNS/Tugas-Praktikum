import java.util.Scanner;

public class kasir01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int total, diskon, bayar;
        String kartu;

        System.out.print("Apakah pelanggan mempunyai kartu anggota (y atau t)? ");
        kartu = sc.nextLine();
        System.out.print("Beberapa total harga barang belanjaan? Rp ");
        total = sc.nextInt();

        if (kartu.equals("y")) {
            if (total > 500000) {
                diskon = 50000;
            } else {
                diskon = 25000;
            }
        } else {
            if (total > 200000) {
                diskon = 10000;
            } else {
                diskon = 0;
        
            }
        }
        bayar = total - diskon;
        System.out.println("Total yang harus dibayar : Rp " + bayar);
    }
}