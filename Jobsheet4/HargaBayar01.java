import java.util.Scanner;

public class HargaBayar01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jmlHalBuku;
        String merkBuku;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan harga barang yang dieli ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan merk buku yang dibeli ");
        merkBuku = input.next();
        System.out.println("Masukkan jumlah halaman buku yang dibeli ");
        jmlHalBuku = input.nextInt();
        System.out.println("Masukkan besaran diskon diskon ");
        dis = input.nextDouble();

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang haruss dibayar adalah " + bayar);
        System.out.println("Merk buku " + merkBuku);
        System.out.println("Jumlah halaman buku " + jmlHalBuku);
        System.out.println("Jumlah diskon " + dis);
    }
}