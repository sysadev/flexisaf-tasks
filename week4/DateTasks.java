import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class DateTasks {

    public static void main(String[] args) {
        System.out.println("--- Month Lengths for 2026 ---");
        printMonthLengths(2026);

        System.out.println("\n--- Mondays in February (Current Year) ---");
        listMondays(Month.FEBRUARY);

        System.out.println("\n--- Friday the 13th Test ---");
        LocalDate date1 = LocalDate.of(2026, 2, 13);
        LocalDate date2 = LocalDate.of(2026, 3, 13); // Friday
        System.out.println(date1 + " is Friday the 13th? " + isFridayThe13th(date1));
        System.out.println(date2 + " is Friday the 13th? " + isFridayThe13th(date2));
    }

    public static void printMonthLengths(int year) {
        for (int month = 1; month <= 12; month++) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.println(ym.getMonth() + ": " + ym.lengthOfMonth() + " days");
        }
    }

    public static void listMondays(Month month) {
        int currentYear = Year.now().getValue();
        LocalDate date = LocalDate.of(currentYear, month, 1);

        while (date.getMonth() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
    }

    public static boolean isFridayThe13th(LocalDate date) {
        return date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}
