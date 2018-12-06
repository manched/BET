import java.util.*;
public class Calculator {
	//Card[] Cardlist = new Card[50];
	ArrayList<Card> Cardlist = new ArrayList<Card>();
	int TestNum = 0;
	//Inputs
	Hand Userhand = new Hand(new Card(2, 1), new Card(5, 2));
	Card flop1 = new Card(11, 4);
	Card flop2 = new Card(5, 3);
	Card flop3 = new Card(6, 3);
	Card turn = new Card(0,0);
	Card river = new Card(0,0);
	//CONSTRUCTORS
	public Calculator(){
		MakeArray();
	}
	
	public void MakeArray(){
		TestNum=0;
		for(int s=1; s<=4; s++) {
			for(int n=1; n<14; n++) {
				if((s!=Userhand.getFirstCard().getSuit()||n!=Userhand.getFirstCard().getNum())&&(s!=Userhand.getSecondCard().getSuit()||n!=Userhand.getSecondCard().getNum())&&(s!=flop1.getSuit()||n!=flop1.getNum())&&(s!=flop2.getSuit()||n!=flop2.getNum())&&(s!=flop3.getSuit()||n!=flop3.getNum())){
					Card TestedCard = new Card(n,s);
					Cardlist.add(TestNum,TestedCard);
					TestNum++;
					
				}
				
				//Make sure it's not a userhand card
				//Make sure it isn't a flop	
			}
			
		}
		/*for(int s=1; s<5; s++) {
			for(int n=1; n<14; n++) {	
					if(!(s!=Userhand.getFirstCard().getSuit()&&n!=Userhand.getFirstCard().getNum())&&(s!=Userhand.getSecondCard().getSuit()&&n!=Userhand.getSecondCard().getNum())){
						Cardlist.remove(TestNum);
					}
	
			}
		}*/
	}
	public void FixArray(){
		MakeArray();
		for(Card TestedCard: Cardlist) {
			if(turn!=null) {
				if(TestedCard.getSuit()==turn.getSuit()&&TestedCard.getNum()==turn.getNum()){
					Cardlist.remove(TestedCard);
				}
			}
			if(river!=null) {
				if(TestedCard.getSuit()==river.getSuit()&&TestedCard.getNum()==river.getNum()){
					Cardlist.remove(TestedCard);
				}
			}
		}
	}
	
	//ACCESSORS
	public Card getCard(int num) {return Cardlist.get(num);}
	public int getSize() {return Cardlist.size();}
	public Hand getUserhand() {return Userhand;}
	
	//ACCESSORS
	public void setUserhand1N(int num){Userhand.getFirstCard().setNum(num);}
	public void setUserhand1S(int suit){Userhand.getFirstCard().setSuit(suit);}
	public void setUserhand2N(int num){Userhand.getSecondCard().setNum(num);}
	public void setUserhand2S(int suit){Userhand.getSecondCard().setSuit(suit);}
	public void setflop1N(int num){flop1.setNum(num);}
	public void setflop1S(int suit){flop1.setSuit(suit);}
	public void setflop2N(int num){flop2.setNum(num);}
	public void setflop2S(int suit){flop2.setSuit(suit);}
	public void setflop3N(int num){flop3.setNum(num);}
	public void setflop3S(int suit){flop3.setSuit(suit);}
	public void setturnN(int num){turn.setNum(num);}
	public void setturnS(int suit){turn.setSuit(suit);}
	public void setriverN(int num){river.setNum(num);}
	public void setriverS(int suit){river.setSuit(suit);}
	
	/*Precondition: Given a hand
	 */
	public double RoyalFlush(){
		return 0.0;
	}
	public double FourOfAKind(){
		return 0.0;
	}
	public static void main(String[] args) {
		

	}
}
