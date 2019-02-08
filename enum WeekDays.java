public enum WeekDays
{ sun, mon, tues, wed, thurs, fri, sat }

public class Test
{
 public static void main(String args[])
 {
  WeekDays wk; //wk is an enumeration variable of type WeekDays
  wk = WeekDays.sun; //wk can be assigned only the constants defined under enum type Weekdays
  System.out.println("Today is "+wk);
 }
}