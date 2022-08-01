public class Example03 {
	public static void main(String[] args) {
		int x, y, z = 0;
		int arr[] = {1, 2, 3};
		String str = null;
		
		x = 10;
		y = 10;
		
		try {
			z = x / y;			
			z = arr[0];
			str.toUpperCase();
		}
		catch (ArithmeticException e) {
			System.out.println("수식오류");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열오류");
		}		
		catch (Exception e) {
			System.out.println("기타오류");
		}
		
		System.out.println("OK");
	}
}
