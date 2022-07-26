
public class Example02 {

	public static void main(String[] args) {
		 int x = 1;
		 int y;
		 x = x + 1;	//2
		 x += 1;	//3
		 x++;		//4
		 ++x;		//5
		 y = (x++);	//5로 대입후 증가
		 System.out.println(y);
		 y = (++x);
		 System.out.println(y);
		 y = (++x) + (x++);
		 System.out.println(y);
		 System.out.println(x);	
	}

}
