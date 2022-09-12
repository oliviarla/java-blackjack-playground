package blackjack.domain.person;

public class Player extends Person{
    private final String name;
    private final Integer betAmount;

    public String getName() {
        return name;
    }

    public Player(String name, Integer betAmount) {
        super();
        this.name = name;
        this.betAmount = betAmount;
    }

    @Override
    public boolean needMoreCard() {
        return this.getTotal()<21;
    }

    @Override
    public String getAllCards(){
        return this.name+"카드: "+cards.getAllCards();
    }

    public Boolean isWin(Dealer dealer){
        if(dealer.getStatus()==Status.LOSE) {
            this.changeStatus(Status.WIN);
            return true;
        }
        if(this.getTotal()>21) {
            this.changeStatus(Status.LOSE);
            return false;
        }
        return this.getTotal() > dealer.getTotal();
    }
}
