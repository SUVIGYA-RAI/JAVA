public class Enumcode {
    public static void main (String[] args){
        enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
        Days today = Days.TUESDAY;
        System.out.println(today);


        switch (today) {
            case MONDAY :
            System.out.println("Start of the week");
            break;
            case FRIDAY :
            System.out.println("Weekend is coming !");
            break;
            default:
            System.out.println("Midweek day");
        }
    }
}
