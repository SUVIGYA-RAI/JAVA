import java.util.*;
public class GreaterOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = 60;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > a) {
            System.out.println("Number is greater than 60");
        }
        else if (num == 60) {
            System.out.println("Number equal to 60");
        }
        else {
            System.out.println("Number is less than 60");
        }
    }
}
