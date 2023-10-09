import java.util.Scanner;

public class PemilihanPercobaan201soal {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Nilai uas    : ");
        float uas = input01.nextFloat();
        System.out.print("Nilai uts    : ");
        float uts = input01.nextFloat();
        System.out.print("Nilai kuis   : ");
        float kuis = input01.nextFloat();
        System.out.print("Nilai tugas  : ");
        float tugas = input01.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String massageRemidi = total < 65 ? "Remidi" : "Tidak remidi";

        String message;
        if (total > 80) {
            message = "A (Sangat Baik)";
        } else if (total > 73) {
            message = "B+ (Lebih dari Baik)";
        } else if (total > 65) {
            message = "B (Baik)";
        } else if (total > 60) {
            message = "C+ (Lebih dari Cukup)";
        } else if (total > 50) {
            message = "C (Cukup)";
        } else if (total > 39) {
            message = "D (Kurang)";
        } else {
            message = "E (Gagal)";
        }

        System.out.println("Nilai akhir = " + total + ", nilai huruf = " + message + ", Sehingga" + massageRemidi);
    }
}