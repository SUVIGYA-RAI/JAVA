import java.util.Scanner;
public class greet {
    public static void main(String[] args) {
        System.out.println("What is your name ?");
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day !");
    }
}
