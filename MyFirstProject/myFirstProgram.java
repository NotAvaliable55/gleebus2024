import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.*; //import all the classes used from the Library
/**
 * This is my first APCS program :)
 *
 * @author (Shiv Setty)
 * @version (8-22-24)
 * myFirstProgram (Lab 2.8)
 */
public class myFirstProgram//class name must match the file name
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = 5; //hide and seek champ
        double number = 3.2;
        boolean choice = false;
        float numm = 7.386f;
        char letter = 'a'; //only time to use single quotes
        long y = 7;
        int z = 2;
        
        //class id    memory   
        String wordy = new String("Greeting planet"); //string is an object - NOT a basic data type
        Scanner keyboard = new Scanner(System.in);
        
        String name1 =new String("Shiv Setty");
        String name2 =new String("Gleeby");
        String name3 =new String("Glob");
        //Scanner has a few quirks
        System.out.println("Enter in 3 numbers \n separated by white space");
        System.out.println("and please enter you first name");
        x = keyboard.nextInt(); //read up to the white space
        y = keyboard.nextInt();
        z = keyboard.nextInt();
        keyboard.nextLine();//clears the input beffer of the \n
        name1 = keyboard.nextLine();
        System.out.println(x + " "+y+" "+z);
        System.out.println("Thank you "+name1);
        
        number = 5.789;
        //formatters classes/objects that help format output
        DecimalFormat fmt = new DecimalFormat("0.##"); //rounds to the nearest - will always print 2 decimal points
        DecimalFormat fmt2 = new DecimalFormat("0.00");//pads with 0s
        NumberFormat fmt3 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt4 = NumberFormat.getPercentInstance();
        
        System.out.println("Sub Total" + fmt.format(number));
        System.out.println("Sub Total" + fmt2.format(number));
        System.out.println("Sub Total" + fmt3.format(number));
        System.out.println("Sub Total" + fmt4.format(number));

        
        /**/
        System.out.println(name1 + "\t" + 16);
        System.out.println(name2 + "\t" + 70);
        System.out.println(name3 + "\t" + 428);
        //printf
        System.out.printf("%-15s %5d\n",name1,16);
        System.out.printf("%-15s %5d\n",name2,70);
        System.out.printf("%-15s %5.2f\n",name3,428.0);
        
        /*
        wordy = "This is a test this is only a test";
        //String is an object it has .method() - pg.78/79
        
        System.out.println(wordy.length());
        System.out.println(wordy.substring(4));
        System.out.println(wordy.substring(4,18)); //starts from 0, includes first, non-inclusive last number
        System.out.println(wordy.indexOf("i"));
        System.out.println(wordy.toUpperCase());
        
        /*
        //pg 88 in book
        String strAge;
        System.out.println("What is my age, again?");//love Blink182
        //strAge = keyboard.nextLine();
        //Integer Age = Integer.parseInt(strAge);//wrapper class (valueOf(strAge))
        //int age = Age;
        int age = keyboard.nextInt();//gives you an int
        
        System.out.print("In ten years you will be "+(age+10));
        
        /*
        //random numbers using a random object
        Random gen = new Random();
        x = gen.nextInt(100);//number between 0-99
        System.out.println("Random number 1: "+x);
        
        //generates a number between .000000000000001 and 1 non inclusive
        number = gen.nextDouble();
        System.out.println("Random number 2: "+number);
        
        //Change this number to 100 numbers in the range of 100-200
        //multiply by how many numbers you want, then add to push the range
        number = Math.random()*100 +100; 
        System.out.println("Random number 3: "+number);
        
        number = Math.random()*18 + 1;
        System.out.println("Random number 4: "+(int)number); //casting (int)
                
        
        
        final double COVERTFACTOR = (double)9/5;// makes the data type constant
        System.out.println(COVERTFACTOR);
        
        System.out.println("Enter Celcius temp");
        int cTemp = keyboard.nextInt();
        
        double fTemp = cTemp* COVERTFACTOR + 32;
        
        System.out.println("Fahrenheit is: "+fTemp);
        /**/
    }
}


