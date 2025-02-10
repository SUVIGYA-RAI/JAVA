import java.util.Scanner;
public class IsInteregr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        boolean a = sc.hasNextInt();
        if (a==true) System.out.println("Number is integer.");
        else System.out.println("Number is not an integer.");
    }
}
