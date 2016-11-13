/**
 * Created by tauno on 13.11.2016.
 */
import java.util.Scanner;
public class Seconds {
    public static void main(String[] args){
        int seconds, hours, minutes;
        Scanner input = new Scanner(System.in);
        // user input
        System.out.println("Input a total numbers of seconds: ");
        seconds = input.nextInt();
        System.out.printf("Entered %d seconds", seconds);
        System.out.printf("\n Converted to  : \n");
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        System.out.printf("%d hours, %d minutes, %d seconds", hours, minutes, seconds);

    }
}
