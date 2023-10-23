import java.util.*;
public class ShortingNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Elemen: ");
        int jmlElemen = sc.nextInt();

        int[] nilai = new int[jmlElemen];

        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        
        Arrays.sort(nilai);

        int nilaiTinggi = nilai[jmlElemen - 1];
        int nilaiRendah = nilai[0];
        int total = 0;

        for (int i = 0; i < jmlElemen; i++) {
            total += nilai[i];
        }

        double rata2 = total / jmlElemen;

        System.out.println("Nilai terbesar: " + nilaiTinggi);
        System.out.println("Nilai terkecil: " + nilaiRendah);
        System.out.println("Rata-rata: " + rata2);
    }
}
