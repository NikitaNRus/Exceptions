package Seminars.Sem1.Task1;

// Принять целочисленный массив
public class program {
    public static String errorMessage(Integer numError){
        if (numError == -1){
            return "Длина массива меньше заданного минимума";
        }
        else if(numError == -2){
            return "Заданное значение не найдено в массиве";
        }
        else if (numError == -3){
            return "Массив пустой";
        }
        else {
            return "Индекс первого вхождения равен: " + numError;
        }

    }

    
    public static Integer checkArrayLength(Integer [] array, Integer min, Integer value){
        if (array == null){
            return -3;
        }
        else{
            if (array.length < min){
                return -1;
            }
            else{
                for (int i = 0; i<array.length;i++){
                    if (array[i] == value)
                    {
                        return i;
                    }
                }
            return -2;
            }
        }   
    }
    
   
    public static void main(String[] args) {
        Integer min = 4;
        Integer value = 2;
        Integer[] array = {1,2,3,4,56,7,6};
        System.out.println(errorMessage(checkArrayLength(array, min, value)));
    }
}
