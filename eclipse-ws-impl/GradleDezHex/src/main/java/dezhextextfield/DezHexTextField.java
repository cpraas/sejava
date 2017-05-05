package dezhextextfield;
import javafx.scene.control.TextField;

public class DezHexTextField extends TextField
{
	@Override public void replaceText(int start, int end, String text) {
        if (text.matches("[0-9,A-F]") || text == "") {
            super.replaceText(start, end, text);
        }
    }
  
    @Override public void replaceSelection(String text) {
        if (text.matches("[0-9,A-F]") || text == "") {
            super.replaceSelection(text);
        }
    }
}

//einbinden mit DezHexTextField und
//<?import testpackage.DezHexTextField?>