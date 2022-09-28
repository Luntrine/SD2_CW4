package ButtonsAndListeners;
import java.awt.*;
import javax.swing.*;


public class TestCalculator {

	public static void main(String[] args) {
		//The following code creates the Calculator object and sets it up.
		Calculator testCalculator = new Calculator();
		testCalculator.setTitle("TestCalculator");
		testCalculator.setSize(450,300);
		testCalculator.setVisible(true);
		testCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
