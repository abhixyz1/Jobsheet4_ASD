// Nama : Muhammad Abhinaya Zurfa

public class Pangkat {
    public int nilai, pangkat; // deklarasi variabel nilai dan pangkat
    
    // method pangkat dengan Brute Force
    public int pangkatBF(int a, int n) {
        int hasil = 1; 
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    // method pangkat dengan Divide and Conquer
    public int pangkatDC(int a, int n) {
        if (n == 0) { // jika n = 0
            return 1; // hasilnya 1
        }
        else {
            if (n % 2 == 1) // jika n ganjil
            return (pangkatDC(a, n/2) * pangkatDC(a, n/2) *a); 
            else // jika n genap
            return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
        }
    }
}
