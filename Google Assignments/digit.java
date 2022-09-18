import java.util.*;
import java.io.*;
 
class main {
 
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
 
        
        String string_number = Integer.toString(number);
 
       
        for (int i = 0; i < string_number.length(); i++) {
 
            
            System.out.println(string_number.charAt(i));
        }
    }
}
