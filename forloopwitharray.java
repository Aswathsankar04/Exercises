import java.util.Scanner;
class forloopwitharray{
    public static void main(String args[])
    {
        Scanner asw=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter a Numbers:");
        for(int i=0;i<=4;i++)
        {
            a[i]=asw.nextInt();

        }
        System.out.println("The array is:"+a[0]);
        System.out.println("The array is:"+a[1]);
        System.out.println("The array is:"+a[2]);
        System.out.println("The array is:"+a[3]);
        System.out.print("The array is:"+a[4]);

    }
    
}