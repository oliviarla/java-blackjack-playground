package blackjack.domain.person;

public class Dealer extends Person{
    private static int income;

    public Dealer() {
        super();
    }

    @Override
    public boolean needMoreCard() {
        return this.getTotal() <= 16;
    }

    @Override
    public String getAllCards() {
        return "딜러 카드: "+cards.getAllCards();
    }

    public boolean exceedMAX() {
        if(this.getTotal() > MAX_NUM){
            this.changeStatus(Status.LOSE);
            return true;
        }
        return false;
    }
}
