package pcalendar;

public class FormatDate {

    private static int day;
    private static int month;
    private static int year;
    private int dayId;


    /**
     * Konstruktor bazowy, który działa z formatem daty w kilku opcjach
     * @param day
     * @param month
     * @param year
     * @param dayId
     */
    public FormatDate(int day, int month, int year, int dayId) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dayId = dayId;
    }

    /**
     * Pakiet metod pobierania (gettery)
     * @return
     */

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDayId() {
        return dayId;
    }

    /**
     * Formaty daty używane do wprowadzania
     * @param strings
     * @return
     */
    public String defaultFormat(Words strings) {
        StringBuilder date = new StringBuilder();
        date.append(day).append("-").append(strings.getShMonths()[month - 1]).append("-").append(year);
        return date.toString();
    }
    /**
     * Formaty daty używane do wprowadzania
     * @param strings
     * @return
     */
    public java.lang.String longFormat(Words strings) {
        StringBuilder date = new StringBuilder();
        date.append(strings.getWeek()[dayId]).append(", ").append(day).append(" ").append(strings.getMonths()[month - 1]).append(" ").append(year).append("\n");
        return date.toString();
    }
    /**
     * Formaty daty używane do wprowadzania
     * @param strings
     * @return
     */
    public java.lang.String shortFormat(Words strings) {
        StringBuilder date = new StringBuilder();
        date.append(strings.getShWeek()[dayId]).append(" ").append(day).append(" ").append(strings.getShMonths()[month - 1]).append(" ").append(year).append("\n");
        return date.toString();
    }
    /**
     * Formaty daty używane do wprowadzania
     * @param strings
     * @return
     */
    public java.lang.String romFormat(Words strings) {
        StringBuilder date = new StringBuilder();
        date.append(day).append(".").append(strings.getMonthsRoman()[month - 1]).append(".").append(year).append("\n");
        return date.toString();
    }
    /**
     * Formaty daty używane do wprowadzania
     * @param strings
     * @return
     */
    public java.lang.String altFormat(Words strings) {
        StringBuilder date = new StringBuilder();
        date.append(day).append("/").append(strings.getShMonths()[month - 1]).append("/").append(year);
        return date.toString();
    }
}
