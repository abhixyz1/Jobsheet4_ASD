// Nama : Muhammad Abhinaya Zurfa

public class Faktorial {

    public int nilai; // deklarasi variabel nilai

    // method faktorial dengan Brute Force
    public int faktorialBF(int n) {
        //menggunakan for loop
        int fakto = 1; // pertama menginisialisasi nilai fakto dengan 1
        for (int i = 1; i <= n; i++) { // kemudian menggunakan for dimana i dimulai dari 1, i kurang dari sama dengan n, dan i akan bertambah 1 setiap iterasi
            fakto = fakto * i; // fakto akan dikalikan dengan i 
        }
        return fakto; // lalu mengembalikan nilai fakto
        //

        // menggunakan do while loop
        // int fakto = 1;
        // int i = 1;
        // do {
        //     fakto *= i;
        //     i++;
        // } while ( i <=n );
        // return fakto;
    }

    // method faktorial dengan Divide and Conquer
    public int faktorialDC(int n) { // membuat method faktorialDC dengan parameter n
        if (n==1) { // di baris ini akan dilakukan pengecekan apakah n sama dengan 1
            return 1; // jika iya maka akan mengembalikan nilai 1
        }
        else { // jika tidak
            int fakto = n * faktorialDC(n-1); // maka akan menghitung nilai faktorial dengan cara memanggil method faktorialDC dengan parameter n-1 dimana n adalah nilai yang diinputkan
            return fakto; // lalu mengembalikan nilai fakto
        }
        // contoh perhitungan menggunakan divide and conquer
        // 5! = 5 * 4!

    }
}
