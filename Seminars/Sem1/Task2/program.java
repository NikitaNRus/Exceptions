package Seminars.Sem1.Task2;
// Принимает двумерный целочисленный массив
// Возвращает сумму элементов этого массива
// только квадртаные массивы и в ячейках лежат 0 или 1

import java.lang.reflect.Array;

public class program {
    public static Integer elementsSum(Integer[][] arr){
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr.length;j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static Integer checkArray(Integer[][] arr){
        for (int i = 0; i<arr.length;i++){
            if (arr.length != arr[0].length){
                throw new RuntimeException("Массив не квадратный " + arr.length + "x" + arr[0].length);
            }
            for (int j = 0; j<arr.length;j++){
                if (arr[i][j] !=0 && arr[i][j]!=1){
                    throw new RuntimeException("Не 0 и не 1 в ячейке " + (i+1) + "x" + (j+1));
                }
            }
        }
        return elementsSum(arr);
    }
    public static void main(String[] args) {
        Integer [][] arr = {{1,2,3},{1,0}};
        System.out.println(checkArray(arr));
    }
}
