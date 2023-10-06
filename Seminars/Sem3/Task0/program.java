package Seminars.Sem3.Task0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class program {
    public static void main(String[] args) {
        Path pathRead = null;
        try(BufferedReader in = new BufferedReader(new FileReader("path")); BufferedWriter out = new BufferedWriter(new FileWriter("path"))){
            out.write(in.readLine());
        } catch(IOException e){
            System.out.println(e.getMessage());
        }        
    }
}
