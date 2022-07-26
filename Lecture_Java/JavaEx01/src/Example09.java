
public class Example09 {

	public static void main(String[] args) {
		int n = 8;
		if(n % 2 == 0) {
			if(n % 4 == 0) {
				System.out.println("2와 4의 배수");
			}
		}
		if(n % 2 == 0 && n % 4 == 0) {
			System.out.println("2와 4의 배수");
		}
	}

}
