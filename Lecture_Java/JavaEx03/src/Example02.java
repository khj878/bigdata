
public class Example02 {

	public static void main(String[] args) {
		int score1 = 99;
		int score2 = 100;
		int score3 = 88;
		int sum, avg;
		
		sum = score1 + score2 + score3;
		avg = sum / 3;
		
		int score[] = {99, 100, 88};
		sum = score[0] + score[1] + score[2];
		avg = sum / 3;
		
		System.out.println(avg);
		
		int ref[] = score;
		ref[0] = 77;
		System.out.println(score[0]);
		
		int count = score.length;
		sum = 0;
		System.out.println("원소의 갯수:" + count);
		
		for(int i = 0; i < count; i++) {
			sum += score[i];
		}
		System.out.println("합계:" + sum);
	}

}
