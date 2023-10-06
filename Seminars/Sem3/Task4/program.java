package Seminars.Sem3.Task4;
// создаем свои исключения

class MyArraySizeExceptiom extends RuntimeException{
    MyArraySizeExceptiom(){
        super("Массив не 4х4");
    }
    MyArraySizeExceptiom(int a, int b){
        super("Массив не 4х4, а " + a + "х" +b);
    }
}
class MyArrayDataException extends NumberFormatException{
    MyArrayDataException(int i, int j){
        super("Не удалось преобразовать в число значение массива с индексами " + i + "x"+ j);
    }
}



public class program {
    public static void main(String[] args) {
        String [][] array1 = {{"1","2","3"}, {"2","3","4","1"}};
        String [][] array2 = {{"2","3","4","1"}, {"2","bugaga","4","1"}, {"2","3","4","1"}, {"2","3","4","1"},};
        try {
            //int a = sumMatrix(array1);
            int b = sumMatrix(array2);   
            System.out.println(b);
        } catch (MyArraySizeExceptiom | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        
        
    }

    public static Integer sumMatrix(String [][] arr){
        Integer sum =0;
        for (int i =0; i<arr.length;i++){
            if (arr.length !=4 || arr[i].length != 4){
                throw new MyArraySizeExceptiom(arr.length, arr[0].length);
            }
            for (int j=0;j<arr.length;j++){
                try {
                    sum+= Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                   throw new MyArrayDataException(i, j);
                }  
            }
        }
        return sum;
    }
}
