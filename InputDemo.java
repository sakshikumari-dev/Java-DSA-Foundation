import java.util.*;

//Enter cost of 3items from the user(using float datatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : try adding 18% gst tax to the items in the bill as an advanced problem.git statsu



public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of a pencil :");
        float pencilPrice= sc.nextFloat();
        System.out.print("Enter the price of a pen :");
        float penPrice= sc.nextFloat();
        System.out.print("Enter the price of an eraser :");
        float eraserPrice= sc.nextFloat();

        float totalCost = (pencilPrice + penPrice + eraserPrice);
        System.out.println("Bill of three items are: "+ totalCost);

        // adding 18% gst to the bill

        float newTotalCost = totalCost +(0.18f * totalCost );
        System.out.println(newTotalCost);

    }
}
