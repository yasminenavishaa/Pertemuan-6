# LAPORAN JOBSHEET 5 PRAKTIKUM STRUKTUR DATA

Dibuat oleh : <p>
Yasmine Navisha Andhani <p>
1F D4 Teknik Informatika <p>
2141720047 <p>

# 6.2 Searching / Pencarian Menggunakan Algoritma Sequential Search
## 6.2.1 Langkah - langkah Percobaan Sequential Search
1. Buatlah project baru pada Neatbeans dengan nama TestSearching
2. Kemuadian buat packages baru dengan nama minggu7.
3. Buat class Mahasiswa, kemudian deklarasikan atribut berikut ini: <P>
<img src="J6 - 6.2.1 (3).PNG"> <p>
4. Buatlah konstruktor dengan nama Mahasiswa dengan parameter (int ni, String n, int u, double i) kemudian Isi konstruktor tersebut dengan kode berikut! <P>
<img src="J6 - 6.2.1 (4).PNG"> <p>
5. Buatlah method tampil bertipe void. <P>
<img src="J6 - 6.2.1 (5).PNG"> <p>
6. Buat class baru dengan nama PencarianMhs seperti di bawah ini! <P>
<img src="J6 - 6.2.1 (6).PNG"> <p>
7. Tambahkan method tambah() di dalam class tersebut! Method tambah() digunakan untuk menambahkan objek dari class Mahasiswa ke dalam atribut listMhs. <p>
<img src="J6 - 6.2.1 (7).PNG"> <p>
8. Tambahkan method tampil() di dalam class PencarianMhs! Method tampil()
digunakan untuk menampilkan semua data mahasiswa-mahasiswa yang ada di dalam class tersebut! Perhatikan penggunaan sintaks for yang agak berbeda dengan for yang telah dipelajari sebelumnya, meskipun secara konsep sebenarnya mirip.<P>
<img src="J6 - 6.2.1 (8).PNG"> <p>
9. Tambahkan method FindSeqSearch bertipe integer dengan parameter cari bertipe integer. Kemudian Deklarasikan isi method FindSeqSearch dengan algoritma pencarian data menggunakan teknik sequential searching. <p>
<img src="J6 - 6.2.1 (9).PNG"> <p>
10. Buatlah method Tampilpoisisi bertipe void dan Deklarasikan isi dari method Tampilpoisisi. <p>
<img src="J6 - 6.2.1 (10).PNG"> <p>
11. Buatlah method TampilData bertipe void dan Deklarasikan isi dari method TampilData. <p>
<img src="J6 - 6.2.1 (11).PNG"> <p>
12. Buatlah class baru dengan nama MahasiswaMain tambahkan method main seperti pada gambar berikut! <p>
<img src="J6 - 6.2.1 (12).PNG"> <p>
13. Di dalam method main(), buatlah sebuah objek PencarianMhs dan buatlah 5 objek mahasiswa kemudian tambahkan semua objek mahasiswa tersebut dengan memanggil fungsi tambah pada objek PencarianMhs. <p>
<img src="J6 - 6.2.1 (13).PNG"> <p>
14. Panggil method tampil() untuk melihat semua data yang telah dimasukan. <P>
<img src="J6 - 6.2.1 (14).PNG"> <p>
15. Untuk melakukan pencarian berdasarkan NIM mahasiswa. Buatlah variable cari yang dapat menampung masukan dari keyboard lalu panggil method FindSeqSearch dengan isi parameternya adalah variable cari. <p>
<img src="J6 - 6.2.1 (15).PNG"> <p>
16. Lakukan pemanggilan method Tampilposisi dari class PencarianMhs. <p>
<img src="J6 - 6.2.1 (16).PNG"> <p>
17. Lakukan pemanggilan method TampilData dari class PencarianMhs. <p>
<img src="J6 - 6.2.1 (17).PNG"> <p>
18. Jalankan dan amati hasilnya.

## 6.2.2 Verifikasi Hasil Percobaan
<img src="J6 - 6.2.2 (a).PNG"> <p>
<img src="J6 - 6.2.2 (b).PNG"> <p>
<img src="J6 - 6.2.2 (c).PNG"> <p>

## 6.2.3 Pertanyaan
1. Jelaskan perbedaan metod TampilData dan Tampilposisi pada class PencarianMhs
> : method TampilData digunakan untuk menampilkan data yang akan dicari oleh pengguna
> : method TampilPosisi digunakan untuk menampilkan posisi data yang ingin dicari oleh pengguna
2. Jelaskan fungsi break pada kode program dibawah ini! <p>
<img src="J6 - 6.2.3 (2).PNG"> <p>
> : fungsi break untuk menghentikan perulangan pencarian data, karena data yang sedang dicari sudah ditemukan
3. Jika Data Nim yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Mengapa demikian!
> : hasil yang dikeluarkan adalah benar, karena pada method Sequential Search dilakukan Proses pencarian dilakukan dengan membandingkan elemen array satu per satu secara beruntun sehingga kumpulan data tidak harus dalam keadaan terurut agar program tetap bisa dijalankan

# 6.3 Searching/Pencarian Menggunakan Binary Search
## 6.3.1 Langkah-langkah Percobaan Binary Search
1. Pada percobaan 6.2.1 (sequential search) tambahkan method FindBinarySearch bertipe integer pada class PencarianMhs. Kemudian Deklarasikan isi method FindBinarySearch dengan algoritma pencarian data menggunakan teknik binary searching. <p>
<img src="J6 - 6.3.1 (1).PNG"> <p>
2. Panggil method FindBinarySearch terdapat pada class PencarianMhs di kelas
Mahasiswamain. Kemudia panggil method tampilposisi dan tampilData. <p>
<img src="J6 - 6.3.1 (1).PNG"> <p>
3. Jalankan dan amati hasilnya. 

## 6.3.2 Verifikasi Hasil Percobaan
<img src="J6 - 6.3.2 (1).PNG"> <p>
<img src="J6 - 6.3.2 (2).PNG"> <p>
<img src="J6 - 6.3.2 (3).PNG"> <p>

## 6.3.3 Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
> :  mid = (left+right)/2;
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
> : <img src="J6 - 6.3.3 (2).PNG"> <p>
3. Jika data Nim yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian!
> : Program masih dapat berjalan, tetapi data yang dicari tidak dapat ditemukan karena data awal harus dalam kondisi terurut. Sehingga harus dilakukan proses sorting terlebih dahulu untuk data awal.
4. Jika Nim yang dimasukkan dari NIM terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
> : Ubah data yang diinputkan dari yang terbesar ke terkecil.
5. Modifikasilah program diatas yang mana jumlah mahasiswa yang di inputkan sesuai dengan masukan dari keyboard.
> : class Mahasiswa <p>

public class Mahasiswa{
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa (int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil (){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
    
}

> : MahasiswaMain <p>

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jumMhs = s.nextInt();
        Mahasiswa[] e = new Mahasiswa[jumMhs];
        data.listMhs = e;
        
        System.out.println("-----------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil : ");
        
        for(int i = 0; i<jumMhs; i++){
            System.out.println("---------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
           
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
            System.out.println("------------------------------------");
            System.out.println("Data keseluruhan Mahasiswa");
            data.tampil();
            
            System.out.println("____________________________________");
            System.out.println("____________________________________");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
            System.out.println("NIM : ");
            int cari = s.nextInt();
            System.out.println("Menggunakan sequential Search");
            int posisi = data.FindSeqSearch(cari);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
            System.out.println();
            
            System.out.println("===================================");
            System.out.println("Menggunakan binary Search");
            posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
    }
}

> : class PencarianMhs <p>

public class PencarianMhs {
    Mahasiswa listMhs[];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------");
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = - 1;
        for(int j = 0; j<listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void Tampilposisi(int x, int pos){
        if(pos != - 1){
        System.out.println("data : " +x+ " ditemukan pada indeks " + pos);
        }else{           
        System.out.println("data " +x+ "tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if(pos != -1){
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }else{
            System.out.println("data " +x+ "tidak ditemukan ");
        }
    }
    public int FindBinarySearch(int cari, int left, int rigth){
        int mid;
        if(rigth >= left){
            mid = (left + rigth)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }else if(listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari, mid+1, rigth);
            }
        }
        return -1;
    }
}

> : Output <p>
<img src="J6 - 6.3.3 (5a).PNG"> <p>
<img src="J6 - 6.3.3 (5b).PNG"> <p>


# 6.4 Percobaan Pengayaan Divide and Conquer
## 6.4.1 Langkah-Langkah Percobaan Merge Sort
1. Buatlah Package baru pada NetBeans dengan nama MergeSortTest
2. Tambahkan class MergeSorting pada package tersebut
3. Pada class MergeSorting buatlah method mergeSort yang menerima parameter data array yang akan diurutkan
> :   void mergeSort(int[] data){
4. Buatlah method merge untuk melakukan proses penggabungan data dari bagian kiri dan kanan.
> :  void merge(int data[], int left, int middle, int right){
5. Implementasikan proses merge sebagai berikut. <p>
<img src="J6 - 6.4.1 (5).PNG"> <p>
6. Buatlah method sort
> : void sort(int data[], int left, int right){
7. Implementasikan kode berikut pada method sort <p>
<img src="J6 - 6.4.1 (7).PNG"> <p>
8 Pada method mergeSort, panggil method sort dengan parameter data yang ingin diurutkan serta range data awal sampai dengan akhir.
9. Tambahkan method printArray <o>
<img src="J6 - 6.4.1 (9).PNG"> <p>
10. Sebagai langkah terakhir, deklarasikan data yang akan diurutkan kemudian panggil proses sorting pada class SortMain <P>
<img src="J6 - 6.4.1 (10).PNG"> <p>

## 6.4.2 Verifikasi Hasil Percobaan
<img src="J6 - 6.4.2.PNG"> <p>

# Latihan Praktikum
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan dengan menggunakan algoritma sorting (pilih salah satu algoritma sorting dari pertemuan sebelumnya)
> : class Mahasiswa <p>

public class Mahasiswa{
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa (int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil (){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
    
}

> : class PencarianMhs <p>

public class PencarianMhs {
    Mahasiswa listMhs[];
    int idx;
    public int posisi;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------");
        }
    }
    void selectionSort(){
        for(int i=0;i<listMhs.length-1;i++){
            int idxMin=i;
            for(int j=i+1;j<listMhs.length;j++){
                if(listMhs[j].nim>listMhs[idxMin].nim){
                    idxMin=j;
                }
            }
            Mahasiswa tmp=listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }
    public void Tampilposisi(int x, int pos){
        if(pos != - 1){
        System.out.println("data : " +x+ " ditemukan pada indeks " + pos);
        }else{           
        System.out.println("data " +x+ "tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if(pos != -1){
            System.out.println("NIM\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }else{
            System.out.println("data " +x+ "tidak ditemukan ");
        }
    }
    public int FindBinarySearch(int cari, int left, int rigth){
        int mid;
        if(rigth >= left){
            mid = (left + rigth)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }else if(listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari, mid+1, rigth);
            }
        }
        return -1;
    }
}

> : class MahasiswaMain <p>

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jumMhs = s.nextInt();
        Mahasiswa[] e = new Mahasiswa[jumMhs];
        data.listMhs = e;
        
        System.out.println("-----------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil : ");
        
        for(int i = 0; i<jumMhs; i++){
            System.out.println("---------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
           
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
            System.out.println("------------------------------------");
            System.out.println("Data keseluruhan Mahasiswa");
            data.tampil();

            System.out.println("________________________________________________________");
            System.out.println("Data Setelah diurutkan menggunakan Selection Sort (dsc): ");
            data.selectionSort();
            data.tampil();
            
            System.out.println("____________________________________");
            System.out.println("____________________________________");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan NIM Mahasiswa yang dicari : ");
            System.out.println("NIM : ");
            int cari = s.nextInt();

            
            System.out.println("===================================");
            System.out.println("Menggunakan binary Search");
            int posisi = data.
            posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
    }
}

> : Output <p>
<img src="J6 - 6.5 (1a).PNG"> <p>
<img src="J6 - 6.5 (1b).PNG"> <p>

2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Pencarian dilakukan berdasarkan Nama Mahasiswa (gunakan Algoritma Sequential Search)
- Jika terdapat nama yang sama? Bagaimana keluaran dari kode program ketika pencarian dilakukan pada nama yang sama!
> : class Mahasiswa <p>

public class Mahasiswa{
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa (int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil (){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
    
}

> : class PencarianMhs <p>

public class PencarianMhs {
    Mahasiswa listMhs[];
    int idx;
    public int posisi;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------");
        }
    }
    public int findSeqSearch(String cari){
        int posisi = -1;
        for(int j=0; j < listMhs.length; j++){
            if(cari.equals(listMhs[j].nama)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void Tampilposisi(int x, int pos){
        if(pos != - 1){
        System.out.println("data : " +x+ " ditemukan pada indeks " + pos);
        }else{           
        System.out.println("data " +x+ "tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if(pos != -1){
            System.out.println("NIM\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }else{
            System.out.println("data " +x+ "tidak ditemukan ");
        }
    }
}

> : class MahasiswaMain <p>

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jumMhs = s.nextInt();
        Mahasiswa[] e = new Mahasiswa[jumMhs];
        data.listMhs = e;
        
        System.out.println("-----------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil : ");
        
        for(int i = 0; i<jumMhs; i++){
            System.out.println("---------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
           
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
            System.out.println("------------------------------------");
            System.out.println("Data keseluruhan Mahasiswa");
            data.tampil();

            System.out.println("____________________________________");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
            System.out.println("Nama : ");
            String cari = s1.nextLine();
            
            System.out.println("===================================");
            System.out.println("Menggunakan Sequential Search");
            int posisi = data.findSeqSearch(cari);
            
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
    }
}

> : Output <p>
<img src="J6 - 6.5 (2).PNG"> <p>

3. Terdapat sebuah data array 1 dimensi sebagai berikut <p>
<img src="J6 - 6.5 (3a).PNG"> <p>
Buatlah program untuk mengurutkan array tersebut (boleh memilih metode pengurutan) selanjutnya lakukan pencarian dan mencetak isi array yang nilainya terbesar, dan mencetak ada berapa buah nilai terbesar tersebut serta berada dilokasi mana saja nilai terbesar tersebut! (menggunakan binary search) <p>
> : <img src="J6 - 6.5 (3b).PNG"> <p>
<img src="J6 - 6.5 (3c).PNG"> <p>
<img src="J6 - 6.5 (3d).PNG"> <p>
<img src="J6 - 6.5 (3e).PNG"> <p>




