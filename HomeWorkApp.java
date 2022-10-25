package lesson1;

import org.w3c.dom.ranges.DocumentRange;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords(){
        System.out.println("Orangr");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign(){
        int varA = 5;
        int varB = 7;

        int tasksCount = (varA + varB);

        if (tasksCount >=0){
            System.out.println("Сумма Положительная");
        }

        if (tasksCount <0){
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 100;

        if (value <=0){
            System.out.println("Красный");
        } else if (value >0 && value <=100 ){
            System.out.println("Желтый");
        } else if (value >100){
            System.out.println("Зеленый");

        }

    }

    static void compareNumbers() {
         int vatA = 14;
         int vatB = 14;

         if (vatA >= vatB){
             System.out.println("a>=b");
         } else {
             System.out.println("a<b");
         }
    }
   }
