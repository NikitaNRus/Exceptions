package Homeworks.HW1.Task2;

public class program {
    public static void main(String[] args) {
        // не объявлен массив
        int[] intArray = new int[] {1,2,3,4,5,6,7,8,10};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            } 
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } 
    }     
}
