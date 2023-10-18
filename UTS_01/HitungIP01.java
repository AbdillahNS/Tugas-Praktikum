import java.util.Scanner;

public class HitungIP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Hitung IP");
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        // Variable
        int jmlMatkul = 0, jmlPerbaikan = 0, totalSKS = 0;
        double totalNilai = 0;
        String lanjutInputNilai = "y";

        // Inputannya disini 
        while (lanjutInputNilai.equalsIgnoreCase("y")) {
            System.out.print("Nama Mata Kuliah: ");
            String namaMatkul = sc.nextLine();

            System.out.print("Nilai (A, B+, B, C+, C, D, E): ");
            String nilaiHuruf = sc.nextLine();

            System.out.print("Masukkan jumlah SKS: ");
            int sks = sc.nextInt();

            sc.nextLine();

            jmlMatkul++;
            totalSKS += sks;

            // Indeks nilai matkul
            double nilai;
            switch (nilaiHuruf) {
                case "A":
                    nilai = 4.0;
                    break;
                case "B+":
                    nilai = 3.5;
                    break;
                case "B":
                    nilai = 3.0;
                    break;
                case "C+":
                    nilai = 2.5;
                    break;
                case "C":
                    nilai = 2.0;
                    break;
                case "D":
                    nilai = 1.0;
                    jmlPerbaikan++;
                    break;
                case "E":
                    nilai = 0.0;
                    jmlPerbaikan++;
                    break;
                default:
                    nilai = 0.0;
                    break;
            }

            // Perhitungan total nilai
            totalNilai += nilai * sks;

            System.out.print("Apakah lanjut input nilai (Y/N)? ");
            lanjutInputNilai = sc.nextLine();
        }

        // Perhitungan IP
        double ip = Math.round(totalNilai / totalSKS * 100.0) / 100.0;

        // Hasil Outputnya
        System.out.println("=============Hasil Perhitungan IP=============");
        System.out.println("Nama                : " + nama);
        System.out.println("Indeks Prestasi (IP): " + ip);
        System.out.println("Jumlah mata kuliah  : " + jmlMatkul);
        System.out.println("Jumlah SKS          : " + totalSKS);
        System.out.println("Jumlah MK yang harus perbaikan/remidi: " + jmlPerbaikan);
    }
}