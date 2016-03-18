import java.util.Scanner;

/**
 * Created by Roberto on 22/02/2016.
 */
public class TimeConversion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String time = in.next();
        String result;
        String[] timeString = time.split(":");

        if(timeString[2].contains("PM")){
            timeString[2] = timeString[2].replace("PM", "");

            int hour = Integer.parseInt(timeString[0]);
            hour += 12;
            if (hour == 24) {
                result = "12:" + timeString[1] + ":" + timeString[2];
            } else {
                result = hour + ":" + timeString[1] + ":" + timeString[2];
            }

        } else if (timeString[2].contains("AM")) {
            timeString[2] = timeString[2].replace("AM", "");

            if (timeString[0].equals("12")) {
                timeString[0] = "00";
            }
            result = timeString[0] + ":" + timeString[1] + ":" + timeString[2];
        } else {
            result = "Error syntax";
        }

        System.out.println(result);
    }
}
