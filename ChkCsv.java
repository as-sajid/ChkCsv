
import java.io.File;

/**
 *
 * @author user1
 */
public class ChkCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File csv_file;
     
       //  temp = File.createTempFile("myTempFile", ".txt");
         csv_file =   new File("C:/Users/nolog/OneDrive/Desktop/java/test.csv");
          
         if (csv_file.exists() )
 
            // Print message if it exists
            System.out.println("The file  "+ csv_file + "  exists");
        else
 
            // Print message if it does not exists
            System.out.println("Does not Exists");
    }
    
}
