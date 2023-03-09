import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        double n2 = sc.nextDouble();
        
        sc.nextLine(); // consume the newline character left by nextDouble()
        String n3 = sc.nextLine();
        
        System.out.println("String: "+n3);
        System.out.println("Double: "+n2);
        System.out.println("Int: "+n1);
        
        sc.close(); //to free up resources.
    }
}