
package calendar;

import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNo = input.nextInt();
        System.out.println("Enter year");
        int year = input.nextInt();
        
        if(monthNo ==1){
            System.out.println("January " + year + " has 31 days");
        }
        else if(monthNo ==2){
            if(year%4==0){
                System.out.println("February " + year + " has 29 days");
            }else{
             System.out.println("February " + year + " has 28 days");   
            }
        }
       if(monthNo ==3){
            System.out.println("March " + year + " has 31 days");     
        }
       if(monthNo ==4){
            System.out.println("April " + year + " has 31 days");
    
    }
       if(monthNo ==5){
            System.out.println("May " + year + " has 30 days");
       }
       if(monthNo ==6){
            System.out.println("June " + year + " has 30 days");
       }
       if(monthNo ==7){
            System.out.println("July " + year + " has 31 days");
       }
       if(monthNo ==8){
            System.out.println("August " + year + " has 31 days");
       }
       if(monthNo ==9){
            System.out.println("September " + year + " has 30 days");
       }
       if(monthNo ==10){
            System.out.println("October " + year + " has 31 days");
       }
       if(monthNo ==11){
            System.out.println("November " + year + " has 30 days");
       }
       if(monthNo ==12){
            System.out.println("December " + year + " has 31 days");
       }
       
}
}