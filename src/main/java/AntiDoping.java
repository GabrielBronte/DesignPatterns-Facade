public class AntiDoping extends Status{
    private static AntiDoping antiDoping = new AntiDoping();

    private AntiDoping(){};

    public static AntiDoping getInstancia() {
        return antiDoping;
    }
}