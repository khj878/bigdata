
public class Example10 {
	
	public static void main(String[] args) {
		 int n = 0;
		 int evenSum = 0;
		 int oddSum = 0;
		 while(n <= 100) {
			 if(n % 2 == 0) evenSum += n;
			 else oddSum += n;
			 n++;
		 }
		 System.out.println("¦����:" + evenSum);
		 System.out.println("Ȧ����:" + oddSum);
		 System.out.println("��ü��:" + (evenSum+oddSum));
	}
	
}
