public class Circle {
	//static double pi = Math.PI;
	
	/*
	static int Add(int x, int y) {
		return x + y;
	}
	*/
	
	static double pi = 3.14;
	double radious;
	
	double GetArea() {
		return pi * radious * radious;
	}

	static double GetArea(double r) {
		return pi * r * r;
	}
}
