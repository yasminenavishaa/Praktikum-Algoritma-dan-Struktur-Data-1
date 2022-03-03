import java.util.Scanner;
public class latihan2Main{
	public static void main(String[] args) {
		latihan2 l2 = new latihan2();
		Scanner sc = new Scanner(System.in);

		System.out.println("Cara Bermain");
		System.out.println("Ketik Y untuk ke arah kiri");
		System.out.println("Ketik X untuk ke arah kanan");
		System.out.println("Ketik O untuk ke arah atas");
		System.out.println("Ketik A untuk ke arah bawah");
		System.out.println("Ketik Selesai untuk menghentikan");

		l2.printPosition();
		loop : while (true){
			switch(sc.nextLine()){
				case "Y":
				l2.moveLeft();
				break;

				case "X":
				l2.moveRight();
				break;

				case "O":
				l2.moveUp();
				break;

				case "A":
				l2.moveDown();
				break;

				case "Selesai":
				break loop;

				default :
				l2.printPosition();
			}
		}
		
	}
}