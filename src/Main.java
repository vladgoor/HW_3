//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int numOfArray = 10; // Кол-во элементов массива
        int[] arr = new int[numOfArray]; // Инициализация массива
        System.out.println("Массив " + numOfArray  + " элементов :" );

        for(int count = 0; count < numOfArray; count++){ // Запись в каждый элемент массива рандомного числа
            Random rand = new Random();
            arr [count] = rand.nextInt(-100, 100) ; // Знач от -100 до 100
            System.out.print(arr[count] + " "); // Вывод всех эллементов массива

        }
        System.out.println(" ");
//=============================Task 1=========================================
        int maxNum;
        int minNum;

        if (numOfArray == 1) System.out.println("Массив из 1 элемента ==> max,min = " + arr[0]); // Проверка на массив из 1 элем.
        maxNum = arr[0];
        minNum = arr[0];
        for(int count = 0; count < numOfArray; count++){
            if (arr[count] < minNum){
                minNum = arr[count];
            }
            if (arr[count] > maxNum) {
                maxNum = arr[count];
            }
        }
        System.out.println("min = " + minNum + " max = " + maxNum);

    }

}