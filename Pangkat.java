public class Pangkat {
    public int nilai, pangkat; // deklarasi variabel nilai dan pangkat
    
    // Konstruktor dengan parameter untuk nilai dan pangkat
    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    // method pangkat dengan Brute Force
    public int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < this.pangkat; i++) {
            hasil = hasil * this.nilai; 
        }
        return hasil;
    }

    // method pangkat dengan Divide and Conquer
    public int pangkatDC() {
        return pangkatDC2(this.nilai, this.pangkat);
    }

    int pangkatDC2(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) // jika n ganjil
                return (pangkatDC2(a, n/2) * pangkatDC2(a, n/2) * a);
            else // jika n genap
                return (pangkatDC2(a, n/2) * pangkatDC2(a, n/2));
        }
    }
}