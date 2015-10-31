package dad;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class TxtReader {
 
    public BufferedReader txtBuffer() throws FileNotFoundException {     
        File txt = new File("tekst.txt");
      
            
   BufferedReader in = new BufferedReader(new FileReader(txt));
   return in;
            
    }

}