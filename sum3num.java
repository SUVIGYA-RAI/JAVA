import java.util.Scanner;

public class sum3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt(); 
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter number 3: ");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("The sum of three numbers is: " + sum);
    }
}
