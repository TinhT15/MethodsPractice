
/**
 * Write a description of class Methods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Methods
{
    static void getMax() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        int myNumber1 = myObj.nextInt();
        int myNumber2 = myObj.nextInt();
        int myMax = Math.max(myNumber1,myNumber2);
        System.out.println("Max is: " + myMax);
    }
    
    static void getMin() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        int myNumber1 = myObj.nextInt();
        int myNumber2 = myObj.nextInt();
        int myMin = Math.min(myNumber1,myNumber2);
        System.out.println("Min is: " + myMin);
    }
    
    static void getSqrt() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input a number that has a square root: ");
        double myNumber = myObj.nextInt();
        double mySqrt = Math.sqrt(myNumber);
        System.out.println("Sqrt is: " + mySqrt);
    }
    
    static void getAbs() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input a negative or a positive number: ");
        int myNumber = myObj.nextInt();
        System.out.println("Abs is: " + Math.abs(myNumber));
    }
    
    static void getXpY() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input x and y values for x to the power of y: ");
        double x = myObj.nextDouble();
        double y = myObj.nextDouble();
        System.out.println("X to the power of Y is: " + Math.pow(x,y));
    }
        
    public static void main(String[] args){
        System.out.println("\u000C");
        Scanner myObj = new Scanner(System.in);
        
        boolean quit = false;
                 
        while (quit == false)
        {
            System.out.println("Input: 1(max), 2(min), 3(sqrt), 4(abs), 5(random), 6(pow), or 0 to quit: ");
            int myChoice = myObj.nextInt();
            
            switch (myChoice) {
            case 0:
                quit = true;
                break;
            case 1:
                getMax();
                break;
            case 2:
                getMin();
                break;
            case 3:
                getSqrt();
                break;
            case 4:
                getAbs();
                break;
            case 5:
                System.out.println("Random number is: " + Math.random());
                break;
            case 6:
                getXpY();
                break;
            default:
                System.out.println("Invalid entry");
            }
        }
    }
}
