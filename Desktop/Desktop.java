package Desktop;

import java.io.*;

public class Desktop {
    static public String doThing(){
        String desktop = System.getProperty("user.home") + "/Desktop";

        return desktop;
    }
    
    public static void main(String[] args) throws IOException 
    { 
        System.out.println(doThing());
    }

    
}