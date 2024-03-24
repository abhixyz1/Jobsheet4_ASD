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

    int pangkatDC2(int a, int n) { // membuat method pangkatDC2 dengan parameter integer a dan n
        if (n == 0) { // jika n sama dengan 0
            return 1; // maka akan mengembalikan nilai 1
        } else { // jika n tidak sama dengan 0
            if (n % 2 == 1) // lalu akan dilakukan pengecekan apakah n habis dibagi 2
                return (pangkatDC2(a, n/2) * pangkatDC2(a, n/2) * a); // jika n ganjil maka akan mengembalikan nilai pangkatDC2(a, n/2) dikalikan pangkatDC2(a, n/2) dikalikan a
            else  // jika n habis dibagi 2
                return (pangkatDC2(a, n/2) * pangkatDC2(a, n/2)); // maka akan mengembalikan nilai pangkatDC2(a, n/2) dikalikan pangkatDC2(a, n/2)
        }
        // contoh perhitungannya menggunakan divide and conquer
        // 5^3 = 5^1 * 5^1 * 5 = 5^2 * 5 = 25 * 5 = 125
        
    }
}