import java.util.Scanner;

public class Toko01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Toko");
        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();

        // Variable 
        double totalHarga = 0;
        double totalDiskon = 0;
        int jmlProduk = 0;

        String tambahProduk = "Y";

        // Inputan produk
        while (tambahProduk.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan produk yang Anda beli: ");
            String produk = sc.nextLine();

            System.out.print("Banyaknya: ");
            int jml = sc.nextInt();

            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            System.out.print("Diskon (%): ");
            double diskon = sc.nextDouble();

            // Perhitungan diskon 
            double hargaDiskon = harga * (1 - diskon / 100);
            double hargaTotal = hargaDiskon * jml;

            totalHarga += harga * jml;
            totalDiskon += harga * jml - hargaTotal;
            jmlProduk += jml;

            System.out.print("Apakah Anda mau menambahkan produk (Y/N)? ");
            tambahProduk = sc.nextLine();
        }

        // Hasil output
        System.out.print("Apakah Anda punya kartu member (Y/N)? ");
        String tipeMember = sc.nextLine();

        System.out.println("===============Total Pembelian===============");
        System.out.println("Nama pelanggan: " + nama);

        // Pengecekan dan perhitungan untuk member
        if (tipeMember.equalsIgnoreCase("Y")) {
            System.out.println("Tipe: Member");
            double diskonMember = totalHarga >= 200000 ? 0.1 : 0.05;
            totalDiskon += diskonMember * totalHarga;
        } else {
            System.out.println("Tipe: Non-Member");
        }

        System.out.println("Total item barang yang dibeli: " + jmlProduk);

        //Perhitungan output penjumlahan
        double totalBayar = totalHarga - totalDiskon;

        System.out.println("SubTotal                    = " + totalHarga);
        System.out.println("Total Diskon                = " + totalDiskon);
        System.out.println("Total yang Harus dibayar    = " + totalBayar);
    }
}
