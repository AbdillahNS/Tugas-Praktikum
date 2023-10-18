import java.util.Scanner;

public class LatihanMandiriA01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, jenisKelamin;
        int jml = 0;
        
        for (int i = 1; i <= 30; i++) {
            System.out.print("Masukkan nama Mahasiswa : ");
            nama = sc.nextLine();
            System.out.print("Masukkan jenis kelamin Mahasiswa (L/P) : ");
            jenisKelamin = sc.nextLine();
            
            if (jenisKelamin.equalsIgnoreCase("P")) {
                jml++;
                continue;
            }
        }
        
        System.out.println("Jumlah Mahasiswa berjenis kelamin Perempuan : " + jml);
    }
}