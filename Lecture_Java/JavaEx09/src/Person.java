
public class Person {
	public static void main(String[] args) {
		/*
		Circle c = new Circle();
		
		double r = 1.0;
		double area = r * r * Circle.pi;
		System.out.println(area);
		*/
		
		//System.out.println(Circle.Add(100, 200));
		
		//������ ���������� �޸𸮿� ����
		Circle c = new Circle();
		c.radious = 10;
		double result = c.GetArea();
		System.out.println(result);
		
		
		//������ ����� �� ���� �޸𸮿� ����
		result = Circle.GetArea(20);
		System.out.println(result);
	}
}
