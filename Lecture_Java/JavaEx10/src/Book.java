public class Book {
	
	String title;
	String author;
	int price;
	
	void SetInfo(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void Print() {
		System.out.println("力格:" + this.title);
		System.out.println("历磊:" + this.author);
		System.out.println("啊拜:" + this.price);
	}
	
	
	public static void main(String args[]) {
		Book b = new Book();
		b.SetInfo("氓 力格", "全辨悼", 1000);
		b.Print();
	}
}
