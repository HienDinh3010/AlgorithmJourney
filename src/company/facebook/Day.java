package company.facebook;

public enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String dayName;

    // Constructor
    private Day(String dayName) {
        this.dayName = dayName;
    }


//    // Method to get the day name
//    public String getDayName() {
//        return dayName;
//    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.dayName);
        }
    }
}
