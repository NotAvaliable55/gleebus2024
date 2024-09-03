package Labs;
import java.util.Scanner;
import java.text.*;

/**
 * Write a description of class CoinLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoinLab
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double q = 0.25;
        double d = 0.1;
        double n = 0.05;
        double p = 0.01;
        
        System.out.println("Number of Quarters: ");
        int quarter = keyboard.nextInt();
        System.out.println("Number of dimes: ");
        int dime = keyboard.nextInt();
        System.out.println("Number of nickels: ");
        int nickel = keyboard.nextInt();
        System.out.println("Number of pennies: ");
        int penny = keyboard.nextInt();
        
        double qcents = q*(quarter);
        double dcents = d*(dime);
        double ncents = n*(nickel);
        double pcents = p*(penny);
        
        double totCents = qcents+dcents+ncents+pcents;
        NumberFormat fromat = NumberFormat.getCurrencyInstance();
        
        System.out.println("You have "+fromat.format(totCents)+" cents!");
        
    }
}
