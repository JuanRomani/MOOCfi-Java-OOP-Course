
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean earlier(MyDate compared) {
        if (year < compared.year) {
            return true;
        }

        if (year == compared.year && month < compared.month) {
            return true;
        }

        if (year == compared.year && month == compared.month
                && day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        if (day < 30){
            day++;
        } else {
            day = 01;
            if (month < 12){
                month++;
            } else {
                month = 01;
                year++;
            }
        }
    }

    public void advance(int numberOfDays){
        while (0 < numberOfDays){
            advance();
            numberOfDays--;
        }
    }

    public MyDate afterNumberOfDays(int days){
        MyDate newDate = new MyDate(day, month, year);

        newDate.advance(days);

        return newDate;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }

}