
public class Example06 {
	public static void main(String[] args) {
		/*
		String x = "1000";
		String y = "9999";
		int z;
		
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		
		z = ix + iy;
		
		System.out.println(z);
		*/
		String score1 = "99980";
		String score2 = "10000";
		
		int total = 0;
		
		total = Integer.parseInt(score1);
		total = total + Integer.parseInt(score2);
		System.out.println(total);
		
		String fstr = "12.345";
		float f = Float.parseFloat(fstr);
		System.out.println(f);
		
		String dstr = "111.3333";
		double d = Double.parseDouble(dstr);
		System.out.println(d);
		
	}
}
