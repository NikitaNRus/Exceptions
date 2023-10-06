package Homeworks.HW2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
     public static void main(String[] args) {
        try {
            String temp = inputFromUser();
            writeData(parseData(temp));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }

     public static String inputFromUser(){
        String temp ="";
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите данные в формате (Фамилия Имя Отчество Дата рождения (XX.XX.XXXX) Номер телефона Пол): ");
            temp = scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return temp;
     }

     public static String [] parseData(String temp){
        String [] arr = temp.split(" ");
        if(!checkRequiredData(arr, 6)){
            throw new InputMismatchException("Вы ввели не все данные. Необходимо (Фамилия Имя Отчество Дата рождения (XX.XX.XXXX) Номер телефона Пол)");
        }
        if (!isNumber(arr)){
            throw new RuntimeException("Формат номера телефона не соответствует");
        }
        if (!isDate(arr)){
            throw new RuntimeException("Формат даты рождения не соответствует");
        }
        if (!isSex(arr)){
            throw new RuntimeException("Формат пола не соответствует");
        }
        return arr;
     }

     public static void writeData(String [] arr){
        String fileName = "C:\\Users\\n" + //
                "ikit\\Desktop\\Обучение программированию\\Обработка исключений\\Homeworks\\HW2\\" + arr[0] + ".txt";
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, file.exists()))) {
            String userData = "<" + arr[0] + ">" + "<" + arr[1] + ">" + "<" + arr[2] + ">" + "<" + arr[3] + ">" + "<" +
                    arr[4] + ">" + "<" + arr[5] + ">";
            writer.write(userData);
            writer.newLine();
            writer.close();
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }
    






     public static boolean checkRequiredData(String[] arr, Integer value){
        if (arr.length == value){
            return true;
        }
        else{
            return false;
        }
     }

     public static boolean isNumber(String[] arr){
        String string = "0123456789";
        for (char item : arr[4].toCharArray()){
            if (!string.contains(String.valueOf(item))){
                return false;
            }
        }
        return true;
     }

     public static boolean isDate(String[] arr){
        String string = "0123456789.";
        for (char item : arr[3].toCharArray()){
            if (!string.contains(String.valueOf(item))){
                return false;
            }
        }
        return true;
     }

     public static boolean isSex(String[] arr){
        String string = "fm";
        for (char item : arr[5].toCharArray()){
            if (!string.contains(String.valueOf(item))){
                return false;
            }
        }
        return true;
     }


}
