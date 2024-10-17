package days;

/**
 * This class uses an enum as input to print the name of the day.
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
    public void nameOfDay(Days.WeekdaysEnum code)
    {
        switch (code)
        {
            case ONE:
                System.out.println("Monday");
                break;
            case TWO:
                System.out.println("Tuesday");
                break;
            case THREE:
                System.out.println("Wednesday");
                break;
            case FOUR:
                System.out.println("Thursday");
                break;
            case FIVE:
                System.out.println("Friday");
                break;
            case SIX:
                System.out.println("Saturday");
                break;
            case SEVEN:
                System.out.println("Sunday");
                break;
        }
    }
}
