/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"hearts", "diamonds"};
		int[] pointValues = {11, 12, 13};
		
		Deck d = new Deck(ranks, suits, pointValues);
		d.deal();
		System.out.println(d);
		
		String[] r = {"5", "6", "7"};
		String[] s = {"spades", "diamonds", "hearts"};
		int[] p = {5, 6, 7};
		
		Deck a = new Deck(r, s, p);
		System.out.println(a);
		
		String[] ra = {"5", "6", "7"};
		String[] su = {"spades", "diamonds"};
		int[] po = {5, 6, 7};
		
		Deck b = new Deck(ra, su, po);
		b.deal();
		b.deal();
		System.out.println(b);
	}
}
