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
	Card turn = new Card(12,4);
	Card river;
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
	public Card getCard(int num) {
		return Cardlist.get(num);
	}
	public int getSize() {
		return Cardlist.size();
	}
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
