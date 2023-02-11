import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Worker {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    String name;
    boolean isBoss = false;
    Timestamp startedWorkAt;


    public Worker (String name) {
        this.name = name;
    }

    public void promote () {
        this.isBoss = true;
    }

    public void isWorking () {
        System.out.println(this.name + " is still working");
    }

    public void startWork () {
        Timestamp workStart = getTime();
        System.out.println(this.name + " started work at " + sdf.format(workStart));
        this.startedWorkAt = workStart;
    }

    public Timestamp getTime () {
        Timestamp timeNow = new Timestamp(System.currentTimeMillis());
        return timeNow;
    }

}
