package com.mycompany.primenumber;
import java.util.Scanner;
/**
 *
 * @salvir.rahman.ratul@gmail.com
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       int initial, stop, i, j;
    
       System.out.print("Enter two Numbers: ");
       initial = s.nextInt();
       stop = s.nextInt();
       for(i=initial; i<=stop; i++){
           for(j=2; j<=i; j++){
               if(i%j==0)
                   break;
           }//first loop end
           if(i==j){
           System.out.print(j + " ");
       }
       }//final loop
       
    }
}
