package Seminars.Sem1.Task0;


// Принять целочисленный массив

public class program {
    
    public static Integer checkArrayLength(Integer [] array, Integer min){
        if (array.length < min){
            return -1;
        }
        else{
            return array.length;
        }
            
    }
    
    
    
    public static void main(String[] args) {
        Integer min = 4;
        Integer[] array = {1,2,3,4,56,7,6};
        System.out.println(checkArrayLength(array, min));
    }
}
