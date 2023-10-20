
import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String [] args){
        int num, i, count = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number -> ");
    num = s.nextInt();
    s.close();
    for(i=1; i<=num; i++){
   if(num%i==0)
       count++;
        
    }
    if(count == 2){
    System.out.println("It is a prime number");
    
}
    else{
    System.out.println("It is not a prime number");
}
    }
    
}
    