//Challenge 97 : Enum with a method
package generics16.challenge97;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n", day, day.getType());
        }
    }
}