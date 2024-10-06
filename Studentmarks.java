import java.util.Scanner;
class Studentmarks{
    public static void main(String args[])
    {
        Scanner asw=new Scanner(System.in);
        System.out.print("Enter the Mark in Tamil:");
        int a=asw.nextInt();
        System.out.print("Enter the Mark in English:");
        int b=asw.nextInt();
        System.out.print("Enter the Mark in Maths:");
        int c=asw.nextInt();
        System.out.print("Enter the Mark in Science:");
        int d=asw.nextInt();
        System.out.print("Enter the Mark in Social Science:");
        int e=asw.nextInt();
        int sum=a+b+c+d+e;
     
        System.out.println("The total marks is:"+sum+" /500");
        float average=sum/5;

        System.out.println("The Average is :"+ average);
        if(average<=35)
        {
            System.out.print("He/She is a Slow Learner.");
        }
        else if(average>=35 && average<=50)
        {
            System.out.print("More Focus On Your Studies.");
        }
        else if(average>=50 && average<=65)
        {
            System.out.print("Good");

        }
        else if (average>=65 && average<=80)
        {
            System.out.print("Very Good");
        }
        else if(average>=80 && average<=100)
        {
            System.out.print("Excellent");
        }
        else if (average>100)
        {
            System.out.print("Invalid");
        }
    }
}