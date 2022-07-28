public class Person {
	public static void main(String[] args) {
		Calculater c = new Calculater();
		c.MakeSum(10);
		
		for(int i = 0; i < 10; i++) {
			c.PrintStar(i);
		}
		
		for(int i = 1; i < 10; i++) {
			c.PrintGugudan(i);
		}
		
		int z = c.Add(100, 200);
		System.out.println(z);
		
		double y = c.Add(100.11, 200.222);
		System.out.println(y);		
		

		int x = c.Add(100, 200, 300);
		System.out.println(x);
	}
}
