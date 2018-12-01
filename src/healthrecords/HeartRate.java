package healthrecords;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public HeartRate(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void HeartRateCal() {

        int years = 2017 - getYear();
        System.out.printf("Hello %s %s, you are %d years old%n", getFirstName(), getLastName(), years);
        System.out.printf("Your maximum heart rate beats per minute is %d%n", 220 - years);
        System.out.printf("Your target heart rate ranges between %.2f and %.2f beats per minute%n", (220 - years) * 0.5, (220 - years) * 0.85);

    }

}
