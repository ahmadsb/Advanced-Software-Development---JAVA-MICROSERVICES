package bankSystem;

import java.sql.Timestamp;
import java.util.ArrayList;
// I made a singleton Logger class
public class Logger {
    private static ArrayList<Log> logs;
    private static Logger _instance;
    private String driverName;

    private Logger(String driverName) {
        this.driverName = driverName;
        logs = new ArrayList<>();
    }
    public static Logger getInstance(){
        if(_instance == null){
            return new Logger("DB");
        }

        return _instance;
    }

    public static void log(Log log){
        logs.add(log);
        System.out.println(log);
    }
    public static ArrayList<Log> getLogs() {
        return logs;
    }

    public static void logThisOperation(int id, float balance, String msg){
        Timestamp ts = new Timestamp(0);
        Log depositLog = new Log(id,ts.getTime(),balance,msg);
        Logger.log(depositLog);
    }
}
