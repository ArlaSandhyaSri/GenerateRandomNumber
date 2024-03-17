import java.lang.Math;
import java.util.Scanner;
public class RandomNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        double a = Math.random()*(max-min+1)+min;

        //Not defining boundaries
        System.out.println("1st random number is "+Math.random()); //Using random() Method
        System.out.println("2nd random number is "+Math.random()); // numbers will change for every tym of random() method calling
        System.out.println("3rd random number is "+Math.random());

        //Defining boundaries

        System.out.println("Random Number in between "+min +" and " + max + " = "+a);


    }
    
}
