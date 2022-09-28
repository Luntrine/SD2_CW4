package ButtonsAndListeners;

//Imports what is needed for the GUI.
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FontSize extends JFrame implements ActionListener{
	
	private JLabel customX, fontSizeNumber;
	private JButton increase, decrease;
	int currentFontSize = 18;
	
	Font font = new Font("Arial", Font.PLAIN, 18);
	
	public FontSize() {
		setLayout(new GridLayout(2,1));
		
		//The following code adds the panels below to the FontSize GUI.
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,2));
		add(p);
		
		JPanel q = new JPanel();
		q.setLayout(new GridLayout(1,2));
		add(q);
		
		//The following code adds the customX and fontSize labels, 
		//and increase and decrease buttons to the GUI.
		
		customX = new JLabel("X",JLabel.RIGHT);
		customX.setBackground(Color.white);
		customX.setOpaque(true);
		customX.setFont(font);
		p.add(customX);
		
		fontSizeNumber = new JLabel("18",JLabel.LEFT);
		fontSizeNumber.setBackground(Color.white);
		fontSizeNumber.setOpaque(true);
		fontSizeNumber.setFont(font);
		p.add(fontSizeNumber);
		
		increase = buttonCreator("Increase");
		q.add(increase);
		increase.addActionListener(this);
		
		decrease = buttonCreator("Decrease");
		q.add(decrease);
		decrease.addActionListener(this);
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
	
	//The following method increases/decreases the size of the X, as well as the
	//number value next to it, as the respective buttons are pressed.
	public void actionPerformed(ActionEvent e) {
		
		if(currentFontSize > 1) 
		{
			decrease.setEnabled(true);
		}
		else
		{
			decrease.setEnabled(false);
		}
			
		if(e.getSource()==increase)
		{
			currentFontSize++;
		}
		else
		{
			currentFontSize--;
		}

		customX.setFont(new Font("Arial", Font.PLAIN, currentFontSize));
		fontSizeNumber.setText(String.valueOf(currentFontSize));	
	}
}
