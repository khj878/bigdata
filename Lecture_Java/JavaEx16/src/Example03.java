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
			System.out.println("���Ŀ���");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭����");
		}		
		catch (Exception e) {
			System.out.println("��Ÿ����");
		}
		
		System.out.println("OK");
	}
}
