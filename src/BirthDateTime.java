import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month;
        int day = 0;
        int hours = 0;
        int minutes = 0;
        int numDays = 0;


        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2010);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        switch (month){
            case 1: case 3: case 5: case 7: case 9: case 11:
                numDays = 31;
                break;
            case 2:
                numDays = 29;
                break;
            case 4: case 6: case 8: case 10: case 12:
                numDays = 30;
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
        day = SafeInput.getRangedInt(in, "Enter your birth DAY", 1, numDays);
        hours = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);
        System.out.println("\n You said you were born in " + year +" on month " + month + " on the day of the " + day);
        System.out.println("You also said you were born on the " + hours + " hour and the " + minutes + " minute(s)");



    }
}
