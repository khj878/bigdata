
public class Example03 {
	public static void main(String[] args) {
		int score[] = {60, 80, 99, 44, 76, 69};
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			if(score[i] > 60) System.out.println(score[i]);
			sum += score[i];
		}	
		System.out.println(sum);
		System.out.println(sum/score.length);
	}
}
