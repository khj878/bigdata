
public class Example07 {

	public static void main(String[] args) {
		String str = "1,200";
		str = str.replace(",", "");
		int x = Integer.parseInt(str);
		System.out.println(x);
		
		String score[] = {"11,000", "22,000", "99,000", "100,000", "88,000"};
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			String data = score[i].replace(",", "");
			sum += Integer.parseInt(data);
		}
		System.out.println(sum);
	}

}

