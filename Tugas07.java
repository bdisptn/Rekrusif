import java.util.Scanner;

public class Tugas07 {
    static Scanner sc = new Scanner(System.in);

    static int hitungRekrusif(int n) {
        
        if (n == 0) {
            System.out.println("=== Fungsi Iteratif ===");
            return(0);
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int angka = sc.nextInt();
            return angka + hitungRekrusif(n - 1);
        }  
    }
    static int hitungIteratif(int n) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            total += angka;
        }
        return total;
    }
    public static void main(String[] args) {

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();
        System.out.println("=== Fungsi Rekrusif ===");

        int totalRekrusif = hitungRekrusif(N);
        int totalIteratif = hitungIteratif(N);

        System.out.println("\nTotal (Rekrusif): " + totalRekrusif);
        System.out.println("Total (Iteratif): " + totalIteratif);
    }
}
