

public class Search {

    
    public static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        return cards;
    }

  

    //Linear Search
    public static int search(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

   

    /**
     * Demonstrates how to call the search methods.
     */
    public static void main(String[] args) {
        Card[] cards = makeDeck();
        Card aceOfClubs = new Card(1, 0);
        Card twoOfClubs = new Card(2, 0);
        Card threeOfClubs = new Card(3, 0);
       

        System.out.println("Linear search");
        System.out.println("The ace of clubs is at position "+ search(cards, aceOfClubs)+ " in the cards array");
        System.out.println("The two of clubs is at position "+ search(cards, twoOfClubs)+ " in the cards array");
        System.out.println("The three of clubs is at position "+ search(cards, threeOfClubs)+ " in the cards array");
       
      
    }

}