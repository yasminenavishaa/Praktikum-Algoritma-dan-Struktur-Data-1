public class latihan1Main {
    public static void main(String[] args) {
        latihan1 l1=new latihan1();
        l1.nama="meja";
        l1.hargaSatuan=150000;
        l1.jumlah=6;
        l1.hitungHargaTotal();
        l1.hitungDiskon();
        l1.hitungHargaBayar();
        System.out.println("Nama Barang   : "+l1.nama);
        System.out.println("Harga Satuan  : "+l1.hargaSatuan);
        System.out.println("Jumlah Barang : "+l1.jumlah);
        System.out.println("Harga Total   : "+l1.hitungHargaTotal());
        System.out.println("Diskon        : "+l1.hitungDiskon());
        System.out.println("Total Bayar   : "+l1.hitungHargaBayar());
    }
}