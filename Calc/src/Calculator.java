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
	Card[] ActiveCards = {Userhand.getFirstCard(), Userhand.getSecondCard(), flop1, flop2, flop3, turn, river};
	
	//All of the cards:
	Card AS = new Card(1,1);
	Card IIS = new Card(2,1);
	Card IIIS = new Card(3,1);
	Card IVS = new Card(4,1);
	Card VS = new Card(5,1);
	Card VIS = new Card(6,1);
	Card VIIS = new Card(7,1);
	Card VIIIS = new Card(8,1);
	Card IXS = new Card(9,1);
	Card XS = new Card(10,1);
	Card JS = new Card(11,1);
	Card QS = new Card(12,1);
	Card KS = new Card(13,1);
	Card AC = new Card(1,2);
	Card IIC = new Card(2,2);
	Card IIIC = new Card(3,2);
	Card IVC = new Card(4,2);
	Card VC = new Card(5,2);
	Card VIC = new Card(6,2);
	Card VIIC = new Card(7,2);
	Card VIIIC = new Card(8,2);
	Card IXC = new Card(9,2);
	Card XC = new Card(10,2);
	Card JC = new Card(11,2);
	Card QC = new Card(12,2);
	Card KC = new Card(13,2);
	Card AD = new Card(1,3);
	Card IID = new Card(2,3);
	Card IIID = new Card(3,3);
	Card IVD = new Card(4,3);
	Card VD = new Card(5,3);
	Card VID = new Card(6,3);
	Card VIID = new Card(7,3);
	Card VIIID = new Card(8,3);
	Card IXD = new Card(9,3);
	Card XD = new Card(10,3);
	Card JD = new Card(11,3);
	Card QD = new Card(12,3);
	Card KD = new Card(13,3);
	Card AH = new Card(1,4);
	Card IIH = new Card(2,4);
	Card IIIH = new Card(3,4);
	Card IVH = new Card(4,4);
	Card VH = new Card(5,4);
	Card VIH = new Card(6,4);
	Card VIIH = new Card(7,4);
	Card VIIIH = new Card(8,4);
	Card IXH = new Card(9,4);
	Card XH = new Card(10,4);
	Card JH = new Card(11,4);
	Card QH = new Card(12,4);
	Card KH = new Card(13,4);
	
	ArrayList<Card> PossCard = new ArrayList<Card>();
	
	Card[] forRoyalFlush = {AS, AC, AD, AH, XS, XC, XD, XH, JS, JC, JD, JH, QS, QC, QD, QH, KS, KC, KD, KH};
	
	
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
	
	//puts cards in order
	public Card[] orderCards() {
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<6; j++) {
				if(ActiveCards[j].getNum()<ActiveCards[j+1].getNum()) {
					Card TempStore = new Card(ActiveCards[j].getNum(), ActiveCards[j].getSuit());
					ActiveCards[j].setNum(ActiveCards[j+1].getNum());
					ActiveCards[j].setSuit(ActiveCards[j+1].getSuit());
					ActiveCards[j+1].setNum(TempStore.getNum());
					ActiveCards[j+1].setSuit(TempStore.getSuit());
				}
					
			}
		}
		System.out.println(ActiveCards[0].getNum()+" "+ActiveCards[1].getNum()+" "+ActiveCards[2].getNum()+" "+ActiveCards[3].getNum()+" "+ActiveCards[4].getNum()+" "+ActiveCards[5].getNum()+" "+ActiveCards[6].getNum());
		return ActiveCards;
	}
	
	//Asks if placed cards have the parameter
	public boolean anyPlaced(int search) {
		if(flop1.getNum()==search || flop2.getNum()==search || flop3.getNum()==search || turn.getNum()==search || river.getNum()==search)
			return true;
		return false;
	}
	
	public boolean anyPlaced(int search, int suit) {
		if((flop1.getNum()==search && flop1.getSuit()==suit) || (flop2.getNum()==search && flop2.getSuit()==suit) || (flop3.getNum()==search && flop3.getSuit()==suit) || (turn.getNum()==search && turn.getSuit()==suit) || (river.getNum()==search && river.getSuit()==suit))
				return true;
		return false;
	}
	
	public boolean anyInHand(int search) {
		if(Userhand.getFirstCard().getNum()==search || Userhand.getSecondCard().getNum()==search)
			return true;
		return false;
	}
	
	public boolean anyInHand(int search, int suit) {
		if((Userhand.getFirstCard().getNum()==search && Userhand.getFirstCard().getSuit()==suit) || (Userhand.getSecondCard().getNum()==search && Userhand.getSecondCard().getSuit()==suit))
			return true;
		return false;
	}
	
	public boolean anyActive(int search) {
		if(anyInHand(search) || anyPlaced(search))
			return true;
		return false;
	}
	
	public boolean anyActive(int search, int suit) {
		if(anyInHand(search, suit) || anyPlaced(search, suit))
			return true;
		return false;
	}
	
	public int mostPlacedSuit() {
		int numS=0, numC=0, numD=0, numH=0;
		for(int i=2; i<7; i++) {
			if(ActiveCards[i].getSuit()==1)
				numS++;
			if(ActiveCards[i].getSuit()==2)
				numC++;
			if(ActiveCards[i].getSuit()==3)
				numD++;
			if(ActiveCards[i].getSuit()==4)
				numH++;
		}
		if(numS>numC && numS>numD && numS>numH)
			return 1;
		if(numC>numS && numC>numD && numC>numH)
			return 2;
		if(numD>numS && numD>numC && numD>numH)
			return 3;
		if(numH>numS && numH>numC && numH>numD)
			return 4;
		return 0;
	}
	
	
	
	public int mostActiveSuit() {
		int numS=0, numC=0, numD=0, numH=0;
		for(int i=0; i<7; i++) {
			if(ActiveCards[i].getSuit()==1)
				numS++;
			if(ActiveCards[i].getSuit()==2)
				numC++;
			if(ActiveCards[i].getSuit()==3)
				numD++;
			if(ActiveCards[i].getSuit()==4)
				numH++;
		}
		if(numS>numC && numS>numD && numS>numH)
			return 1;
		if(numC>numS && numC>numD && numC>numH)
			return 2;
		if(numD>numS && numD>numC && numD>numH)
			return 3;
		if(numH>numS && numH>numC && numH>numD)
			return 4;
		return 0;
	}
	
	public int numSuit(int suit) {
		int num=0;
		for(int i=0; i<7; i++) {
			if(ActiveCards[i].getSuit()==suit)
				num++;
		}
		return num;
	}

	public ArrayList<Card> MissingCard(Card[] StartingNeeded, int suitNeeded) {
		PossCard.clear();
		for(int i=StartingNeeded.length-1; i>=0; i--) {
			if(suitNeeded!=0) {
				if(suitNeeded==StartingNeeded[i].getSuit()) {
					PossCard.add(StartingNeeded[i]);
				}
			}
			if(suitNeeded==0) {
				PossCard.add(StartingNeeded[i]);
			}
		}
		
		for(int i=PossCard.size()-1; i>=0; i--) {
			if(anyActive(PossCard.get(i).getNum(),PossCard.get(i).getSuit())) {
				PossCard.remove(i);
			}
		}
		
		
		return PossCard;
	}
	
	
	
	//Makes a list of all of the possible cards to give the other player each rank
	//public 
	
	//Tests for ranking
	public boolean isRoyalFlush() {
		Card[] OrderedActives = orderCards();
		if(OrderedActives[0].getNum()==13) {
			if(anyPlaced(13) && anyPlaced(12) && anyPlaced(11) && anyPlaced(10) && anyPlaced(1)) //This means that the royal flush was placed-it applies to both players, so it's nullified
				return false;
			if((anyActive(13,1) && anyActive(12,1) && anyActive(11,1) && anyActive(10,1) && anyActive(1,1)) || (anyActive(13,2) && anyActive(12,2) && anyActive(11,2) && anyActive(10,2) && anyActive(1,2)) || (anyActive(13,3) && anyActive(12,3) && anyActive(11,3) && anyActive(10,3) && anyActive(1,3)) || anyActive(13,4) && anyActive(12,4) && anyActive(11,4) && anyActive(10,4) && anyActive(1,4))
				return true;
			}
		else
			return false;
		return false;
	}
	
	
	
	
	
	public double RoyalFlush(){
		if(numSuit(mostPlacedSuit())>=3) {
			ArrayList<Card> RFNeeded = MissingCard(forRoyalFlush, mostPlacedSuit());
			System.out.println(RFNeeded.get(0).getNum());
			if(RFNeeded.size()>2) {
				System.out.println("0.0%");
				return 0.0;
			}
			else {
				System.out.println("RF: "+RFNeeded.size()/990.0+"%");
				return RFNeeded.size()/990.0;
			}
		}
		
		
		return 0.0;
	}
	public double FourOfAKind(){
		return 0.0;
	}
	public double HighCard() {
		
		
		
		return 0.0;
	}
	public static void main(String[] args) {
		

	}
}
