import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        sayi = Math.abs(sayi); // Negatif sayılar için mutlak değer al

        while (sayi > 0) {
            toplam += sayi % 10; // Son basamağı toplama ekle
            sayi /= 10; // Son basamağı at
        }

        System.out.println("Basamakların toplamı: " + toplam);

        scanner.close();
    }
}
