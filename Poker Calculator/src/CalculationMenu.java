import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculationMenu extends JFrame implements ActionListener{
	private JComboBox suitSelect, numSelect;
	
	//Create the JPanel
	public CalculationMenu(){
		super("Calculation Menu");
		//create the JFrame
		JFrame calcScreen = new JFrame();
		calcScreen.setVisible(true);
		calcScreen.setSize(750,500);
		
		JLabel Title = new JLabel("Select your cards");
		JLabel probs=new JLabel("");
		Title.setBounds(1, 1, 10, 10);
		calcScreen.add(Title);
		
	}
	
	
	
	
	//Run the menu
	public static void main(String[] args) {new CalculationMenu();}

	public void actionPerformed(ActionEvent e) {

		
	}

}
