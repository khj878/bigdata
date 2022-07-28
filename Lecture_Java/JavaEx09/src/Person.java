
public class Person {
	public static void main(String[] args) {
		/*
		Circle c = new Circle();
		
		double r = 1.0;
		double area = r * r * Circle.pi;
		System.out.println(area);
		*/
		
		//System.out.println(Circle.Add(100, 200));
		
		//메인이 끝날때까지 메모리에 존재
		Circle c = new Circle();
		c.radious = 10;
		double result = c.GetArea();
		System.out.println(result);
		
		
		//수식이 실행될 때 까지 메모리에 존재
		result = Circle.GetArea(20);
		System.out.println(result);
	}
}
