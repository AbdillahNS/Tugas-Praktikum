public class Individu401 {
    public static void main(String[] args) {
        String[][] data = {
            {"Abdillah", "Dimas", "Ciko", "Alif", "Reika"}, // Badminton
            {"Adri", "Pasha", "Putra", "Naufal", "Gabriel"}, // Tenis Meja
            {"Tio", "Farhan", "Rio", "Vira", "Petrus"}, // Basket
            {"Saka", "Putra", "Haikal", "Lutfi", "Dio"}, // Bola Voly
        };

        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"}; // Jenis Cabang Olahraga

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length - 1; j++) {
                for (int k = 0; k < data[i].length - j - 1; k++) {
                    if (data[i][k].compareToIgnoreCase(data[i][k + 1]) > 0) {
                        String temp = data[i][k];
                        data[i][k] = data[i][k + 1];
                        data[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println("Cabang Olahraga " + cabor[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("Nama atlet ke-" + (j + 1) + " : " + data[i][j]);
            }
            System.out.println();
        }
    }
}