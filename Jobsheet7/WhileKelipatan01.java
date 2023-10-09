import java.util.Scanner;

public class WhileKelipatan01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        int kelipatan = scan.nextInt();
        int total = 0;
        int counter = 0;
        int i = 1; // Inisialisasi variabel penghitung

        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++; // Iterasi untuk meningkatkan nilai penghitung
        }

        double rataRata = (double) total / counter; // Menghitung rata-rata
        
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
        // .2 untuk menampilkan bahwa akan ditampilkan dua digit angka setelah desimal, f untuk menunjukkan nilai yang akan dicetak adalah desimal
    }
}