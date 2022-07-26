
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] arr = {0,0,0};
		Scanner in = new Scanner(System.in);
		arr[0] = in.nextInt();
		arr[1] = in.nextInt();
		arr[2] = in.nextInt();
		
		Arrays.sort(arr);
		
		int price = 0;
		
		if ( arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[0]) {
			price += 10000 + arr[0] * 1000;
		} 
		else if ((arr[0] == arr[1])) {
			price += 1000+ arr[0] * 100;
		}
		else if ((arr[1] == arr[2])) {
			price += 1000 + arr[1] * 100;
			
											
		}
		else if ((arr[0] == arr[2])) {
			price += 1000 + arr[0] * 100;
		}
		else {
			price += arr[2] * 100;
		}
		System.out.println(price);
	}
}
