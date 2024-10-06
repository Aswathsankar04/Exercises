import java.util.Scanner;

 class eligibleforscholar {
    public static void main(String  args [])
     {
        Scanner asw=new Scanner(System.in);
        int A=asw.nextInt();
        if(A<=7000)
        {
            System.out.print("You Are Eligilbe For Scholar.");

        }
        else{
            System.out.print("You Are Not Eligible For Scholar.");
        }
    }
    
}
