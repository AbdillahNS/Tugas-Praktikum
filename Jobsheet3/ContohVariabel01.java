public class ContohVariabel01 {
    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Bermain petak umpet";
        boolean Pandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 20;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + Pandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}