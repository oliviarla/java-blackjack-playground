package blackjack.domain.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CardFactory {
    private final List<String> cardPool;

    public CardFactory() {
        this.cardPool = new ArrayList<>();
        makeCardPool();
    }

    private void makeCardPool() {
        List<String> figures = Arrays.asList("스페이드", "클로버", "하트", "다이아몬드");
        List<String> values = Arrays.asList("2","3","4","5","6","7","8","9","K","Q","J","A");
        for (String figure:figures) {
            for (String value:values) {
                this.cardPool.add(value+figure);
            }
        }
    }

    public Card createCard(){
        int index = new Random().nextInt(this.cardPool.size());
        String card = cardPool.get(index);
        return new Card(card);
    }
}
