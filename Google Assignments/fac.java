import java.util.Scanner;
   public class Factorial {
      public static void main(String args[]){
         int i, factorial=1, number;
         Scanner sc = new Scanner(System.in);
         number = sc.nextInt();

         for(i = 1; i<=number; i++) {
            factorial = factorial * i;
         }
         System.out.println(factorial);
      }
   }
