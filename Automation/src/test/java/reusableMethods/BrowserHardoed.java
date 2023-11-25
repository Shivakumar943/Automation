package reusableMethods;

public class BrowserHardoed {

	public static void main(String[] args) {

		Browser bro=new Browser();

		bro.init();
		bro.openLink("https://www.youtube.com/watch?v=iTWUfWvpdIE");
		bro.close();
	}
}