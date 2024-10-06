import java.util.Scanner;
class forloopstring{
    public static void main(String args [] ) 
    {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter a String:");
        String A=asw.nextLine();
        for(int i=1;i<=10;i++)
        {
            System.out.println(A);
        }
    }
}