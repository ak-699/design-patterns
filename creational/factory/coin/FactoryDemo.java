package creational.factory.coin;

public class FactoryDemo {
    public static void main(String[] args) {
        Coin gold = CoinFactory.getCoin(CoinType.GOLD_COIN);
        Coin copper = CoinFactory.getCoin(CoinType.COPPER_COIN);

        System.out.println(gold.getDescription());
        System.out.println(copper.getDescription());
    }
}
