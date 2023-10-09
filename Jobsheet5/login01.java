import java.util.Scanner;

    public class login01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String username = "abdillah";
            String password = "01";

            System.out.println("Masukkan username :");
            String id = sc.next();
            System.out.println("Masukkan password :");
            String pw = sc.next();

            if (username.equals("abdillah") && password.equals("01")) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Username dan Password Salah");
            }
    
        
    }
}