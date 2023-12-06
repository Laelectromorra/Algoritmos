import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate fNacimiento = LocalDate.of(1997, Month.AUGUST, 11);
        System.out.println("Has vivido " + ChronoUnit.DAYS.between(fNacimiento, LocalDate.now())+ " días");
    }
}