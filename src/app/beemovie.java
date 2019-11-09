package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class beemovie {
    public FileReader fileReader;
    public beemovie() throws Exception{
        fileReader = new FileReader("Bee movie script.txt");
    }
    public void recurse () throws Exception{
        BufferedReader reader = new BufferedReader(fileReader);
        String curstr;
        while (true){
            curstr = reader.readLine();
            
        }

    }
}
