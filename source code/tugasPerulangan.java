import java.util.Scanner;
public class tugasPerulangan{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
	int hitung = 0;
	int nim;
	System.out.print("Masukkan NIM : ");
	nim = sc.nextInt();
	int angka = nim%100;
	if ( angka <= 10){
		angka += 10;
	} System.out.println("n = " + angka);
	for(int n = 0; n < angka; n++){
		System.out.print(hari[hitung] + " ");
		hitung++;
		if (hitung == 7){
			hitung = 0;
		}
	}
	}
}