package browser_buddy;

public class Main {
	public static void main(String[] args){

		Browser b = new Browser();

		b.open("google.com");
		b.open("github.com");
		b.open("stackoverflow.com");

		b.back();
		b.show();

		b.forward();
		b.show();

		b.closeTab();
		b.show();

		b.reopenTab();
		b.show();
	}
}
