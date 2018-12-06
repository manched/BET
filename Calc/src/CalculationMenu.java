import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculationMenu extends JFrame implements ActionListener{
	private JComboBox suitSelect, numSelect;
	Calculator Jeff = new Calculator();
	//Create the JPanel
	public CalculationMenu(){
		super("Calculation Menu");
		//create the JFrame
		JFrame calcScreen = new JFrame();
		calcScreen.setVisible(true);
		calcScreen.setSize(750,500);
		
		int CNum=1;
		//JLabel Title = new JLabel(""+Jeff.getCard(1));
		JLabel Title = new JLabel(""+Jeff.getCard(CNum).getNum()+" "+Jeff.getCard(CNum).getSuit()+" "+Jeff.getSize());
		Title.setBounds(500, 50, 100, 100);
		calcScreen.add(Title);
		JButton b=new JButton("ArrayFix");    
		b.setBounds(100,100,150, 40);
		calcScreen.add(b);
		
		JPanel chooseHand=new JPanel();
		calcScreen.add(chooseHand);
		JLabel suit=new JLabel("Choose your suit");
		suit.setVisible(true);
		chooseHand.add(suit);
		
		String[] suits={"Spades", "Clubs", "Diamond", "Hearts"};
		JComboBox<String> suitOptions=new JComboBox<String>(suits);
		suitOptions.setVisible(true);
		chooseHand.add(suitOptions);
		
		JButton suitRefresh=new JButton("Refresh");
		chooseHand.add(suitRefresh);
		
		JLabel nums=new JLabel("Choose your number");
		nums.setVisible(true);
		chooseHand.add(nums);
		
		String[] cardVals={"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
		JComboBox<String> cardValOptions=new JComboBox<String>(cardVals);
		cardValOptions.setVisible(true);
		chooseHand.add(cardValOptions);
		
		JButton cardValRefresh=new JButton("Refresh");
		chooseHand.add(cardValRefresh);
		
		calcScreen.setLayout(null);
		calcScreen.setVisible(true);
		
		
		
	
	
	/*SUIT VALUES:
	*1=Spades
	*2=Clubs
	*3=Diamond
	*4=Hearts
	*/
	//Run the menu
	
	
	b.addActionListener(new ActionListener() {
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
				Jeff.FixArray();
				Title.setText(""+Jeff.getCard(CNum).getNum()+" "+Jeff.getCard(CNum).getSuit()+" "+Jeff.getSize());
		}          
      });
	}         
	public static void main(String[] args) {new CalculationMenu();}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	//public void actionPerformed(ActionEvent e) {

		
	//}

}
