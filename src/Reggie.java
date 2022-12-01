import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = "";
        String m = "";
        String menu = "";

        ssn = SafeInput.getRegExString(in, "Enter a Social Security Number", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You said the Social Security Number was " + ssn);
        m = SafeInput.getRegExString(in, "Enter your UC student M number", "(M|m)\\d{5}");
        System.out.println("You said your UC student M number is " + m);
        menu = SafeInput.getRegExString(in, "Choose a menu option[O for Open, S for Save, V for View, Q for Quit]", "[OoSsVvQq]");
        System.out.println("You chose " + menu);
    }

}
