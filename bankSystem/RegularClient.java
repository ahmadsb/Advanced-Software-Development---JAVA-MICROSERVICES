package bankSystem;

public class RegularClient extends Client{

    public RegularClient(int id, String name, float balance) {
        super(id, name, balance, 0.03f, 0.001f);//3%
    }



    @Override
    public String toString() {
        return "Regular, ID= "+this.getId();
    }
}
