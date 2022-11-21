import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double total = 0;
        boolean done = false;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter price of an item: ", 0.50, 9.99);
            total += itemPrice;
            boolean another = SafeInput.getYNConfirm(in,"Do you have another item?");
            if(another = false)
                done = true;


        }while (!done);












}



}
