import java.util.Scanner;

public class getUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZerolength(in, "Enter your first name");
        lastName = SafeInput.getNonZerolength(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
