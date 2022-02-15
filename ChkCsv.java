
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
//import com.opencsv.CSVReader;
import java.util.Arrays;


/**
 *
 * @author user1
 */
public class ChkCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        File csv_file;
     
      
         csv_file =   new File("C:/Users/nolog/OneDrive/Desktop/java/test.csv");
          
         if (csv_file.exists() ) {
 
            // Print message if it exists
            System.out.println("The file  "+ csv_file + "  exists");
            try
            {
                List< List<String> > data = new ArrayList<>();//list of lists to store data
              //  String file = "C:\\Users\\Lenovo\\Desktop\\demo.csv";//file path
                FileReader fr = new FileReader(csv_file);
                BufferedReader br = new BufferedReader(fr);
                
                //Reading until we run out of lines
                String line = br.readLine();
                while(line != null)
                {
                    List<String> lineData = Arrays.asList(line.split(","));//splitting lines
                    data.add(lineData);
                    line = br.readLine();
                }
                
                //printing the fetched data
                for(List<String> list : data)
                {
                    for(String str : list)
                        System.out.print(str + " ");
                    System.out.println();
                }
                br.close();
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
        }//end if

        else
        {
 
            // Print message if it does not exists
            System.out.println("Does not Exists");
    }
    }
    
}
