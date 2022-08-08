package bankSystem;

import java.util.Objects;


public abstract class Client {
    private int id;
    private String name;
    private Account[] accounts;
    protected final float commissionRate;
    protected final float interestRate;
    private Logger logger;

    @Override
    public abstract String toString();


    public Client(int id, String name, float balance, float commissionRate, float interestRate) {
        this.id = id;
        this.name = name;

        this.commissionRate = commissionRate;
        this.interestRate = interestRate;
        accounts = new Account[5];
        logger = Logger.getInstance();
    }

    public void addAccount(Account account){
        if(this.isExists(account)){
            System.err.println("Error, the account is already found");
            return ;
        }
        int index = getFirstFreeIndexInArrayOfAccount();
        if(-1 == index){
            System.err.println("Sorry, can't add account the capacity of account is full");
            return ;
        }

        this.accounts[index] = account;

        Logger.logThisOperation(this.getId(),this.getFortune(), LogMessageIFC.OPENED_ACCOUNT);

    }
    public void removeAccount(int id){
        Account account = this.getAccount(id);
        if(!this.isExists(account)){
            System.err.println("Error, there is no an account with this id: "+id);
            return;
        }


        // move balance of account to balance of client
//        float clientBalance = this.getBalance();
//        clientBalance-= account.getBalance();
//        this.setBalance(clientBalance);// the money is moved to client's balance

        for(int i= 0 ; i < this.accounts.length;++i){
            if(this.accounts[i]!=null && this.accounts[i].equals(account)){
                this.accounts[i] =  null;
            }
        }

        Logger.logThisOperation(this.getId(),this.getFortune(), LogMessageIFC.CLOSED_ACCOUNT);
//        System.out.println("Successfully, account of client has closed");
    }
    public Account getAccount(int id){

        for(int i = 0; i < this.accounts.length ;++i){
            if(this.accounts[i]!=null && this.accounts[i].getId() == id){
                return this.accounts[i];
            }
        }
        return null;
    }
    // deposit & withdraw methods
    public void deposit(int idAccount,float amount) {
        Account account = getAccount(idAccount);

        float commissionValue = amount*this.commissionRate;
        float newActualAmount = amount - commissionValue;

        Bank.updateTotalCommission(Bank.getTotalCommission()+commissionValue);
        //old balance + new amount after take the commission rate
//        this.setBalance(this.getBalance()+newActualAmount);
        account.setBalance(account.getBalance()+newActualAmount);
        Logger.logThisOperation(getId(),this.getFortune(), LogMessageIFC.DEPOSIT_CLIENT);

    }
    public void withdraw(int idAccount,float amount){
        Account account = getAccount(idAccount);
        float commissionValue = amount*this.commissionRate;
        float newActualAmount = amount +commissionValue;

        Bank.updateTotalCommission(Bank.getTotalCommission()+commissionValue);

        float currBalance = account.getBalance() - newActualAmount;
        if(currBalance >= 0){
            account.setBalance(currBalance);
//            this.setBalance(currBalance);
            Logger.logThisOperation(getId(),this.getFortune(), LogMessageIFC.WITHDRAW_CLIENT);
        }else{
            System.out.println("can't withdraw");
        }
    }

    // method will be invoked once a day by a background thread - in near future
    public void autoUpdateAccounts(){
        for(int i =0 ;i < this.accounts.length;++i){
            float currBalanceAccount =  accounts[i].getBalance();
            float percent = this.interestRate + 1;// e.g 1 + 0.03 = 1.03
            currBalanceAccount*=percent;
            accounts[i].setBalance(currBalanceAccount);
        }

        Logger.logThisOperation(this.getId(),this.getFortune(), LogMessageIFC.BANK_AUTO_ACCOUNT_INTEREST);
    }
    public float getFortune(){
        float fortune = 0;
//        fortune+= this.getBalance() + this.getTotalAccountsBalance();
        fortune+= this.getTotalAccountsBalance() ;

        return fortune;
    }
    // ============= getter and setter methods =============
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Account[] getAccounts() {
        return accounts;
    }
    //============= equals and hashCode methods =============
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getId() == client.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    // ============= AUX. Methods =================
    public float getTotalAccountsBalance(){
        float sum = 0;

        for (Account account : this.getAccounts())
        {
            if(account != null)
            sum += account.getBalance();
        }
        return sum;
    }
    private int getFirstFreeIndexInArrayOfAccount(){
        for(int i=0 ; i < this.accounts.length; ++i){
            if(this.accounts[i] == null){
                return i;
            }
        }

        return -1;
    }
    private boolean isExists(Account account){
        if(account==null) return false;
        for(Account a: this.accounts){
            if(account.equals(a)){
                return true;
            }
        }
        return false;
    }


}
