public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public boolean earlier(MyDate compared) {
        if (year < compared.year) {
            return true;
        }

        if (this.year == compared.year && month < compared.month) {
            return true;
        }

        if (year == compared.year && month == compared.month
                && day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate){
        int daysDiff = 0;
        int monthDiff = 0;
        int yearsDiff = 0;

        daysDiff = day - comparedDate.day; // diferencia en dias
        monthDiff = month - comparedDate.month; // diferencia en meses
        yearsDiff = year - comparedDate.year; // diferencia en años

        daysDiff += monthDiff * 30; // pasar meses a dias
        daysDiff += yearsDiff * 365; // pasar años a dias

        daysDiff /= 365; // todos los dias juntos a años

        if(daysDiff < 0){
            daysDiff *= -1;
        }

        return daysDiff;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }

}
