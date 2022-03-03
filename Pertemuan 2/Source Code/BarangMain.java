public class BarangMain {
	public static void main(String[] args){
		Barang b1 = new Barang();
		b1.namaBarang = "Komik";
		b1.jenisBarang = "Buku";
		b1.hargaSatuan = 75000;
		b1.stok = 10;

		System.out.println("Sebelum Update :");
		b1.tampilBarang();
		System.out.println("Update Data");
		b1.tambahStok(2);
		System.out.println("Stok Setelah Pembelian");
		b1.kurangiStok(3);
		System.out.println("Setelah Update :");
		b1.tampilBarang();
		int hargaTotal = b1.hitungHargaTotal(4);
		System.out.println("Harga 4 barang : " + hargaTotal);
		Barang b2 = new Barang("Novel", "Buku", 20, 80000);
		b2.tampilBarang();
		Barang b3 = new Barang("Buku Gambar", "Buku", 10, 10000);
		b3.tampilBarang();
	}
}