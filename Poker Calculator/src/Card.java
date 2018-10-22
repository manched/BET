
public class Card {
	private char cardNum;
	private String Suit;
	
	//CONSTRUCTOR
	public Card(char num, String su){
		cardNum=num;
		Suit=su;
	}
	
	//ACCESSORS
	public char getNum(){
		return cardNum;
	}
	
	public String getSuit(){
		return Suit;
	}
}
