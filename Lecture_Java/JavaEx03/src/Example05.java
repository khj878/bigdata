
public class Example05 {
	public static void main(String[] args) {
		int score[] = {11, 22, 33, 44, 55};
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("гу╟Х:" + sum);
		
		sum = 0;
		for(int data : score) {
			sum += data;
		}			
		System.out.println(sum);
	}
}
