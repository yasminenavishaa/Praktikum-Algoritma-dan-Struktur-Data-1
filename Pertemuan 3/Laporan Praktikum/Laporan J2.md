#LAPORAN JOBSHEET 2 PRAKTIKUM STRUKTUR DATA

Dibuat oleh :
Yasmine Navisha Andhani
1F D4 Teknik Informatika
2141720047

# 2.2 Deklarasi Class, Atribut dan Method
  <img src="J2 (2.2).png"> <p>

# 2.2.1 Langkah-langkah percobaan
1. Buat Project baru, dengan nama StrukturData. Buat paket dengan nama minggu2, buatlah class 
baru dengan nama Barang.
2. Lengkapi class Barang dengan atribut dan method yang telah digambarkan di dalam diagram 
class di atas, sebagai berikut:
   <img src="J2 (2.2.1 -2).png"> <p>
3. Coba jalankan (Run) class Barang tersebut. Apakah bisa?
   : Tidak bisa
   <img src="J2 (2.2.2).png"> <p>

# 2.2.3 Pertanyaan
1. Sebutkan 2 karakteristik class/objek!
  > : Setiap objek berawal dari suatu rancangan class, Objek tidak akan ada jika tidak ada class, Class tidak akan bisa digunakan jika belum dibuat objeknya.
2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?
  > : Untuk mendeklarasikan class menggunakan kata kunci “class” yang diikuti dengan nama class-nya.
3. Perhatikan class Barang yang ada di praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Subtkan! Dan pada baris berapa saja deklarasi atribut dilakukan?
  > : Ada 4. namaBarang, jenisBarang, stok, hargaSatuan. Baris ke 2-3
4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja method dilakukan?
  > : Ada 4. tampilBarang, tambahStok, kurangiStok,hitungHargaTotal. Baris ke 5, 11, 14, 17
5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut 
sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0) 
  > : <img src="J2 (2.2.3 - 5).png"> <p>
6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa bilangan int?
  > : Untuk menghitung tambahan stok
7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
  > : Untuk me-return jumlah * hargaSatuan (hargaTotal) dan digunakan untuk int
8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?
  > : Karena tidak menggunakan return nilai / value

# 2.3 Instansiasi Objek dan Mengakses Atribut dan Method

# 2.3.1 Langkah-langkah Percobaan
1. Di dalam paket minggu2, buatlah class baru dengan nama BarangMain. Dan di dalam class 
BarangMain tersebut, buatlah method main().
2. Di dalam method main(), lakukan instansiasi, dan kemudian lanjutkan dengan mengakses atribut 
dan method dari objek yang telah terbentuk.
   <img src="J2 (2.3.1).png"> <p>
3. Jalankan (Run) class BarangMain tersebut dan amati hasilnya.
   <img src="J2 (2.3.1 - 3).png"> <p>
# 2.3.3 Pertanyaan
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek yang dihasilkan?
  > : Baris ke-3, dan nama objek yang dihasilkan adalah Barang
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
  > : Atribut : namaObjek.namaAtribut = nilai;  (b1.stok = 10;)
      Method : namaObjek.namaMethod(); (b1.tampilBarang();

# 2.4 Membuat Konstruktor
# 2.4.1 Langkah-langkah Percobaan
1. Perhatikan kembali class Barang. Tambahkan di dalam class Barang tersebut 2 buah 
konstruktor. 1 konstruktor default dan 1 konstruktor berparameter
   <img src="J2 (2.4.1 - 1).png"> <p>
2. Buka kembali class BarangMain. Dan buat sebuah objek lagi, kali ini dengan menggunakan 
konstruktor berparameter.
   <img src="J2 (2.4.1 - 2).png"> <p>
3. Jalankan kembali class BarangMain dan amati hasilnya.
   <img src="J2 (2.3.1 - 3).png"> <p>
# 2.4.3 Pertanyaan
1. Perhatikan class Barang yang ada di praktikum 2.4.1, pada baris berapakah deklarasi konstruktor berparameter dilakukan?
  > : Baris ke-7
2. Perhatikan class BarangMain di praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris program di bawah ini?
   <img src="J2 (2.4.3 - 2).png"> <p>
  > : Instansiasi konstruktor
3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class Barang.
  > : <img src="J2 (2.4.3 - 3).png"> <p>
