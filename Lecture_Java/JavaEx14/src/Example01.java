public class Example01 {
	public static void main(String agrs[]) {
		Gender gender = Gender.WOMAN;
		if(gender == Gender.MAN) {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		City c = City.JEONJU;
		
		Mydate d = new Mydate();
		d.PrintInfo();
		System.out.println(d.GetValue(DayType.YEAR));
		System.out.println(d.GetValue(DayType.MONTH));
		System.out.println(d.GetValue(DayType.DAY));
	}
}
