public class Example01 {
	public static void main(String[] args) {
		String score = "11,88   / 22,90 /     33,56	/ 		44,100   /    55,24";
		String scoreData[] = score.split("/");
		
		int sum = 0;
		for(String data : scoreData) {
			data = data.trim();
			data = data.replace(",", "");		
			sum += Integer.parseInt(data);
		}
		System.out.println("ЦђБе=" + sum / scoreData.length);
		
	}
}
