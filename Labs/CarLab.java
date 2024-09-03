package Labs;
import java.util.Scanner;
import java.text.*;

/**
 * Write a description of class CarLab here.
 *
 * Shiv and Tai
 * @version (a version number or a date)
 */
public class CarLab
{
    public static void main(String[] args)
    {
    //track how many miles driven are from work and for personal use
    Scanner scan = new Scanner(System.in);
    Scanner keyboard = new Scanner(System.in);
    
    
    double distance = 10; //standard 1 way distance between home and work
    System.out.println("What is the total number of days this period?");
    int dSpent = keyboard.nextInt(); //time spent driving
    
    System.out.println("What is your beginning mileage?");
    int bMiles = keyboard.nextInt(); //beginning mileage
    
    System.out.println("What is your final mileage?");
    int fMiles = keyboard.nextInt(); //final mileage
    
    System.out.println("How many work days this period?");
    int workD = keyboard.nextInt(); //number of workdays
    
    int totMiles = (fMiles - bMiles);
    //System.out.println(workD/dSpent);
    double wMiles = totMiles*((double)workD/dSpent);
    double pMiles = totMiles - wMiles;
    System.out.println("Total miles: "+totMiles);
    System.out.println("Work miles: "+wMiles);
    System.out.println("Personal miles: "+pMiles);
    NumberFormat fmt = NumberFormat.getPercentInstance();
    //System.out.println(wMiles/totMiles);
    System.out.println("Work Percentage: "+ fmt.format((wMiles/totMiles)));
    System.out.println("Personal Percentage: "+fmt.format((pMiles/totMiles)));
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
