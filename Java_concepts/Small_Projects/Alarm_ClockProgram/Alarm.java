package Small_Projects.Alarm_ClockProgram;

// The Toolkit class in Java belongs to the Abstract Window Toolkit (AWT) package and provides access to native GUI resources of your operating system (OS)

import java.awt.*;
import java.time.LocalTime;

public class Alarm implements Runnable{

    private final LocalTime alarmTime; // LocalTime alarmTime comes form AlarmClock.java

    Alarm(LocalTime alarmTime){  // constructor
        this.alarmTime = alarmTime;
    }

    @Override
    public void run() {

        System.out.println("Waiting for the alarm time...");

        while(LocalTime.now().isBefore(alarmTime)){
            try {

                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
//                int hours = LocalTime.now().getHour();
//                int minutes = LocalTime.now().getMinute();
//                int seconds = LocalTime.now().getSecond();

                System.out.print("\r"+now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
            }
            catch (InterruptedException e) {
                System.out.println("Problem! Shit...");
            }
        }
        System.out.println("⏰ Wake up! It's " + alarmTime);

        Toolkit.getDefaultToolkit().beep(); // class in java*
    }
}
