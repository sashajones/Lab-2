package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	// datatype<What the list is made of> The name of the ArrayList 
	public Deck()
	{
		//for (i=1; i<=52; i++) {
		//}
		//	This method will do a for/each, returning each rank in the enum.
	
		for (eRank Rank : eRank.values()) {
			for (eSuit Suit : eSuit.values()){
				if (Rank != eRank.JOKER && Suit!= eSuit.JOKER){
					//System.out.println(Rank+":"+ Suit);
					Card c = new Card(Rank,Suit);
					DeckCards.add(c);
				}

			}
		}
	}
	
	public Card DrawCard()
	{
		
		return DeckCards.remove(0);
	}
}
