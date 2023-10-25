import java.util.*;
public class LinearSearch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int jmlElemen = sc.nextInt();

        int[] arrayInt = new int[jmlElemen];
        int key = 20;
        int hasil = 0;
        
        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + (i) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println("Key ada di posisi indeks ke-" + hasil);
    
    }
}