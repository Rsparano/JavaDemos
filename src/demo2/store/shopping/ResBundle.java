package demo2.store.shopping;
import java.util.ResourceBundle;
import java.util.Locale;

public class ResBundle {

	public static void main(String[] args) {
		Locale locale = new Locale("en","GB");
		ResourceBundle bundle = ResourceBundle.getBundle("resources.messages",locale);
		String helloPattern = bundle.getString("hello");
		String otherMessage = bundle.getString("other");
// Need to create the resource file and put on disk or in the project.  Not sure
		//how to do this.
	}

}
