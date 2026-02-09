public class MyBirthday {
    public static void main(String[] args) {
        int currentDay = Integer.parseInt(args[0]);
        int currentDate = Integer.parseInt(args[1]);
        int myBirthdayDate = Integer.parseInt(args[2]);

        final int DAYS_A_WEEK = 7;

        // 1. calc number of days from current date to birthday
        int daysToBirthday = (myBirthdayDate - currentDate);

        // 2. use this along with the current weekday to find when the birthday falls
        int birthdayDay = (daysToBirthday + currentDay) % 7;
        System.out.println("Birthday falls on: " + birthdayDay);

    }
}
