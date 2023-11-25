package reusableMethods;

public class FbHardoed {

	public static void main(String[] args) {

		FbUtility fb=new FbUtility();
		
		fb.init();
		fb.openUrl("https://www.facebook.com/");
		fb.addElements("shivakumar");
		fb.addpass("12345trewq");
		//fb.close();
	}

}
