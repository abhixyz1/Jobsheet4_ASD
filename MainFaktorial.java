import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        // Pengecekan waktu untuk Brute Force
        long startBF, endBF;
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            startBF = System.nanoTime();
            int hasilBF = fk[i].faktorialBF(fk[i].nilai);
            endBF = System.nanoTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilBF);
            System.out.println("Waktu eksekusi (nanoseconds): " + (endBF - startBF));
        }

        // Pengecekan waktu untuk Divide and Conquer
        long startDC, endDC;
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            startDC = System.nanoTime();
            int hasilDC = fk[i].faktorialDC(fk[i].nilai);
            endDC = System.nanoTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilDC);
            System.out.println("Waktu eksekusi (nanoseconds): " + (endDC - startDC));
        }
        System.out.println("===============================================");
    }
}
