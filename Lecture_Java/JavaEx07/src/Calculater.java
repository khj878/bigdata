public class Calculater {
	public void MakeSum(int max) {
		int sum = 0;
		for(int i = 0; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void PrintStar(int max) {
		for(int i = 0; i < max; i++) {
			System.out.print("*");
		}		
		System.out.println("");
	}
	
	public void PrintGugudan(int y) {
		for(int i = 1; i < 10; i++) {
			System.out.println(y + " * " + i + " = " + (i * y) );
		}		
		System.out.println("");
	}
	
	int Add(int x, int y) {
		return x + y;
	}
	int Add(int x, int y, int z) {
		return x + y + z;
	}
	double Add(double x, double y) {
		return x + y;
	}
}
