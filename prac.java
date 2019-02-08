
import java.util.Scanner;

public class prac{

public static void main(String[] args)
{
    	int daysInMonth;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
daysInMonth = input.nextInt();
System.out.println("You entered " + daysInMonth);
       
    	
   if(daysInMonth == 30) {
 System.out.println("Month is April, June, September, or November");
} else if(daysInMonth == 31) {
 System.out.println(
 "Month is January, March, May, July, August, October, or December");
} else if(daysInMonth == 28 || daysInMonth == 29) {
 System.out.println("Month is February.");
} else {
 assert false;
}
    
 }
}