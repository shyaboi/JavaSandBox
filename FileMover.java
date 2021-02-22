import java.io.*; 
import java.nio.file.Files; 
import java.nio.file.*; 
  
public class FileMover 
{ 
    public static void main(String[] args) throws IOException 
    { 
        Path temp = Files.move 
        (Paths.get("C:\\Users\\Beast\\Desktop\\terst.txt"),  
        Paths.get("C:\\Users\\Beast\\Desktop\\dest\\445.txt")); 
  
        if(temp != null) 
        { 
            System.out.println("File renamed and moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } 
    } 
}