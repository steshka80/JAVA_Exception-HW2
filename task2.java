//Если необходимо, исправьте данный код (задание 2
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class task2 {
    public static void main(String[] args) {
        int[] intArray = new int[] { 2, 4, 8, 1, 5, 7 };
        int d = 4;
        int index = 8;
        if (d == 0) {
            System.out.println("Знаменатель не может равняться нулю.");
        } else if (intArray == null) {
            System.out.println("Массив пустой.");
        } else if (index < 0 || index >= intArray.length) {
            System.out.println("Индекс не соотвествует длине массива.");
        } else {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}
