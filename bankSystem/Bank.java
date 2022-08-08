package bankSystem;



public class Bank {

    private Client[] clients;
    private Logger logService ;
    private static float totalCommission;

    // make a Singleton Bank class
    private static Bank _instance;
    public static synchronized Bank getInstance(){
        if(_instance == null){
            _instance = new Bank();
        }
        return _instance;
    }
    private Bank() {
        this.clients = new Client[100];
        totalCommission = 0;
    }

    // end - singleton


    public static void updateTotalCommission(float totalCommission){
        Bank.totalCommission = totalCommission;
    }
    public static float getTotalCommission(){
        return Bank.totalCommission;
    }
    public void printClientList(){
        for (int i = 0 ; i < this.clients.length; ++i){
            if(this.clients[i] != null)
                System.out.println("index: "+i+", "+this.clients[i]);
        }
    }
    public float getBalance(){
        float sum =0;
        for(int i = 0 ;i < this.clients.length;++i){
            sum+= this.clients[i].getFortune();
        }
        return sum;
    }
    public void addClient(Client client){
        int index = this.getFirstFreeIndexInArrayOfClient();
        if(-1 == index){
            System.out.println("The capacity of client is full, can't add more");
            return ;
        }
        this.clients[index] = client;
        Logger.logThisOperation(this.clients[index].getId(),this.clients[index].getFortune(), LogMessageIFC.ADD_CLIENT);
    }
    public void viewBalance(){
        double balance =0.0;
        for (Client client:this.clients) {
            if(client!=null)
            balance+= client.getTotalAccountsBalance();
        }
        System.out.println("Balance of Bank: "+balance);
    }
    public void removeClient(int id){
        Client client = this.getClientById(id);

        if(null == client){
            System.err.println("Error, there is no a client with this id: " + id);
            return;
        }
        for(int i =0 ;i < this.clients.length; ++i){
            if(this.clients[i].equals(client)){
                this.clients[i] = null;
                break;
            }
        }
        Logger.logThisOperation(client.getId(),client.getFortune(), LogMessageIFC.REMOVE_CLIENT);
    }

    public Client[] getClients() {
        return clients;
    }
    public void viewLogs(){
        for(Log log : Logger.getLogs()){
            System.out.println(log);
        }
    }

    // AUX. Methods
    private Client getClientById(int idClient){
        for (Client client: this.getClients()) {
            if(client.getId() ==  idClient){
                return client;
            }
        }
        return null;
    }
    private int getFirstFreeIndexInArrayOfClient(){
        for(int i =0 ;i < this.clients.length;++i){
            if(this.clients[i] == null){
                return i;
            }
        }
        return -1;
    }

}
