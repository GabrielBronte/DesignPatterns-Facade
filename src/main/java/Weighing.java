public class Weighing extends Status{
    private static Weighing weighing = new Weighing();

    private Weighing(){};

    public static Weighing getInstancia() {
        return weighing;
    }
}