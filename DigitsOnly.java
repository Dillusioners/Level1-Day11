/*
 * Author - Debag101
 * Purpose - Checking if a string contains only digits
 * Date - 3.5.23
 */

//Importing required classes from package IO
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Method holding class
public class DigitsOnly {
    
    //The main method
    public static void main(String[] args)throws IOException {
        //Creating buffer object to get input
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        try{
            //Putting input in try catch
            System.out.println(">> Enter the number !");
            //Inputting string
            String num = rd.readLine();
            //Traversing through string
            for(int i=0; i < num.length(); i++)
            {
                //Getting char at ith index
                char dig = num.charAt(i);
                //Parsing char at ith index to integer
                Integer.parseInt(dig + "");
            }
        }
        catch(Exception e)
        {
            //If we catch the exception it means number doesn't contain only digits
            System.out.println(">> Number doesn't contain only digits! ");
            System.exit(0);
        }
        //If exception isn't caught it means number contains only digits
        System.out.println(">> Number contains only digits !");
    }
}
