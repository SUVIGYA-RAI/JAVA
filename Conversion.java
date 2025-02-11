import java.util.Scanner;
public class Conversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double conversionfactor = 0.621371;
        double miles = km * conversionfactor;
        System.out.println(km + " Kilometers is equal to "+ miles + " miles.");
        sc.close();
    }
}
