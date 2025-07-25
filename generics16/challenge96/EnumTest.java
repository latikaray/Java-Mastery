//Challenge 96 : Use of Enum in Java
package generics16.challenge96;

public class EnumTest {
     public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
        // System.out.println(Day.MONDAY);
        // System.out.println(Day.TUESDAY);
        // System.out.println(Day.WEDNESDAY);
        // System.out.println(Day.THURSDAY);
        // System.out.println(Day.FRIDAY);
        // System.out.println(Day.SATURDAY);
        // System.out.println(Day.SUNDAY);
        
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
