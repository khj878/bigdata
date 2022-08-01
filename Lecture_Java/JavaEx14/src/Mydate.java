public class Mydate {
	private int year;
	private int month;
	private int day;
	
	public Mydate() {
		year = 2022;
		month = 8;
		day = 1;
	}
	
	public int GetValue(DayType mode) {
		/*
		if(mode == DayType.YEAR) return year;
		else if(mode == DayType.MONTH) return month;
		else return day;
		*/
		
		switch(mode) {
		case YEAR  : return year;
		case MONTH : return month;
		case DAY   : return day;
		}
		return year;
	}
	
	public void PrintInfo() {
		System.out.println(year + "³â" + month + "¿ù" + day + "ÀÏ");
	}
}
