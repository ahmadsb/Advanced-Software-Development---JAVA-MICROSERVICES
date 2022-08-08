package bankSystem;
import java.util.Date;

public class Log {
    private int clientId;
    private long timeStamp;
    private float amount;
    private String description;

    public Log(int clientId, long timeStamp, float amount, String description) {
        this.clientId = clientId;
        this.timeStamp = timeStamp;
        this.amount = amount;
        this.description = description;
    }

    public String toString() {
        return "Log{" +
                "timeStamp=" + timeStamp +
                ", clientId=" +  clientId +
                ", description='" + description +
                ", amount=" + amount + '\'' +
                '}';
    }
}
