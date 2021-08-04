public class CoinFactory {
    public CoinFactory() {
    }

    public static Coin getCoinInstance(Coins coin) {
        return switch (coin) {
            case ILS -> new ILS();
            case USD -> new USD();
        };


    }
}
