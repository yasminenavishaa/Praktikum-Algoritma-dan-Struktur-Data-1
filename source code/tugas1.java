import java.util.Scanner;
public class tugas1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int harga = 4500;
	int ani = 4;
	int budi = 15;
	int bina = 6;
	int cita = 11;
	int total;
	System.out.println("===Selamat datang di Smiley Laundry===");
	System.out.println("Pakaian di atas 10 Kg mendapat diskon sebesar 5%");
	System.out.println();
	System.out.println("Budi dan Cita mendapat diskon sebesar 5%");
	int hargaBudi = (budi*harga)*5/100;
	int hargaBudi1 = (budi*harga)-hargaBudi;
	int hargaCita = (cita*harga)*5/100;
	int hargaCita1 = (cita*harga)-hargaCita;

	total = (ani*harga)+(bina*harga)+hargaBudi1+hargaCita1;
	System.out.println("Total Pendapatan : Rp." + total);
	}
}