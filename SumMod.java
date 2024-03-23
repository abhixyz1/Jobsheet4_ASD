// Nama : Muhammad Abhinaya Zurfa

public class SumMod {
    public int elemen; // deklarasi variabel elemen
    public double keuntungan[]; // deklarasi array keuntungan
    public double total; // deklarasi variabel total

    // constructor
    Sum(int elemen) { // parameter elemen
        // inisialisasi nilai elemen dan array keuntungan
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    // method total keuntungan dengan Brute Force
    double TotalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    // method total keuntungan dengan Divide and Conquer
    double totalDC(double arr[], int l, int r) {
        if (l == r)
            return arr[l];
        else if (l<r) {
            int mid = (l+r) / 2; 
            double lsum = totalDC(arr, l, mid - 1);     
            double rsum = totalDC(arr, mid + 1, r); 
            return lsum + rsum + arr[mid]; 
        }
        return 0;
    }
}
