import java.io.*;
import java.util.*;

public class Reverse_string {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        for(int  i =0; i<A.length(); i++){
            B = A.charAt(i) + B;
        }
        if(A.equals(B)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
