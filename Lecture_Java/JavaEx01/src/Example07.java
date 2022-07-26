
public class Example07 {

	public static void main(String[] args) {
		int dice = (int)(Math.random() * 100 % 6) + 1;
		
		if(dice == 1) {
			System.out.println("1번");
		}
		else if(dice == 2) {
			System.out.println("2번");
		}
		else if(dice == 3) {
			System.out.println("3번");
		}
		else if(dice == 4) {
			System.out.println("4번");
		}
		else if(dice == 5) {
			System.out.println("5번");
		}
		else {
			System.out.println("6번");
		}
		System.out.println(dice);
	}
	
}
