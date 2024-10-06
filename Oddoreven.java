import java.util.Scanner;
public class Oddoreven {
    public static void main(String args[])
    {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=asw.nextInt();
        if(a%2==0)
        {
            System.out.print("The number is even");
        }
        else{
            System.out.print("The number is odd");
        }
    } 
    
}
