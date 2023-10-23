import java.util.Scanner;

public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jmlMahasiswa];
        double total = 0;
        double rata2;
        double totalTidakLulus = 0;
        int jmlLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                total += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2 = total / jmlLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2);
        System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / (nilaiMhs.length - jmlLulus)));
    }
}