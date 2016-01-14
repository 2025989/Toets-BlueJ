/**
 * A Date to be used as a birthDate for a Student object.
 */
public class Date {
    
    private int day;
    private int month;
    private int year;
    
    /**
     * Constuctor for objects of class Date.
     * @param day Day of the month.
     * @param month Month.
     * @param year Year.
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    /**
     * Override toString() for Date class.
     */
    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }
    
    
    //*** Getters and Setters ***//
    
    /**
     * Get the day of the Date object.
     * @return The day of the Date object.
     */
    public int getDay() {
        return day;
    }
    
    /**
     * Set the day of the Date object.
     * @param The day of the Date object.
     */
    public void setDay(int day) {
        this.day = day;
    }
    
    /**
     * Get the month of the Date object.
     * @return The month of the Date object.
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * Set the month of the Date object.
     * @param The month of the Date object.
     */
    public void setMonth(int month) {
        this.month = month;
    }
    
    /**
     * Get the year of the Date object.
     * @return The year of the Date object.
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Set the year of the Date object.
     * @param The year of the Date object.
     */
    public void setYear(int year) {
        this.year = year;
    }
    
}