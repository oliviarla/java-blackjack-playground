package blackjack.domain.person;

import blackjack.domain.card.CardFactory;
import blackjack.domain.card.Cards;

public abstract class Person {
    protected static final int MAX_NUM = 21;
    protected final Cards cards = new Cards();
    private Status status = Status.PROCESSING;

    protected int getTotal() {
        return cards.getTotal();
    }

    public void changeStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
    public void initCards(CardFactory cardFactory) throws Exception {
        cards.getMoreCard(cardFactory);
        cards.getMoreCard(cardFactory);
    }

    public void getMoreCard(CardFactory cardFactory) throws Exception {
        cards.getMoreCard(cardFactory);
    }

    public abstract boolean needMoreCard();

    public abstract String getAllCards();
}
