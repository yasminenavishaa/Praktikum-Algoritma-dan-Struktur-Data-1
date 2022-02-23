import java.util.Scanner;
public class tugas2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		double s;
		double v;
		double t;
		System.out.println("1. Kecepatan");
		System.out.println("2. Jarak");
		System.out.println("3. Waktu");
		System.out.print("\nMasukkan angka: ");
		menu = sc.nextInt();
		switch(menu){
			case 1:
				System.out.print("Masukkan Jarak: ");
				s = sc.nextInt();
				System.out.print("Masukkan Waktu: ");
				t = sc.nextInt();
				v = s/t;
				System.out.print("Kecepatannya : " +v);
				break;
			case 2:
				System.out.print("Masukkan Kecepatan: ");
				v = sc.nextInt();
				System.out.print("Masukkan Waktu: ");
				t = sc.nextInt();
				s = v*t;
				System.out.print("Jaraknya : " + s);
				break;
			case 3:
				System.out.print("Masukkan Jarak: " );
				s = sc.nextInt();
				System.out.println("Masukkan Kecepatan: ");
				v = sc.nextInt();
				t = s/v;
				System.out.print("Waktunya : " +t);
				break;
		}
	}
}