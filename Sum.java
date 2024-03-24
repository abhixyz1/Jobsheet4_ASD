// Nama : Muhammad Abhinaya Zurfa

public class Sum {
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
    double totalDC(double arr[], int l, int r) { // membuat method totalDC dengan parameter arr, l, dan r
        if (l == r) // jika l sama dengan r
            return arr[l]; // maka akan mengembalikan nilai arr[l]
        else if (l<r) { // jika l kurang dari r
            int mid = (l+r) / 2; // maka akan menghitung nilai tengah dari l dan r
            double lsum = totalDC(arr, l, mid - 1); // lalu akan menghitung nilai lsum dengan cara memanggil method totalDC dengan parameter arr, l, dan mid-1
            double rsum = totalDC(arr, mid + 1, r); // selanjutnya akan menghitung nilai rsum dengan cara memanggil method totalDC dengan parameter arr, mid+1, dan r
            return lsum + rsum + arr[mid];  // hasil akhirnya akan mengembalikan nilai lsum + rsum + arr[mid]
        }
        return 0; // jika tidak memenuhi kondisi diatas maka akan mengembalikan nilai 0
        // contoh perhitungan menggunakan divide and conquer
        // l = 9, r = 12 
        // mid = 10
        // lsum = totalDC(arr, 9, 9) = 9
        // rsum = totalDC(arr, 11, 12) = 11 + 12 = 23
        // return 9 + 23 + 10 = 42
    }
}
