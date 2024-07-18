import java.util.Scanner;

public class addition {
     public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       int num1,num2,total;
       System.out.println("Enter the frst number");
       num1=scn.nextInt();
       System.out.println("Enter the second number");
       num2=scn.nextInt();
       total=num1+num2;
       System.out.println("the total is:"+total);
    }

}
