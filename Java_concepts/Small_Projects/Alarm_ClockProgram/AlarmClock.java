package Small_Projects.Alarm_ClockProgram;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime alarmTime = null;

        while(alarmTime == null) {
            try {
                System.out.print("Enter an alarm time: ");
                String inputTime = sc.nextLine();

                alarmTime = LocalTime.parse(inputTime, dateTimeFormatter);

                System.out.println("alarm set for: " + alarmTime);
            } catch (DateTimeException e) {
                System.out.print("Invalid Format . Format should be inn HH:mm:ss ");
            }
        }

        Alarm a = new Alarm(alarmTime);
        Thread alarmThread = new Thread(a);

        alarmThread.start();

        sc.close();
    }
}
