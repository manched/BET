
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
	
	//MUTATORS
	public void setFirstCard(Card a){
		firstCard.setNum(a.getNum());
		firstCard.setSuit(a.getSuit());
	}
	
	public void setSecondCard(Card b){
		secondCard.setNum(b.getNum());
		secondCard.setSuit(b.getSuit());
	}
}
