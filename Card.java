
public class Card {
	private int cardNum;
	private int Suit;
	
	//CONSTRUCTOR
	public Card(int num, int su){
		cardNum=num;
		Suit=su;
	}
	
	//ACCESSORS
	public int getNum(){
		return cardNum;
	}
	
	public int getSuit(){
		return Suit;
	}
	
	//MUTATORS
	public void setNum(int newNum){
		cardNum=newNum;
	}
	public void setSuit(int newSuit){
		Suit=newSuit;
	}
}
