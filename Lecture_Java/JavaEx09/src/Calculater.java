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
				System.out.println("0���� ���������ϴ�.");
			}
			
			break;
		default : 
			System.out.println("�߸��� �������Դϴ�.");
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
				System.out.println("0���� ���������ϴ�.");
			}
			
			break;
		default : 
			System.out.println("�߸��� �������Դϴ�.");
			break;
		}
	}
	*/
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculater c = new Calculater();
		
		int x = 0, y = 0;
		char op = ' ';		
		
		System.out.print("ù��° �� �Է�:");
		try {
			x = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");       
			System.exit(0);
		}
		
		System.out.print("������ �Է�(+,-,*,/):");
		
		try {
			op = sc.next().charAt(0);
		}
		catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");       
			System.exit(0);
		}
				
		System.out.print("�ι�° �� �Է�:");
		try {
			y = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");      
			System.exit(0);
		}
		
		c.DoCal(x, y, op);
		
	}
	
}
