package week3day2;

public class Elements {

	public static void main(String[] args) {
		
		Button button = new Button();
		button.click();
		button.submit();
		
		TextField textfield = new  TextField();
		textfield.setText("hello world");
		textfield.getText();
		
		CheckBoxButton checkboxbutton = new CheckBoxButton();
		checkboxbutton.click();
		checkboxbutton.clickCheckButton();
		
		RadioButton radiobutton = new RadioButton();
		radiobutton.click();
		radiobutton.selectRadioButton();
		
		System.out.println("Execution Completed");
		
	}

}
