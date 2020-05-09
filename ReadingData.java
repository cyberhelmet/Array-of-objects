import java.util.Scanner;

/**
 * Sensor Readings (6.1PP  Objects as Records)
 * 
 * @author Abhishek Tamang
 */

public class ReadingData{
    
    /** This method reads sensor's reading from the user
      * instantiates a new Reading object using those details
      * ensures there is a meaningful annotation provided (its length is at least 15) 
      * asks for the values to be re-entered if annotation's length gets less than 15
      * returns that object to the calling code in main()
      **/

        
        public static void reading(Scanner sc){
            Scanner input = new Scanner(System.in);
        String annotation;//String variable name for sensors
        int readingId;//reading identification number of the sensors
        double value;//reading value of the sensor
        
            System.out.println("Enter the the sensor's name whose value you want to find:"); 
            annotation = sc.next();//Taking user's choice of String input for the annotation variable
            if(annotation.length()>15){

      
        System.out.println("Enter the reading id of the sensor?");
        readingId = input.nextInt();//Taking user's choice of integer input for the readingId variable
        System.out.println("Enter the Value of the sensor?");
        value = input.nextDouble();//Taking user's choice of  input for the value variable
            };
        
    } 
}
