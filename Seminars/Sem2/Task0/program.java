package Seminars.Sem2.Task0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class program {

    public static List<String[]> readFile(String path){
        List<String[]> temp = new ArrayList<String[]>();
        
        try {
            String line;
            BufferedReader file = new BufferedReader(new FileReader(path));
            while((line=file.readLine())!=null){
                temp.add(line.split("="));
            }
            file.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return temp;
    }

    public static void checkArray(List<String[]> arr){
        for (String[] strings : arr) {
            if(strings[1].equals("?")){
                strings[1] = String.valueOf(strings[0].length());
                continue;
            }
            else if (!isNumber(strings[1])){
                System.out.println("Не число");
            }
            
        }
    }

    public static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }    
    }

    public static boolean inNumberTwo (String str){
        String string = "0123456789";
        for (char item : str.toCharArray()) {
            if (!string.contains(String.valueOf(item))){
                return false;
            }
        }
        return true;
    }
    public static void writeFile(List<String[]> arr, String path){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (String[]strings:arr){
                writer.write(strings[0]+'='+strings[1]+"\n");
            }
            writer.close(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String path = "Seminars/Sem2/Task0/data.txt";
        List<String[]> list = readFile(path);
        checkArray(list);
        writeFile(list, path);
    }
}
