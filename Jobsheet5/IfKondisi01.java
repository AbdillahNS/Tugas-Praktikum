import java.util.Scanner;
public class IfKondisi01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        System.out.print("Masukkan suhu: ");
        int suhu = sc01.nextInt();

        if (suhu < 16) {
            System.out.println("Silakan menggunakan jaket");
        }
        if (suhu < 20) {
            System.out.println("Silakan pakai baju tebal");
        }
        else{
            System.out.println("Silakan pakai topi");
        }
    }
}