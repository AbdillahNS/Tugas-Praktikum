import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    String input;
                    do {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        while (true) {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();

                            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                                if (penonton[baris - 1][kolom - 1] == null) {
                                    penonton[baris - 1][kolom - 1] = nama;
                                    break;
                                } else {
                                    System.out.println("Maaf, kursi baris " + baris + ", kolom " + kolom + " sudah ditempati.");
                                }
                            } else {
                                System.out.println("Kursi tidak tersedia.");
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        sc.nextLine();
                        input = sc.nextLine();
                    } while (!input.equals("n"));
                    break;
                
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String data = penonton[i][j] != null ? penonton[i][j] : "***";
                            if (data != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + data);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    System.exit(0);

                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
}