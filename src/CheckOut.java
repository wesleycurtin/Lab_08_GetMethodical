import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double total = 0;
        boolean finish = true;

            do {
                itemPrice = SafeInput.getRangedDouble(in, "Enter price of an item: ", 0.50, 9.99);
                total += itemPrice;

                finish = SafeInput.getYNConfirm(in, "Do you have another item?");
            }while(finish);

        System.out.printf("Your total cost for the items is $" + total);














}



}
