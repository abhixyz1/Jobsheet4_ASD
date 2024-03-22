// Nama : Muhammad Abhinaya Zurfa

public class Faktorial {

    public int nilai; // deklarasi variabel nilai

    // method faktorial dengan Brute Force
    public int faktorialBF(int n) {
        // menggunakan for loop
        // int fakto = 1;
        // for (int i = 1; i <= n; i++) {
        //     fakto = fakto * i;
        // }
        // return fakto;

        // menggunakan do while loop
        int fakto = 1;
        int i = 1;
        do {
            fakto *= i;
            i++;
        } while ( i <=n );
        return fakto;
    }

    // method faktorial dengan Divide and Conquer
    public int faktorialDC(int n) {
        if (n==1) { 
            return 1;
        }
        else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
