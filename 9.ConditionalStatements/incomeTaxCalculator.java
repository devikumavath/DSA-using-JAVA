import java.util.Scanner;

public class incomeTaxCalculator {
    public static void main(String[] args) {
         
    Scanner obj = new Scanner(System.in);
    int income = obj.nextInt();
    int tax;
    int month;
      
       if (income < 500000) {
          tax = 0;
          month = tax/12;
         
       }
       else if(income >= 500000 && income <= 1000000){
            tax = (int)  (0.2*income);
            month = tax/12;

           
       }
       else 
       {
        tax =  (int) (0.3*income);
        month = tax/12;
    }
    
    System.out.println(tax + " tax  PA");
    System.out.println(month + " tax PM");





      obj.close();
    }
    
}
