import java.io.*;
import java.util.*;

class Card implements Comparable{
	int value;
	char suit;
	
	Card (int v, char s) {
		value = v;
		suit = s;
	}
	
	Card (String s) {
		char t = s.charAt(0);
		
		// Value assignment
		if (t >= '2' && t <= '9') {
			value = t - '0';
		}
		else {
			if (t == 'T')
				value = 10;
			else if (t == 'J')
				value = 11;
			else if (t == 'Q')
				value = 12;
			else if (t == 'K')
				value = 13;
			else if (t == 'A')
				value = 14;
		}
		
		// Suit assignment
		suit = s.charAt(1);
	}
	
	public int compareTo(Object c) {
		Card card = (Card)c;
		if (card.value > value)
			return -1;
		else if (card.value < value)
			return 1;
		else
			return 0;
	}
}

class Hand {
	Card[] cards;
	int rank;
	
	Hand(Card[] c) {
		System.arraycopy(c, 0, cards, 0, 5);
		Arrays.sort(cards);
		rank = 0;
	}
	
	/*
		High Card: 1
		One Pair: 2
		Two Pairs: 3
		Three of a Kind: 4
		Straight: 5
		Flush: 6
		Full House: 7
		Four of a Kind: 8
		Straight Flush: 9
		Royal Flush: 10
	*/
	public int getRank() {
	
		// Straight and Flush
		boolean straight = true;
		boolean flush = true;
		for (int i = 0; i < 4; i++) {
			if (cards[i].value != cards[i + 1].value - 1)
				straight = false;
			if (cards[i].suit != cards[i + 1].suit)
				flush = false
		}
		
		// Royal
		boolean royal = false;
		if (straight && flush) {
			if (cards[0].value == 10)
				royal = true;
		}
		
		// Four of a kind
		boolean fk = false;
		if (cards[1].value == cards[2].value && cards[2].value == cards[3].value) {
			if (cards[0].value == cards[1].value || cards[3].value == cards[4].value)
				fk = true;
		}
		
		// Full house
		boolean fh = false;
		
		
		return rank;
	}
}

class Prob054 {
	public static void main (String args[]) {
	}
}