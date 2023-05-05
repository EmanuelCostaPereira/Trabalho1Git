import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class 2139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            int month = Integer.parseInt(input[0]);
            int day = Integer.parseInt(input[1]);

            LocalDate christmas = LocalDate.of(2016, Month.DECEMBER, 25);
            LocalDate date = LocalDate.of(2016, month, day);
            long daysLeft = ChronoUnit.DAYS.between(date, christmas);

            if (date.isEqual(christmas)) {
                System.out.println("E natal!");
            } else if (date.isEqual(christmas.minusDays(1))) {
                System.out.println("E vespera de natal!");
            } else if (daysLeft < 0) {
                System.out.println("Ja passou!");
            } else {
                System.out.println("Faltam " + daysLeft + " dias para o natal!");
            }
        }

        scanner.close();
    }
}