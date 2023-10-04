package Homeworks.HW1.Task1;
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// , и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.println("Вы ввели число: " +  userInput());

    }



    public static float userInput(){
        System.out.println("Введите число типа float ");
        String str = "";
        float temp;
        try (Scanner sc = new Scanner(System.in);) {
        str = sc.nextLine();
        str = str.replace(",", ".");
        if (isNumber(str)) {
            temp = Float.parseFloat(str);
        } else {
            System.out.println("Введено не число, повторите ввод ");
            temp = userInput();
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            temp = userInput();
        }
        return temp;
        }
    
    public static boolean isNumber(String str){
            String string = "0123456789.,";
        for (char elem : str.toCharArray()) {
            if (!string.contains(String.valueOf(elem))) {
                return false;
            }
        }
        return true;
    }
}
