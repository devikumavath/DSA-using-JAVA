import java.util.Scanner;

public class costWithGST {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


        System.out.println("enter the price of pen");
        float pen = obj.nextFloat();
        System.out.println("enter the price of pencil");
        float pencil = obj.nextFloat();
        System.out.println("enter the price eraser");
        float eraser = obj.nextFloat();

        float total = pen+pencil+eraser;

        System.out.println("bill " + total);

        float tax = total+(0.8f*total); 

        System.out.println("bill with gst " + (tax));
        obj.close();
    }
    
}
