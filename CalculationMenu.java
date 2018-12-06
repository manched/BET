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
		calcScreen.setLayout(null);
		calcScreen.setSize(825,500);
		calcScreen.setTitle("B.E.T. Poker Calculator");
		
		//ARRAYLIST DEBUGGING LABEL
		int CNum=1;
		//JLabel Title = new JLabel(""+Jeff.getCard(1));
		JLabel Title = new JLabel(""+Jeff.getCard(CNum).getNum()+" "+Jeff.getCard(CNum).getSuit()+" "+Jeff.getSize());
		Title.setBounds(500, 350, 100, 100);
		calcScreen.add(Title);
		JButton b=new JButton("Refresh");    
		b.setBounds(200,400,150,40);
		calcScreen.add(b);
		
		String[] suits={"Spades", "Clubs", "Diamond", "Hearts"};
		String[] cardVals={"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suitOpt={null,"Spades", "Clubs", "Diamond", "Hearts"};
		String[] cardValOpt= {null, "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		
		//LABEL PLACEMENT
		JLabel suit1=new JLabel("Pick the suit of the first card in your hand:");
		suit1.setBounds(5,10,275,15);
		calcScreen.add(suit1);
		
		JLabel nums1=new JLabel("Pick the number of the first card in your hand:");
		nums1.setBounds(400,10,275,15);
		calcScreen.add(nums1);
		
		JLabel suit2=new JLabel("Pick the suit of the second card in your hand:");
		suit2.setBounds(5,40,275,15);
		calcScreen.add(suit2);
		
		JLabel nums2=new JLabel("Pick the number of the second card in your hand:");
		nums2.setBounds(400,40,285,15);
		calcScreen.add(nums2);
		
		JLabel suit3=new JLabel("Pick the suit of the first flop card:");
		suit3.setBounds(5,70,275,15);
		calcScreen.add(suit3);
		
		JLabel nums3=new JLabel("Pick the number of the first flop card:");
		nums3.setBounds(400,70,275,15);
		calcScreen.add(nums3);
		
		JLabel suit4=new JLabel("Pick the suit of the second flop card:");
		suit4.setBounds(5,100,275,15);
		calcScreen.add(suit4);
		
		JLabel nums4=new JLabel("Pick the number of the second flop card:");
		nums4.setBounds(400,100,275,15);
		calcScreen.add(nums4);
		
		JLabel suit5=new JLabel("Pick the suit of the third flop card:");
		suit5.setBounds(5,130,275,15);
		calcScreen.add(suit5);
		
		JLabel nums5=new JLabel("Pick the number of the third flop card:");
		nums5.setBounds(400,130,275,15);
		calcScreen.add(nums5);
		
		JLabel suit6=new JLabel("(Optional) Pick the suit of the turn card:");
		suit6.setBounds(5,160,275,15);
		calcScreen.add(suit6);
		
		JLabel nums6=new JLabel("(Optional) Pick the number of the turn card:");
		nums6.setBounds(400,160,275,15);
		calcScreen.add(nums6);
		
		JLabel suit7=new JLabel("(Optional) Pick the suit of the river card:");
		suit7.setBounds(5,190,275,15);
		calcScreen.add(suit7);
		
		JLabel nums7=new JLabel("(Optional) Pick the number of the river card:");
		nums7.setBounds(400,190,275,15);
		calcScreen.add(nums7);
		
		JComboBox<String> suitOptionsUserhand1=new JComboBox<String>(suits);
		suitOptionsUserhand1.setBounds(275,5,100,25);
		suitOptionsUserhand1.setSelectedIndex(0);
		//suitOptionsUserhand1.setVisible(true);
		calcScreen.add(suitOptionsUserhand1);
		suitOptionsUserhand1.setActionCommand("suitOptionsUserhand1");
		//JButton suitRefreshUserhand1=new JButton("Refresh");
		//chooseHand.add(suitRefreshUserhand1);
		
		
		
		JComboBox<String> cardValOptionsUserhand1=new JComboBox<String>(cardVals);
		cardValOptionsUserhand1.setBounds(695,5,100,25);
		cardValOptionsUserhand1.setSelectedIndex(0);
		//cardValOptionsUserhand1.setVisible(true);
		calcScreen.add(cardValOptionsUserhand1);
		cardValOptionsUserhand1.setActionCommand("cardValOptionsUserhand1");
		
		//JButton cardValRefreshUserhand1=new JButton("Refresh");
		//chooseHand.add(cardValRefreshUserhand1);
		
		JComboBox<String> suitOptionsUserhand2=new JComboBox<String>(suits);
		suitOptionsUserhand2.setBounds(275,35,100,25);
		suitOptionsUserhand2.setSelectedIndex(0);
		suitOptionsUserhand2.setVisible(true);
		calcScreen.add(suitOptionsUserhand2);
		suitOptionsUserhand2.setActionCommand("suitOptionsUserhand2");
		
		JComboBox<String> cardValOptionsUserhand2=new JComboBox<String>(cardVals);
		cardValOptionsUserhand2.setBounds(695,35,100,25);
		cardValOptionsUserhand2.setSelectedIndex(0);
		cardValOptionsUserhand2.setVisible(true);
		calcScreen.add(cardValOptionsUserhand2);
		cardValOptionsUserhand2.setActionCommand("cardValOptionsUserhand2");
		
		JComboBox<String> suitOptionsflop1=new JComboBox<String>(suits);
		suitOptionsflop1.setBounds(275,65,100,25);
		suitOptionsflop1.setSelectedIndex(0);
		suitOptionsflop1.setVisible(true);
		calcScreen.add(suitOptionsflop1);
		suitOptionsflop1.setActionCommand("suitOptionsflop1");
		
		JComboBox<String> cardValOptionsflop1=new JComboBox<String>(cardVals);
		cardValOptionsflop1.setBounds(695,65,100,25);
		cardValOptionsflop1.setSelectedIndex(0);
		cardValOptionsflop1.setVisible(true);
		calcScreen.add(cardValOptionsflop1);
		cardValOptionsflop1.setActionCommand("cardValOptionsflop1");
		
		JComboBox<String> suitOptionsflop2=new JComboBox<String>(suits);
		suitOptionsflop2.setBounds(275,95,100,25);
		suitOptionsflop2.setSelectedIndex(0);
		suitOptionsflop2.setVisible(true);
		calcScreen.add(suitOptionsflop2);
		suitOptionsflop2.setActionCommand("suitOptionsflop2");
		
		JComboBox<String> cardValOptionsflop2=new JComboBox<String>(cardVals);
		cardValOptionsflop2.setBounds(695,95,100,25);
		cardValOptionsflop2.setSelectedIndex(0);
		cardValOptionsflop2.setVisible(true);
		calcScreen.add(cardValOptionsflop2);
		cardValOptionsflop2.setActionCommand("cardValOptionsflop2");
		
		JComboBox<String> suitOptionsflop3=new JComboBox<String>(suits);
		suitOptionsflop3.setBounds(275,125,100,25);
		suitOptionsflop3.setSelectedIndex(0);
		suitOptionsflop3.setVisible(true);
		calcScreen.add(suitOptionsflop3);
		suitOptionsflop3.setActionCommand("suitOptionsflop3");
		
		JComboBox<String> cardValOptionsflop3=new JComboBox<String>(cardVals);
		cardValOptionsflop3.setBounds(695,125,100,25);
		cardValOptionsflop3.setSelectedIndex(0);
		cardValOptionsflop3.setVisible(true);
		calcScreen.add(cardValOptionsflop3);
		cardValOptionsflop3.setActionCommand("cardValOptionsflop3");
		
		JComboBox<String> suitOptionsturn=new JComboBox<String>(suitOpt);
		suitOptionsturn.setBounds(275,155,100,25);
		suitOptionsturn.setSelectedIndex(0);
		suitOptionsturn.setVisible(true);
		calcScreen.add(suitOptionsturn);
		suitOptionsturn.setActionCommand("suitOptionsturn");
		
		JComboBox<String> cardValOptionsturn=new JComboBox<String>(cardValOpt);
		cardValOptionsturn.setBounds(695,155,100,25);
		cardValOptionsturn.setSelectedIndex(0);
		cardValOptionsturn.setVisible(true);
		calcScreen.add(cardValOptionsturn);
		cardValOptionsturn.setActionCommand("cardValOptionsturn");
		
		JComboBox<String> suitOptionsriver=new JComboBox<String>(suitOpt);
		suitOptionsriver.setBounds(275,185,100,25);
		suitOptionsriver.setSelectedIndex(0);
		suitOptionsriver.setVisible(true);
		calcScreen.add(suitOptionsriver);
		suitOptionsriver.setActionCommand("suitOptionsriver");
		
		JComboBox<String> cardValOptionsriver=new JComboBox<String>(cardValOpt);
		cardValOptionsriver.setBounds(695,185,100,25);
		cardValOptionsriver.setSelectedIndex(0);
		cardValOptionsriver.setVisible(true);
		calcScreen.add(cardValOptionsriver);
		cardValOptionsriver.setActionCommand("cardValOptionsriver");
		
		calcScreen.setVisible(true);
		
		
		
	
	
	/*SUIT VALUES:
	*1=Spades
	*2=Clubs
	*3=Diamond
	*4=Hearts
	*/
	//Run the menu
	
	suitOptionsUserhand1.addActionListener(this);
	suitOptionsUserhand2.addActionListener(this);
	suitOptionsflop1.addActionListener(this);
	suitOptionsflop2.addActionListener(this);
	suitOptionsflop3.addActionListener(this);
	suitOptionsturn.addActionListener(this);
	suitOptionsriver.addActionListener(this);
	cardValOptionsUserhand1.addActionListener(this);
	cardValOptionsUserhand2.addActionListener(this);
	cardValOptionsflop1.addActionListener(this);
	cardValOptionsflop2.addActionListener(this);
	cardValOptionsflop3.addActionListener(this);
	cardValOptionsturn.addActionListener(this);
	cardValOptionsriver.addActionListener(this);
	
	}
	public static void main(String[] args) {new CalculationMenu();}
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
        String setCardValue = (String)cb.getSelectedItem();
        if(e.getActionCommand().equals("suitOptionsUserhand1")) {
        	if(setCardValue.equals("Spades")) {
        		Jeff.setUserhand1S(1);
        	}
			if(setCardValue.equals("Clubs")) {
				Jeff.setUserhand1S(2);	
			}
			if(setCardValue.equals("Diamonds")) {
				Jeff.setUserhand1S(3);
			}
			if(setCardValue.equals("Hearts")) {
				Jeff.setUserhand1S(4);
			}
        }
        if(e.getActionCommand().equals("suitOptionsUserhand2")) {
        	if(setCardValue.equals("Spades")) {
        		Jeff.setUserhand2S(1);
        	}
			if(setCardValue.equals("Clubs")) {
				Jeff.setUserhand2S(2);	
			}
			if(setCardValue.equals("Diamonds")) {
				Jeff.setUserhand2S(3);
			}
			if(setCardValue.equals("Hearts")) {
				Jeff.setUserhand2S(4);
			}
        }
        if(e.getActionCommand().equals("suitOptionsflop1")) {
        	if(setCardValue.equals("Spades")) {
        		Jeff.setflop1S(1);
        	}
			if(setCardValue.equals("Clubs")) {
				Jeff.setflop1S(2);	
			}
			if(setCardValue.equals("Diamonds")) {
				Jeff.setflop1S(3);
			}
			if(setCardValue.equals("Hearts")) {
				Jeff.setflop1S(4);
			}
        }
        if(e.getActionCommand().equals("suitOptionsflop2")) {
        	if(setCardValue.equals("Spades")) {
        		Jeff.setflop2S(1);
        	}
			if(setCardValue.equals("Clubs")) {
				Jeff.setflop2S(2);	
			}
			if(setCardValue.equals("Diamonds")) {
				Jeff.setflop2S(3);
			}
			if(setCardValue.equals("Hearts")) {
				Jeff.setflop2S(4);
			}
        }
        if(e.getActionCommand().equals("suitOptionsflop3")) {
        	if(setCardValue.equals("Spades")) {
        		Jeff.setflop3S(1);
        	}
			if(setCardValue.equals("Clubs")) {
				Jeff.setflop3S(2);	
			}
			if(setCardValue.equals("Diamonds")) {
				Jeff.setflop3S(3);
			}
			if(setCardValue.equals("Hearts")) {
				Jeff.setflop3S(4);
			}
        }
        if(e.getActionCommand().equals("suitOptionsturn")) {
        	if(setCardValue==null) {
        		Jeff.setturnS(0);
        	}
        	else if(setCardValue.equals("Spades")) {
        		Jeff.setturnS(1);
        	}
			if(setCardValue.equals("Clubs")) {
				Jeff.setturnS(2);	
			}
			if(setCardValue.equals("Diamonds")) {
				Jeff.setturnS(3);
			}
			if(setCardValue.equals("Hearts")) {
				Jeff.setturnS(4);
			}
        }
        if(e.getActionCommand().equals("suitOptionsriver")) {
        	if(setCardValue==null) {
        		Jeff.setriverS(0);
        	}
        	if(setCardValue.equals("Spades")) {
        		Jeff.setriverS(1);
        	}
			if(setCardValue.equals("Clubs")) {
				Jeff.setriverS(2);	
			}
			if(setCardValue.equals("Diamonds")) {
				Jeff.setriverS(3);
			}
			if(setCardValue.equals("Hearts")) {
				Jeff.setriverS(4);
			}
        }
        if(e.getActionCommand().equals("cardValOptionsUserhand1")) {
        	if(setCardValue.equals("A")) {
        		Jeff.setUserhand1N(1);
        	}
        	else if(setCardValue.equals("Jack")) {
        		Jeff.setUserhand1N(11);
        	}
        	else if(setCardValue.equals("Queen")) {
        		Jeff.setUserhand1N(12);
        	}
        	else if(setCardValue.equals("King")) {
        		Jeff.setUserhand1N(13);
        	}
        	else {
        		Jeff.setUserhand1N(Integer.parseInt(setCardValue));
        	}
        }
        if(e.getActionCommand().equals("cardValOptionsUserhand2")) {
        	if(setCardValue.equals("A")) {
        		Jeff.setUserhand2N(1);
        	}
        	else if(setCardValue.equals("Jack")) {
        		Jeff.setUserhand2N(11);
        	}
        	else if(setCardValue.equals("Queen")) {
        		Jeff.setUserhand2N(12);
        	}
        	else if(setCardValue.equals("King")) {
        		Jeff.setUserhand2N(13);
        	}
        	else {
        		Jeff.setUserhand2N(Integer.parseInt(setCardValue));
        	}
        }
        if(e.getActionCommand().equals("cardValOptionsflop1")) {
        	if(setCardValue.equals("A")) {
        		Jeff.setflop1N(1);
        	}
        	else if(setCardValue.equals("Jack")) {
        		Jeff.setflop1N(11);
        	}
        	else if(setCardValue.equals("Queen")) {
        		Jeff.setflop1N(12);
        	}
        	else if(setCardValue.equals("King")) {
        		Jeff.setflop1N(13);
        	}
        	else {
        		Jeff.setflop1N(Integer.parseInt(setCardValue));
        	}
        }
        if(e.getActionCommand().equals("cardValOptionsflop2")) {
        	if(setCardValue.equals("A")) {
        		Jeff.setflop2N(1);
        	}
        	else if(setCardValue.equals("Jack")) {
        		Jeff.setflop2N(11);
        	}
        	else if(setCardValue.equals("Queen")) {
        		Jeff.setflop2N(12);
        	}
        	else if(setCardValue.equals("King")) {
        		Jeff.setflop2N(13);
        	}
        	else {
        		Jeff.setflop2N(Integer.parseInt(setCardValue));
        	}
        }
        if(e.getActionCommand().equals("cardValOptionsflop3")) {
        	if(setCardValue.equals("A")) {
        		Jeff.setflop3N(1);
        	}
        	else if(setCardValue.equals("Jack")) {
        		Jeff.setflop3N(11);
        	}
        	else if(setCardValue.equals("Queen")) {
        		Jeff.setflop3N(12);
        	}
        	else if(setCardValue.equals("King")) {
        		Jeff.setflop3N(13);
        	}
        	else {
        		Jeff.setflop3N(Integer.parseInt(setCardValue));
        	}
        }
        if(e.getActionCommand().equals("cardValOptionsturn")) {
        	if(setCardValue==null) {
        		Jeff.setturnN(0);
        	}
        	else if(setCardValue.equals("A")) {
        		Jeff.setturnN(1);
        	}
        	else if(setCardValue.equals("Jack")) {
        		Jeff.setturnN(11);
        	}
        	else if(setCardValue.equals("Queen")) {
        		Jeff.setturnN(12);
        	}
        	else if(setCardValue.equals("King")) {
        		Jeff.setturnN(13);
        	}
        	else {
        		Jeff.setturnN(Integer.parseInt(setCardValue));
        	}
        }
        if(e.getActionCommand().equals("cardValOptionsriver")) {
        	if(setCardValue==null) {
        		Jeff.setriverN(0);
        	}
        	else if(setCardValue.equals("A")) {
        		Jeff.setriverN(1);
        	}
        	else if(setCardValue.equals("Jack")) {
        		Jeff.setriverN(11);
        	}
        	else if(setCardValue.equals("Queen")) {
        		Jeff.setriverN(12);
        	}
        	else if(setCardValue.equals("King")) {
        		Jeff.setriverN(13);
        	}
        	else {
        		Jeff.setriverN(Integer.parseInt(setCardValue));
        	}
        }
        //Jeff.FixArray();
		
	}

	//public void actionPerformed(ActionEvent e) {

		
	//}

}
