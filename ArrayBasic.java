import java.util.*;
public class ArrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Taking array input 
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++){
            int val = sc.nextInt();
            a[i] = val;
        }
        sc.close();


        // Printis each sequential element in array a
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
