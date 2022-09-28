package ButtonsAndListeners;

//Imports what is needed for the GUI.
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
	
	private JLabel accumulator;
	private JButton clear, add, subtract, multiply, divide;
	private JTextField input;
	
	Font font = new Font("Arial", Font.PLAIN, 18);
	
	public Calculator() {
		setLayout(new GridLayout(3,1));
		
		//The following code adds the panels below to the Calculator GUI.
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,1));
		add(p);
		
		JPanel q = new JPanel();
		q.setLayout(new GridLayout(1,1));
		add(q);
		
		JPanel r = new JPanel();
		r.setLayout(new GridLayout(1,5));
		add(r);
		
		//The following code adds the accumulator label, input text field, and buttons
		//for each of the calculator functions to the GUI.
		
		accumulator = new JLabel("0",JLabel.RIGHT);
		accumulator.setBackground(Color.white);
		accumulator.setOpaque(true);
		accumulator.setFont(font);
		p.add(accumulator);
		
		input = new JTextField(0);
		input.setBackground(Color.white);
		input.setOpaque(true);
		input.setFont(font);
		input.setHorizontalAlignment(JTextField.RIGHT);
		q.add(input);
		
		clear = buttonCreator("CLR");
		r.add(clear);
		clear.addActionListener(this);
		
		add = buttonCreator("+");
		r.add(add);
		add.addActionListener(this);
		
		subtract = buttonCreator("-");
		r.add(subtract);
		subtract.addActionListener(this);

		multiply = buttonCreator("*");
		r.add(multiply);
		multiply.addActionListener(this);

		divide = buttonCreator("/");
		r.add(divide);
		divide.addActionListener(this);
	}
	
	//The following method serves as a way to clear code duplication from the constructor.
	private JButton buttonCreator(String text)
	{
		JButton b = new JButton(text);
		b.setBackground(Color.white);
		b.setOpaque(true);
		b.setFont(font);
		return b;
	}
	
	//The following method performs arithmetic functions on the accumulator
	//given the value of the String in the input text field.
	public void actionPerformed(ActionEvent e){
		
		Double accumulatorDouble = Double.valueOf(accumulator.getText());
		Double inputDouble = Double.valueOf(input.getText());
		Double sum = 0.0;
			
		if(e.getSource()==clear)
		{
			accumulator.setText("0");
		}
		else if(e.getSource()==add)
		{
			sum = accumulatorDouble + inputDouble;
		}
		else if(e.getSource()==subtract)
		{
			sum = accumulatorDouble - inputDouble;
		}
		else if(e.getSource()==multiply)
		{
			sum = accumulatorDouble * inputDouble;
		}
		else if(e.getSource()==divide)
		{
			sum = accumulatorDouble / inputDouble;
		}
		
		if(!(e.getSource()==clear))
		{
			accumulator.setText(String.valueOf(sum));
		}
	}
	
}
