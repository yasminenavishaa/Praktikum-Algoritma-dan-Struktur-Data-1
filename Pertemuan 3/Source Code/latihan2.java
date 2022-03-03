public class latihan2 {
	int x, y;
	int width, height;

	void moveLeft(){
		if(x > 1)x--;
		printPosition();
	}
	void moveRight(){
		if(x < width-1)x--;
		printPosition();
	}
	void moveUp(){
		if(y > 1)y--;
		printPosition();
	}
	void moveDown(){
		if(y < height - 1)y++;
		printPosition();
	}
	void printPosition(){
		System.out.print(": ");
	}
}