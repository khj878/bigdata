
public class Example14 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 9; j >= i ; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int x = 1; x <= 10; x++) {
			for(int y = x; y <= 10; y++) {
				System.out.print("#");			
			}
			for(int z = 1; z <= x; z++) {
				System.out.print("*");			
			}
			System.out.println("");			
		}
	}
}
