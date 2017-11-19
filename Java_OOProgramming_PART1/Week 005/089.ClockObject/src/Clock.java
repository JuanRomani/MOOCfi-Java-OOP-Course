public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        seconds = new BoundedCounter(59);
        seconds.setValue(secondsAtBeginning);

        minutes = new BoundedCounter(59);
        minutes.setValue(minutesAtBeginning);

        hours = new BoundedCounter(23);
        hours.setValue(hoursAtBeginning);

    }
    
    public void tick() {
        // Clock advances by one second
        seconds.next();

        if(seconds.getValue() == 0){
            minutes.next();
            if(minutes.getValue() == 00){
                hours.next();
            }
        }
    }
    
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
