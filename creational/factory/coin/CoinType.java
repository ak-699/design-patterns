package creational.factory.coin;

import java.util.function.Supplier;

public enum CoinType {
    GOLD_COIN(GoldCoin::new),
    COPPER_COIN(CopperCoin::new);

    private Supplier<Coin> constructor;

    CoinType(Supplier<Coin> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Coin> getConstructor() {
        return constructor;
    }

}
