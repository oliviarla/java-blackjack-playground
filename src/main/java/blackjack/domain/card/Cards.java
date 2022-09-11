package blackjack.domain.card;

import java.util.List;

public class Cards {
    private CardFactory cardFactory;
    private static List<Card> cardList;

    public String getAllCards() {
        return cardList.toString();
    }

    public void getMoreCard() {
        cardList.add(cardFactory.createCard());
    }

    public int getAceValue() {
        //total 값이 10 이하이면 A=11, 10 이상이면 A=1
        return 0;
    }

    public int getTotal(){
        return 0;
    }
}
