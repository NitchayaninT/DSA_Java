/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex8_6580081;
import java.util.*;
/**
 *
 * @author User
 */
public class main {
    
    String path     = "src/main/java/Ex8_6580081/";
    String fileName = "movies.txt";
    
    ArrayList<ActorMap> A = new ArrayList<>();
    public void initialize()
    {
        Ex8_6580081.MyFileReader myreader = new Ex8_6580081.MyFileReader(path, fileName);
        myreader.readFile();
        ArrayList<String> allLines = myreader.getLines();
        
        A = new ArrayList<ActorMap>();
        int countLines=0;
        for(String line : allLines)
        {
            if(countLines!=0)
            {
                String []items  = line.split(";");
                String movie = items[0].trim();
                for(int i=1;i<items.length;i++)
                {
                     String actor  = items[i].trim();
                     A.add(new ActorMap(actor,movie) );
                }
   
                
            }
            countLines++;
        }
        System.out.println();
        
    }
    public static void main(String args[])
    {
        
    }
}
