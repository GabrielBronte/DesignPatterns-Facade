public class Contract extends Status{
    private static Contract contract = new Contract();

    private Contract(){};

    public static Contract getInstancia() {
        return contract;
    }
}