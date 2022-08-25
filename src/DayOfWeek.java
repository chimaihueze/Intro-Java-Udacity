/*Assume the int variable dayOfWeek has some value, and that it follows this rule:
1 = Monday
2 = Tuesday
3 = Wednesday
4 = Thursday
5 = Friday
6 = Saturday
7 = Sunday
Declare a String variable called schedule and write a switch statement that gives schedule
a different value based on the day of the week. For Monday, give it the value “Gym in the
morning.” For Tuesday give it the value “Class after work.” For Wednesday, give it the value
“Meetings all day.” For Thursday give it the value “Work from home.” For Friday, give it
the value “Game night after work.” For Saturday and Sunday, give it the value “Free!” This
should also be the default value.
OR (optional): decide what to assign schedule for each day based on your own weekly
schedule!*/

public class DayOfWeek {
    public static void main(String[] args) {

        int day = 6;

        switch (day) {
            case 1:
                System.out.println("Gym in the Morning.");
                break;

            case 2:
                System.out.println("Class after work.");
                break;

            case 3:
                System.out.println("Meetings all day.");
                break;

            case 4:
                System.out.println("Work from home.");
                break;

            case 5:
                System.out.println("Game night after work.");
                break;

            case 6: case 7:
                System.out.println("Free!");
                break;

            default:
                System.out.println("wrong Day");
        }
    }
}
