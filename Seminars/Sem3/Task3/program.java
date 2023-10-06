package Seminars.Sem3.Task3;
//создать три разных исключения

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class DivizionByZero extends ArithmeticException{
    DivizionByZero(){
        super("Деление на 0 запрещено");
    }
}

class IndexOutOfBoarders extends ArrayIndexOutOfBoundsException{
    IndexOutOfBoarders(){
        super("Выход за пределы массива");
    }
    IndexOutOfBoarders(int arg){
        super("Выход за пределы массива при обращении к аргументу с индексом " + arg);
    }
}
class FileNotFound extends FileNotFoundException{
    FileNotFound(){
        super("Файл не найден");
    }
    FileNotFound(String path){
        super("Файл не найден по пути " + path);
    }
}



public class program {
   public static void main(String[] args) throws FileNotFound {
    int a = 5;
    int b = 2;
    String path ="123";
    try {
        int c = div(a,b);
    } catch (DivizionByZero e) {
        System.out.println(e.getMessage());
    }
    int [] array = new int[b];
    try {
        if (indexCheck(array.length, a)){
            array[a]=4;
        };
    } catch (IndexOutOfBoarders e) {
        System.out.println(e.getMessage());
    }
    try(FileReader in = new FileReader(path);) {
        in.close();
    } catch (FileNotFoundException e) {
        throw new FileNotFound(path);
    } catch(IOException e){
        System.out.println(e.getMessage());
    }

   }

   public static int div(int a, int b){
    if (b ==0){
        throw new DivizionByZero();
    }
    return a/b;
   }

   public static boolean indexCheck(int arraySize, int index){
        if (index>=arraySize){
            throw new IndexOutOfBoarders(index);
        }
        return true;
   }

}
