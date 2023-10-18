import java.util.Scanner;
public class Sum_2num {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("The sum is ");
        System.out.println(sum);

    }
}
