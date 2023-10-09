import java.util.Scanner;

    public class PemilihanSenjata01 {
        public static void main(String[] args) {
            Scanner input01 = new Scanner(System.in);

            String jarak;
            
            System.out.println("Tentukan jarak pertarungan :");
            System.out.println("1. Jarak dibawah 5 Meter");
            System.out.println("2. Jarak antara 5-1000 Meter");
            System.out.println("Masukkan pilihan jarak :");
            jarak = input01.next();

            switch (jarak){
                case "1":
                System.out.println("Menggunakan senjata Close Combat");
                break;
                case "2":
                System.out.println("Menggunakan senjata Ranged Weapon");
                break;
                default:
                System.out.println("Maaf, Angka yang anda masukkan salah");
            }
        }
    }