package bankSystem;

public class GoldClient extends Client{


    @Override
    public String toString() {
        return "Gold, ID= "+this.getId();
    }

    public GoldClient(int id, String name, float balance) {
        super(id, name, balance, 0.02f,0.003f);//2%
    }



}
