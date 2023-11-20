import java.util.Scanner;
public class UcapanTerimaKasih_01 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tulisakan NAMA orang yang ingin Anda beri Ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me fell like I could ask you anything.");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}