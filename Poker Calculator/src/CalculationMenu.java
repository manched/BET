import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculationMenu extends JFrame implements ActionListener{
	private JComboBox suitSelect, numSelect;
	double singlePair=0.422569,
		   twoPair=0.047539,
		   triple=0.0211285,
		   fullHouse=0.00144058,
		   fourKind=0.000240096,
		   straight=0.00392465
		   flush=0.0019654,
		   straightFlush=0.0000138517,
		   royalFlush=0.00000153908,
		   none=0.501177;
	
	//Create the JPanel
	public CalculationMenu(){
		super("Calculation Menu");
		//create the JFrame
		JFrame calcScreen = new JFrame();
		calcScreen.setVisible(true);
		calcScreen.setSize(750,500);
		
		JLabel Title = new JLabel("Select your cards");
		Title.setBounds(1, 1, 10, 10);
		calcScreen.add(Title);
		
	}	
	
	
	
	
	//Run the menu
	public static void main(String[] args) {new CalculationMenu();}

	public void actionPerformed(ActionEvent e) {

		
	}

}
