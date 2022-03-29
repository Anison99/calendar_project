package pcalendar;

import java.io.FileNotFoundException;

public class Date implements java.lang.Comparable<Date>{

    private int day, month, year, dayId, operator;
    private java.lang.String date;
    BasicData base;

    /**
     *  Główne konstruktory, które używają elementów BasicData do budowania i analizowania (parse) opcji int
     * @throws FileNotFoundException
     */
    public Date() throws FileNotFoundException {
        base = new BasicData();
        this.day = base.getBasicDay();
        this.month = base.getBasicMonth();
        this.year = base.getBasicYear();
        this.dayId = base.getDayNumber();
    }
    public Date(int day,int month,int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dayId = 0;
    }

    /**
     * konstruktor dla klasy
     * @param dayt
     * @param montht
     * @param yeart
     * @param dayidt
     */
    public Date(int dayt, int montht, int yeart, int dayidt) {
        this.day = dayt;
        this.month = montht;
        this.year = yeart;
        this.dayId = dayidt;
    }

    /**
     * metoda obliczająca miesiące dla innych klas
     * @param month
     * @return
     */
    public static int parseMonthIfOutOfRange(int month) {
        if (month < 12) {
            return month;
        } else {
            while (month > 12) {
                month -= 12;
            }
            return month;
        }
    }


    /**
     * Metoda, która przechowuje dni w miesiącu i dni przestępne dla lutego roku przestępnego
     * @param month
     * @param year
     * @return
     */
    public static int getDayCountInMonth(int month, int year) {
        month = parseMonthIfOutOfRange(month);
        int daysInFeb = 28;
        if (isLapYear(year)) {
            daysInFeb = 29;
        }
        int[] daysInMonth = {31, daysInFeb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[(month -1)];
    }


    /**
     * metoda dodająca dni obecnie używana by dodać 7 dni
     */
    public void moveWeek (){
        int daysInMonth = getDayCountInMonth(month,year);
        int reaminingDays = 6;
        if(dayId+reaminingDays<7){
            dayId+=reaminingDays;
        }else{
            dayId= 6 - reaminingDays;
        }
        while(reaminingDays > 0 ){
            if(this.day+reaminingDays>=daysInMonth){
                reaminingDays-=daysInMonth - this.dayId+2;
                this.day=1;
                this.month+=1;
                if(this.month>12){
                    this.month = 1;
                    this.year+=1;
                }
            }else{
                this.day += reaminingDays ;
                reaminingDays=0;
                datePrinter();
            }
        }
    }


    /**
     * metoda odejmująca dni obecnie używana by dodać 7 dni
     */
    public void removeWeek (){
        int reaminingDays = 6;
        if(dayId-reaminingDays>=0){
            dayId-=reaminingDays;
        }else{
            dayId= 7 - (reaminingDays-dayId);
        }
        while(reaminingDays > 0 ){
            if(this.day-reaminingDays<=0){
                this.month-=1;
                reaminingDays-=this.day;
                this.day= getDayCountInMonth(this.month,this.year);
                if(this.month<0){
                    this.month = 12;
                    this.year-=1;
                }
            }else{
                this.day -= reaminingDays;
                reaminingDays=0;
                datePrinter();
            }
        }
    }


    /**
     * sprawdzenie czy rok jest przestępny
     * @param year
     * @return
     */
    public static boolean isLapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * gettery i settery do powyższych metod
     * @param operator
     */
    public void setOperator(int operator) {
        this.operator = operator;
    }

    /**
     *
     * @return
     */
    public int getDay() {
        return day;
    }

    /**
     *
     * @return
     */
    public int getMonth() {
        return month;
    }

    /**
     *
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     *
     * @return
     */
    public int getDayId() {
        return dayId;
    }

    /**
     * toString pozostawiona dla testu
     * @return
     */
    @Override
    public java.lang.String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }


    /**
     * Metoda, która działa na switch do wybierania żądanego formatu daty
     * @return
     */

    public java.lang.String dateFormator() {
        Words words = new Words();
        FormatDate formatDate = new FormatDate(this.day, this.month, this.year, this.dayId);
        switch (operator) {
            case 1:
                return date = formatDate.longFormat(words);
            case 2:
                return date = formatDate.shortFormat(words);
            case 3:
                return date = formatDate.romFormat(words);
            case 4:
                return date = formatDate.altFormat(words);
            default:
                return date = formatDate.defaultFormat(words);
        }
    }


    /**
     * wyswietlenie daty według wybranego formatu
     * @return
     */
    public String datePrinter(){
        dateFormator();
        return date;
    }


    /**
     * @return
     * @return
     */
    public Boolean isSmallerThan( Date o ) {
        if( year > o.getYear()) {
            return true;
        } else if( year < o.getYear()) {
            return false;
        } else if( month > o.getMonth()) {
            return true;
        } else if( month < o.getMonth()) {
            return false;
        } else return day < o.getDay();
    }

    /**
     *
     * @param o
     * @return
     */
    public int compareTo(Date o) {
        if(isSmallerThan(o)) {
            return 1;
        }else {return -1;}
    }



/* // DLA TESTU
    public Date add(Date date,int days){
        int daysInMonth = getDayCountInMonth(month,year);
        int reaminingDays = 7;
        if(dayId+reaminingDays<6){
            dayId+=reaminingDays;
        }else{
            dayId= 6 - reaminingDays;
        }
        while(reaminingDays > 0 ){
            if(this.day+reaminingDays>=daysInMonth){
                reaminingDays-=daysInMonth - this.dayId+2;
                this.day=1;
                this.month+=1;
                if(this.month>12){
                    this.month = 1;
                    this.year+=1;
                }
            }else{
                this.day += reaminingDays ;
                reaminingDays=0;
                datePrinter();
            }
        }
        return new Date( days, month, year,dayId);
    }
    public Date rem(Date date, int day){
        int reaminingDays = 7;
        if(dayId-reaminingDays>=0){
            dayId-=reaminingDays;
        }else{
            dayId= 7 - (reaminingDays-dayId);
        }
        while(reaminingDays > 0 ){
            if(this.day-reaminingDays<=0){
                this.month-=1;
                reaminingDays-=this.day;
                this.day= getDayCountInMonth(this.month,this.year);
                if(this.month<0){
                    this.month = 12;
                    this.year-=1;
                }
            }else{
                this.day -= reaminingDays;
                reaminingDays=0;
                datePrinter();
            }
        }
        return new Date( day, month, year,dayId);
    }
    public static final Date RefDate = new Date(2, 1, 1950,4);
    public static int getDayNumberFromRefDate( Date calendarDate ) {
        int daySum = 0;
        if( calendarDate.isSmallerThan(RefDate)) {
            while( !calendarDate.equals(RefDate) ) {
                calendarDate = RefDate.add(calendarDate, 1);
                daySum++;
            }
        } else {
            while( !calendarDate.equals(RefDate) ) {
                calendarDate = RefDate.rem(calendarDate, -1);
                daySum++;
            }
        }
        return daySum;
    }

 */
}
