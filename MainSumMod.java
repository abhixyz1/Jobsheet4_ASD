import java.util.Scanner;

public class MainSumMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int n = sc.nextInt();

        // Array untuk menyimpan keuntungan perusahaan
        double[][] untungPerusahaan = new double[n][];

        // Input keuntungan setiap bulan untuk setiap perusahaan
        for (int i = 0; i < n; i++) {
            System.out.println("===================================================");
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int elm = sc.nextInt();
            untungPerusahaan[i] = new double[elm]; // Inisialisasi array untuk setiap perusahaan

            // Input nilai keuntungan setiap bulan
            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " untuk perusahaan ke-" + (i + 1) + ": ");
                untungPerusahaan[i][j] = sc.nextDouble();
            }
        }

        // Hitung total keuntungan setiap perusahaan
        for (int i = 0; i < n; i++) {
            Sum sm = new Sum(untungPerusahaan[i].length);
            System.out.println("===================================================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.TotalBF(untungPerusahaan[i]));
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(untungPerusahaan[i], 0, sm.elemen - 1));
        }
    }
}
