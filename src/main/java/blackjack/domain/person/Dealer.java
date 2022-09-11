package blackjack.domain.person;

public class Dealer extends Person{
    private static int income;

    public Boolean match(Player player){
        return this.getTotal() > player.getTotal();
    }
}
