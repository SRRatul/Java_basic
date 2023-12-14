import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int i=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        i = s.nextInt();
        System.out.println("Your age is "+i);
        if(i < 18){
            System.out.println("You can't drive. ");
        }else {
            if (i < 75) {
                System.out.println("You can drive. ");
            }else {
                System.out.println("You are too old for driving");
            }
        }
    }
}