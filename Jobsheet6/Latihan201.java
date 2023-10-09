import java.util.Scanner;

public class Latihan201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        
        // Input jenis buku, jumlah buku dan harga total buku
        System.out.println("========== Pembelian Buku ==========");
        System.out.print("Masukkan jenis buku (Kamus/Novel/Buku lainnya): ");
        String jenisBuku = input01.nextLine();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = input01.nextInt();
        System.out.print("Masukkan harga total buku : RP ");
        int harga = input01.nextInt();
        
        double diskonAwal = 0.0;
        double tambahanDiskon = 0.0;
        
        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            diskonAwal = 0.10;
            if (jumlahBuku > 2) {
                tambahanDiskon = 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskonAwal = 0.07;
            if (jumlahBuku >=  3) {
                tambahanDiskon = 0.02;
            } else {
                tambahanDiskon = 0.01;
            }
        } else if (jenisBuku.equalsIgnoreCase("Buku lainnya")) {
            if (jumlahBuku > 3) {
                tambahanDiskon = 0.05;
            } else {
                tambahanDiskon = 0.0;
            }
        }
        // Menghitung total diskon
        double totalDiskon = (diskonAwal + tambahanDiskon);
        System.out.println("Total diskon yang diberikan: " + totalDiskon * 100 + "%");      
        // Menghitung total harga
        double totalHarga = harga - (totalDiskon * harga) ;
        System.out.println("Total harga yang harus anda bayar: RP " + totalHarga );
    }
}
