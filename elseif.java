import java.util.Scanner;
class elseif{
    public static void main(String args[])

    { 
        System.out.print("Enter a number:");
        Scanner asw=new Scanner(System.in);
        int a=asw.nextInt();


        if(a<=34)
        {
             System.out.print("Nothing bro");
        }
       
        
        else if(a>=35 && a<=60)
        {
            System.out.print("VideoGame");
        }
      else  if(a>=60 && a<=90)
        {
            System.out.print("Iphone");
        }
       else if(a>90 && a<=100)
        {
            System.out.print("Mac Book");
        }
       else if(a>=101)
        {
            System.out.print("Invalid");
        }      

        

    
    }
    
}