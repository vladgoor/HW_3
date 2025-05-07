//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int taskNumber = 3; // Номер задания которое хотим выполнить
        int numOfArray = 19; // Кол-во элементов массива
        int[] arr = new int[numOfArray]; // Инициализация массива
        System.out.println("Массив " + numOfArray  + " элементов :" );


        for(int count = 0; count < numOfArray; count++){ // Запись в каждый элемент массива рандомного числа
            Random rand = new Random();
            arr [count] = rand.nextInt(-200,1500 ) ; // Знач от -100 до 100
            System.out.print(arr[count] + " "); // Вывод всех эллементов массива
        }
        System.out.println(" ");
        switch(taskNumber){ // Выбор задания



//=============================Task 1=========================================
            case (1):
                int maxNum;
                int minNum;

                if (numOfArray == 1)
                    System.out.println("Массив из 1 элемента ==> max,min = " + arr[0]); // Проверка на массив из 1 элем.
                maxNum = arr[0];
                minNum = arr[0];
                for (int count = 0; count < numOfArray; count++) {
                    if (arr[count] < minNum) {
                        minNum = arr[count];
                    }
                    if (arr[count] > maxNum) {
                        maxNum = arr[count];
                    }
                }
                System.out.println("min = " + minNum + " max = " + maxNum);
            break;
//=============================Task 2=========================================
            case (2):
                int evenNum = 0;
                int notEvenNum = 0;

                for (int count = 0; count < numOfArray; count++){ // Определяем размер массива для чет и не чет чисел
                    if(arr[count] % 2 == 0) evenNum++; else notEvenNum++;
                }
                int[] arrEvenNum = new int[evenNum];
                int indexArrEvenNum = 0;
                int[] arrNotEvenNum = new int[notEvenNum];
                int indexArrNotEvenNum = 0;

                for (int count = 0; count < numOfArray; count++) {
                    if (arr[count] % 2 == 0) {
                        arrEvenNum[indexArrEvenNum] = arr[count];
                        indexArrEvenNum++;
                    }
                }
                for (int count = 0; count < numOfArray; count++) {
                    if(arr[count] % 2 == 1  || arr[count] % 2 == -1) {
                        arrNotEvenNum[indexArrNotEvenNum] = arr[count];
                        indexArrNotEvenNum++;
                    }
                }

                System.out.print("Четные числа :" );
                for(int count = 0; count < indexArrEvenNum; count++){
                    System.out.print(arrEvenNum[count] + " ");
                }
                System.out.println(" ");
                System.out.print("Нечетные числа :" );
                for(int count = 0; count < indexArrNotEvenNum; count++){
                    System.out.print(arrNotEvenNum[count] + " ");
                }
            break;

//=============================Task 3=========================================
            case (3):
                int maxRank = 0;
                int minRank = 0;
                int rankCurrentNum = 0;
                int currentNum;
                for(int count = 0; count < numOfArray; count++){
                    rankCurrentNum = 0;
                    currentNum = arr[count];
                    while (currentNum != 0){
                        currentNum /= 10;
                        rankCurrentNum ++;
                    }
                    if(maxRank < rankCurrentNum) maxRank = rankCurrentNum; // Макс разряд числа
                    if(minRank > rankCurrentNum || minRank == 0) minRank = rankCurrentNum; // Мин разряд числа
                }


                System.out.println("maxRank = " + maxRank);
                System.out.println("minRank = " + minRank);
                int indexMaxLongNum = 0;
                int indexMinLongNum = 0;
                for (int count = 0; count < numOfArray; count++){
                    rankCurrentNum = 0;
                    currentNum = arr[count];
                    while (currentNum != 0){
                        currentNum /= 10;
                        rankCurrentNum ++;
                    }
                    //System.out.println("rankCurrentNum = " + rankCurrentNum);
                    if(rankCurrentNum == maxRank) indexMaxLongNum ++;
                    if(rankCurrentNum == minRank) indexMinLongNum ++;
                }

                int[] maxLongNum = new int[indexMaxLongNum];
                int[] minLongNum = new int[indexMinLongNum];
                indexMaxLongNum = indexMaxLongNum - 1;
                indexMinLongNum = indexMinLongNum -1;
                for (int count = 0; count < numOfArray; count++){
                    rankCurrentNum = 0;
                    currentNum = arr[count];
                    while (currentNum != 0){
                        currentNum /= 10;
                        rankCurrentNum ++;
                    }
                    //System.out.println("rankCurrentNum = " + rankCurrentNum + " maxRank = " + maxRank);
                    if(rankCurrentNum == maxRank){
                        maxLongNum[indexMaxLongNum] = arr[count];
                        //System.out.println(" maxLongNum[" + indexMaxLongNum + "] = " + maxLongNum[indexMaxLongNum]);
                        indexMaxLongNum = indexMaxLongNum - 1;
                    }
                    if(rankCurrentNum == minRank){
                        minLongNum[indexMinLongNum] = arr[count];
                        indexMinLongNum = indexMinLongNum - 1;
                    }



                }
                System.out.print("Самые длинные числа : ");
                for (int count = 0; count < maxLongNum.length; count ++){
                    System.out.print(maxLongNum[count] + " ");
                }
                System.out.println(" ");
                System.out.print("Самые Короткие числа : ");
                for (int count = 0; count < minLongNum.length; count ++){
                    System.out.print(minLongNum[count] + " ");
                }


                break;
//=============================Task 3=========================================
            case (4):
                int[] duplicateArr = new int[numOfArray + 1];
                boolean kombo = false;
                for(int count = 0; count < numOfArray; count++){
                    duplicateArr[count] = arr[count];
                }

                for(int count = 0; count < numOfArray; count++) {
                    if (arr[count] < duplicateArr[count + 1]) {
                        System.out.print(arr[count] + " ");
                        kombo = true;
                        continue;
                    }
                    if(kombo == true){
                        System.out.print(arr[count] + "   ");
                        kombo = false;
                        continue;
                    }
                }
            break;
//=============================Task 3=========================================
            case (5):
                int rankNum;
                boolean numIsNiggative = false;
                for(int count = 0; count < numOfArray; count++){
                    rankNum = 0;
                    if(arr[count] <= 9 && arr[count] >= -9){
                        System.out.println(arr[count]);
                    } else {
                        if(arr[count] < 0){ // проверка на отрицательный элемент массива
                            arr[count] *= -1;
                            numIsNiggative = true;
                        }
                        int countNum = arr[count];
                        while (countNum != 0){ // Определяем кол-во цифр в числе
                            countNum /= 10;
                            rankNum++;
                        }
                        int rank = rankNum;
                        int highRank = 1;
                        int lowRank = 1;

                        while (rank > 1){ // Подсчет макс разряда
                            highRank *= 10;
                            rank--;
                        }

                        for(int j = 0; j < rankNum; j++){
                            if ((arr[count] / highRank) % 10 == (arr[count] / lowRank) % 10){
                                highRank /= 10;
                                lowRank *= 10;
                            } else break;
                            if(j + 1 == rankNum) {
                                if(numIsNiggative == true){
                                    System.out.println(arr[count] *= -1);
                                    numIsNiggative = false;
                                }   else System.out.print(arr[count] + " " );

                            }
                        }
                        numIsNiggative = false;
                    }
                }
            break;
        }
    }

}