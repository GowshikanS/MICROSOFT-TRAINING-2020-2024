public class GCD   
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in); 
  int x=sc.nextInt();
  int y=sc.nextInt();
for(int i = 1; i <= x && i <= y; i++)  
{  

if(x%i==0 && y%i==0)  

gcd = i;  
}  

System.out.printf("%d",gcd);  
}  
}  
