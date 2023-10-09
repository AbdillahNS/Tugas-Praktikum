import java.util.Scanner;

public class Lingkaran01 {
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      
      int r;
      double keliling, luas;
      double phi = 3.14; //Deklarasi phi
      
      System.out.println("Masukkan jari-jari lingkaran: ");
      
      r = input.nextInt();
      keliling = 2*phi*r; //Variabel phi
      luas = phi*r*r;
      
      System.out.println(keliling);
      System.out.println(luas);  
    }
}