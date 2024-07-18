import java.util.Scanner;

public class AveragingMarks {
    
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        double maths, kiswahili, english, socialstudies, science, total, average;
        System.out.println("enter math");
        maths=scn.nextDouble();
         System.out.println("enter kiswahili");
        kiswahili=scn.nextDouble();
         System.out.println("enter english");
        english=scn.nextDouble();
         System.out.println("enter socialstudies");
        socialstudies=scn.nextDouble();
         System.out.println("enter science");
        science=scn.nextDouble();
        total=maths+kiswahili+english+socialstudies+science;
        average=total/5;
         System.out.println("your total is:"+total);
         System.out.println("your average is"+average);
         if(average<30){
             System.out.println("you have E");
         }else if(average<50){
             System.out.println("your grade is D");
         }else if(average<62){
             System.out.println("your grade is C");
         }else if(average<75){
             System.out.println("your grade is B");
         }else{
             System.out.println("you have grade A");
             
             
             
         }
        
    } 
}
    


        