package blackjack.domain.person;

import blackjack.domain.card.Cards;

public abstract class Person {
    private static final int MAX_NUM = 21;
    private static Cards cards;

    protected int getTotal() {
        return cards.getTotal();
    }

    public void getMoreCard() {
        cards.getMoreCard();
    }

    public Boolean exceedMAX() {
        return this.getTotal() > MAX_NUM;
    }


}
