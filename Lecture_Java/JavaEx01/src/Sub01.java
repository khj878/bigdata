
public class Sub01 {
	public static void main(String[] args) {
		int x = 1;
		while(x <= 4) {
			int star = x;
			while(star <= 4) {
				System.out.print(" ");
				star++;
			}
			star = 1;
			while(star < x * 2 ) {
				System.out.print("*");
				star++;
			}
			System.out.println("");
			x++;
		}
	
	}
}
