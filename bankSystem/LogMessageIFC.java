package bankSystem;

public interface LogMessageIFC {
    static final String ADD_CLIENT = "client added";
    static final String REMOVE_CLIENT = "client removed";
    static final String DEPOSIT_CLIENT = "client balance updated – deposit";
    static final String WITHDRAW_CLIENT = "client balance updated – withdraw";
    static final String CLOSED_ACCOUNT = "account update – closed";
    static final String OPENED_ACCOUNT = "account update – opened";
    static final String BANK_AUTO_ACCOUNT_INTEREST = "bank auto account interest update";
}
