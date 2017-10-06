package be.vdab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class MainReader {
    public static void main(String[] args) {
        try(LineNumberReader reader = new LineNumberReader(
            new BufferedReader(
                new FileReader("/data/liedje.txt")))){
            String line = reader.readLine();
            while(line != null){
                System.out.print(reader.getLineNumber());
                System.out.print(": ");
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
}
