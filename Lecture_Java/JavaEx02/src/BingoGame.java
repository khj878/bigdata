import java.util.Scanner;

public class BingoGame {

	public static void main(String[] args) {
		int count = 0;
		int answer = (int)( Math.random() * 1000 ) % 100 + 1;
		System.out.println("정답:" + answer);
		
		Scanner KeyIn = new Scanner(System.in);
		int userKey;
		while(true) {
			System.out.print("입력[" + (5-count) + "번남음]:");
			userKey = KeyIn.nextInt();
		
			if(userKey < answer) {
				System.out.println("UP");
				count++;
			}
			else if(userKey > answer) {
				System.out.println("DOWN");
				count++;
			}
			else {
				System.out.println("BINGO");
				break;
			}
			
			if (count >= 5) {
				System.out.println("Game Over!");
				break;
			}
		}
	}

}
