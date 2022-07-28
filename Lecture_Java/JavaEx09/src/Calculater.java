import java.util.*;

public class Calculater {
	
	private int x, y;
	private char op;
	
	private int Add(int x, int y) {
		return x + y;
	}
	
	private int Sub(int x, int y) {
		return x - y;
	}
	
	private int Mul(int x, int y) {
		return x * y;
	}
	
	private int Div(int x, int y) {
		return x / y;
	}
	
	private void DoCal(int x, int y, char op) {
		switch(op) {
		case '+' : 
			System.out.println(Add(x,y));
			break;
		case '-' : 
			System.out.println(Sub(x,y));
			break;
		case '*' : 
			System.out.println(Mul(x,y));
			break;
		case '/' : 
			try {
				System.out.println(Div(x,y));				
			}
			catch(Exception e) {
				System.out.println("0으로 나눠졌습니다.");
			}
			
			break;
		default : 
			System.out.println("잘못된 연산자입니다.");
			break;
		}
	}
	
	/*
	private double Add(double x, double y) {
		return x + y;
	}
	
	private double Sub(double x, double y) {
		return x - y;
	}
	
	private double Mul(double x, double y) {
		return x * y;
	}
	
	private double Div(double x, double y) {
		return x / y;
	}
	
	private void DoCalDouble(double x, double y, char op) {
		switch(op) {
		case '+' : 
			System.out.println(Add(x,y));
			break;
		case '-' : 
			System.out.println(Sub(x,y));
			break;
		case '*' : 
			System.out.println(Mul(x,y));
			break;
		case '/' : 
			try {
				System.out.println(Div(x,y));				
			}
			catch(Exception e) {
				System.out.println("0으로 나눠졌습니다.");
			}
			
			break;
		default : 
			System.out.println("잘못된 연산자입니다.");
			break;
		}
	}
	*/
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculater c = new Calculater();
		
		int x = 0, y = 0;
		char op = ' ';		
		
		System.out.print("첫번째 수 입력:");
		try {
			x = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("잘못된 입력입니다.");       
			System.exit(0);
		}
		
		System.out.print("연산자 입력(+,-,*,/):");
		
		try {
			op = sc.next().charAt(0);
		}
		catch(Exception e) {
			System.out.println("잘못된 입력입니다.");       
			System.exit(0);
		}
				
		System.out.print("두번째 수 입력:");
		try {
			y = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("잘못된 입력입니다.");      
			System.exit(0);
		}
		
		c.DoCal(x, y, op);
		
	}
	
}
