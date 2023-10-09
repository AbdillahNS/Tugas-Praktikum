import java.util.Scanner;

    public class Bank01 {
        public static void main(String[] args) {
            Scanner input = new
            Scanner(System.in);
            int jmlTabunganAwal, lamaMenabung;
            double prosentaseBunga =0.02, bunga, jmlTabunganAkhir;
            System.out.println("Masukkan jumlah tabungan awal anda");
            jmlTabunganAwal = input.nextInt();
            System.out.println("Masukkan lama menabung anda");
            lamaMenabung = input.nextInt();
            bunga = lamaMenabung*prosentaseBunga*jmlTabunganAwal;
            jmlTabunganAkhir=bunga+jmlTabunganAwal;
            System.out.println("Jumlah tabungan akhir anda adalah " + jmlTabunganAkhir);

        }
    }