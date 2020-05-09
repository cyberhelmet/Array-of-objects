import java.util.Scanner;
import java.util.Arrays;
public class MainProgram{
    
    
 
    public static ReadingData addBulk(Scanner sc, ReadingData[] data, int Capacity){

    
    }
    public static void printAll(Scanner sc,ReadingData[] data,int numReadings){
        for(int i=0;i<numReadings;i++){
           System.out.println(data[i]);
      }
   }
    
    public static int  addReadingData( Scanner sc,int count,ReadingData[] data){
        System.out.println("Enter the new object that you want to add?");
       
       if(count<data.length)
    {
        data[count]= new reading(sc).ReadingData;
       
       count = count + 1;
       return count;
        }else{
            System.out.println("No more space available to add a new object.");
        }
             return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Capacity = 50;//maximum no. of objects the array can hold.
        ReadingData[] data = new ReadingData[Capacity];//declaring array of Readingdata objects.
        int count = 0;//To keep the count of how many objects are already in the array.
        String choice = null;// To know whether the user wants to continue or quit the program.
        int numReadings = 0;//To let choose the user how many values the user wants to enter in bulk initially.
        int menuNum = 0;//option to choose menu items.
  
        
        System.out.println("Sensor Readings:");
        System.out.println("Do you want to start the menu bar:");
        choice = sc.next();
        String annotation; //String for the Sensor name
        int readingId;    //reading identification number
        double value;    //value of the reading
        
        
        do{
            System.out.println("How many Sensor reading values do you want to enter in bulk initially?");
            numReadings = sc.nextInt();
            
            addBulk(sc,data,Capacity);
            
            
            System.out.println("Choose a number(1-5) to select your desired menu item:");
            menuNum = sc.nextInt();
            
            switch(menuNum){
                
                case 1:  
                    
                    
                    System.out.println("The added bulk values are: "+ addBulk(sc,data,Capacity));
                    for(int i = 0;i<numReadings;i++){
                        System.out.println(data[i].annotation);
                        System.out.println(data[i].readingId);
                        System.out.println(data[i].value);
                    }
                    
                    break;
                    
                case 2: //Display all readings.
                    printAll(sc,data,numReadings);
                    break;
                    
                case 3: //Display average reading.
                    break;
                    
                case 4://Display Largest reading.
                    break;
                    
                case 5: //add a new custom object to the array
                   count = addReadingData(sc,count,data);
                    
                    break;
                case 6: 
//quit..Terminate the program.
                    
                    
                    
            };
        }while(choice.equals("quit"));
    }
}




