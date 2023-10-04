package Homeworks.HW1.Task4;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        String str = userInput();
        System.out.println(str);
    }

  public static String userInput() {
    System.out.println("Введите строку ");
    String str = null;
    try (Scanner sc = new Scanner(System.in);) {
      str = sc.nextLine();
      if (str.isEmpty()) {
        throw new Exception("Пустые строки вводить нельзя  ");
      }
    } 
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return str;
  }
}
