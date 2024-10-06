import java.util.Scanner;
class Electricitybill{
    public static void main(String args[])
    {
      { 
        
        System.out.print("Enter The Customer Name:");
        Scanner asw=new Scanner(System.in);
        String name=asw.nextLine();
        
            System.out.print("Enter The Customer Id:");
            
            int num1=asw.nextInt();

        
        
            System.out.print("Enter The Mobile Number:");
            Long num2=asw.nextLong();
        
            System.out.print("Enter The Present Readings:");
            int pre=asw.nextInt(); 
        
        
            System.out.print("Enter The Previous Reading:");
            int prev =asw.nextInt();
           

        
        
            int L=pre-prev;
           
        
    
        
            System.out.println("-------------Customer Details-----------");

            System.out.println("Customer Name:"+name);
            System.out.println("Customer Id:"+num1);
            System.out.println("Mobile Number:"+num2);
            System.out.println("-------------Customer Details-----------");
            System.out.println("Present Readings:"+pre);
            System.out.println("Previous Readings:"+prev);
            System.out.println("-------------Customer Details-----------");
            System.out.println("Total Units Consumed;"+L);
            System.out.println("Total Amount is:"+L*4.50);
            System.out.println("----------------------------------------");

      }
    }
}
       


    

