package bankSystem;
import java.sql.Timestamp;
public class Runner {
    private static void printClients( Client[] clients){
        for(Client c : clients){
            System.out.println(c);
        }
    }
    private static void initClientArray(Bank bank){


        RegularClient rc1 = new RegularClient(1,"Ahmad",0);
        RegularClient rc2 = new RegularClient(2,"Majed",0);
        RegularClient rc3 = new RegularClient(3,"Mahmoud",0);

        bank.addClient(rc1);
        bank.addClient(rc2);
        bank.addClient(rc3);

        GoldClient gc1 = new GoldClient(4,"Hamdi",0);
        GoldClient gc2 = new GoldClient(5,"Yosef",0);
        GoldClient gc3 = new GoldClient(6,"Mohammad",0);
        bank.addClient(gc1);
        bank.addClient(gc2);
        bank.addClient(gc3);


        PlatinumClient pc1 = new PlatinumClient(7,"Aya",0);
        PlatinumClient pc2 = new PlatinumClient(8,"Taima",0);
        PlatinumClient pc3 = new PlatinumClient(9,"Sara",0);
        bank.addClient(pc1);
        bank.addClient(pc2);
        bank.addClient(pc3);



    }
    public static void main(String [] args){
        Bank bank = Bank.getInstance();

        initClientArray(bank);
        Client client = bank.getClients()[0];
        System.out.println("======== [start first client] ========");
        System.out.println("======== create two account for first client first with 10K and second with 7K ========");
        System.out.println(client);
        client.addAccount(new Account(1,10_000.0f));
        client.addAccount(new Account(2,7_000.0f));
        System.out.println("======== deposit to first account 6K  --> 17K + 6K = 23K without commission========");
        client.deposit(1,6_000.0f);
        System.out.println("======== withdraw from first account 2K ========");
        client.withdraw(1,2_000.0f);

        System.out.println("======== [start second client] ========");
        Client client2 = bank.getClients()[1];
        System.out.println("======== create one account for second client 5K ========");
        System.out.println(client2);
        client2.addAccount(new Account(1,5_000.0f));
        bank.viewBalance();
        System.out.println("=== remove first client from bank ====");
        bank.removeClient(1);
        bank.viewBalance();

        System.out.println("===== view logs ======");
        bank.viewLogs();
    }
}
