import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
     Scanner sc = new Scanner(System.in);
     
     System.out.println("================================");
     while(sc.hasNext()){
        String str = sc.next();
        int num = sc.nextInt();
        
        System.out.printf("%-15s%03d%n", str, num); 
     } 
     System.out.println("================================");
     sc.close();  
    }
}