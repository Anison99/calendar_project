package pcalendar;

public class Words {

    /**
     * tablice String przechowujące nazwy dni i miesięcy oraz przypisane im numery
     */
    public java.lang.String[] Months = new java.lang.String[]{"January", "February", "February", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public java.lang.String[] ShMonths = new java.lang.String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public java.lang.String[] MonthsRoman = new java.lang.String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};
    public java.lang.String[] ShWeek = new java.lang.String[]{"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
    public java.lang.String[] Week = new java.lang.String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    /**
     * getter do nazw pełnych miesięcy
     * @return
     */
    public java.lang.String[] getMonths() {
        return Months;
    }

    /**
     * getter do nazw skroconych miesięcy
     * @return
     */
    public java.lang.String[] getShMonths() {
        return ShMonths;
    }

    /**
     * getter do numeracji miesięcy w zapisie rzymskim
     * @return
     */
    public java.lang.String[] getMonthsRoman() {
        return MonthsRoman;
    }

    /**
     * getter do nazw pełnych dni tygodnia
     * @return
     */
    public java.lang.String[] getWeek() {
        return Week;
    }

    /**
     * getter do nazw pełnych dni tygodnia
     * @return
     */
    public java.lang.String[] getShWeek(){
        return ShWeek;
    }
}
