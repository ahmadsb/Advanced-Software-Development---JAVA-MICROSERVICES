package bankSystem;

public class PlatinumClient extends Client {
    public PlatinumClient(int id, String name, float balance) {
        super(id, name, balance, 0.1f,0.005f);//1%
    }



    @Override
    public String toString() {
        return "Platinum, ID= "+this.getId();
    }
}
