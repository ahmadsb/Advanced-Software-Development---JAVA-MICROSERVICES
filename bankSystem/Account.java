package bankSystem;

import java.util.Objects;

public class Account {
    private int id;
    private float balance;
    private Logger logger;

    public Account(int id, float balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
        Logger.logThisOperation(this.getId(),this.balance, LogMessageIFC.BANK_AUTO_ACCOUNT_INTEREST);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getId() == account.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
