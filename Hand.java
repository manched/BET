
public class Hand {
	//Card values for the hand
	private Card firstCard, secondCard;
	
	//CONSTRUCTORS
	public Hand(Card a, Card b){
		firstCard=a;
		secondCard=b;
	}
	
	//ACCESSORS
	public Card getFirstCard(){
		return firstCard;
	}
	
	public Card getSecondCard(){
		return secondCard;
	}
	
}
