public class Example01 {
	public static void main(String agrs[]) {
		int score[] = {11, 22, 33};
		
		try {
			System.out.println(score[30]);
		}
		catch(Exception e) {
			System.out.println("���ܹ߻�");
			e.printStackTrace();
		}
		System.out.println("���α׷� ����!!");
	}
}
