
public class Car {
	String color;
	int speed;
	Tire rearL;
	Tire rearR;
	
	public Car() {
		color = "red";
		speed = 0;
		rearL = new Tire();
		rearR = new Tire();
		System.out.println("Car 클래스 생성자");
	}
}
