
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void Start(){
        startTime = LocalTime.now();
    }

    public void Stop(){
        endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int miliSecond = (endTime.getHour() - startTime.getHour())*3600 + (endTime.getMinute() - startTime.getMinute())*60 + (endTime.getSecond() - startTime.getSecond())*1000;
        return miliSecond;
    }
}


