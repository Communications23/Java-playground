import java.time.LocalTime;

public class RealSecondsInADay {
    public static void main(String[] args) {
        int secondsTotal = 24 * 60 * 60;
        int currentHours = LocalTime.now().getHour();
        int currentMinutes = LocalTime.now().getMinute();
        int currentSeconds = LocalTime.now().getSecond();

        int secondsElapsed = currentSeconds + (currentMinutes * 60) + (currentHours * 3600);
        int secondsRemain = secondsTotal - secondsElapsed;

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        System.out.println("Seconds Elapsed: " + secondsElapsed + " out of " + secondsTotal);
        System.out.println("Seconds Remaining: " + secondsRemain);
    }
}