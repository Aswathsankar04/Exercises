import java.util.Scanner;
public class Sumarray {
    public static void main(String args[])
    {
       int[] arr=new int[5];
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter a Number:");
       arr[0]=scan.nextInt();
       System.out.print("Enter a Number:");
       arr[1]=scan.nextInt();
       System.out.print("Enter a Number:");
       arr[2]=scan.nextInt();
       System.out.print("Enter a Number:");
       arr[3]=scan.nextInt();
       System.out.print("Enter a Number:");
       arr[4]=scan.nextInt();
       int b=(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
       System.out.println("The Sum is:"+b);


    }
    
}
