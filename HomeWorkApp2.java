package lesson1;

public class HomeWorkApp2 {
;

    public static void main(String[] args) {

        System.out.println(within10and20(2,10));

        System.out.println("**************");

        PositiveNegative(5);
        System.out.println("**************");

        System.out.println(isNegative(-1));
        System.out.println("**************");

        printWordNTimes("String",5);
    }


    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

    public static boolean within10and20(int c, int b) {
        int sum = c + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }else {
            return false;
        }

    }




    /*2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в
            , положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
    public static void PositiveNegative(int a) {

        if (a >=0){
            System.out.println("Положительное");
        } else if (a <0){
            System.out.println("Отрицательное");
        }

    }

    /*3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
            если число отрицательное, и вернуть false если положительное.*/
    public static boolean isNegative(int a) {
        if (a>=0) {
            return true;
        }
        return false;
    }



    /*4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
    отпечатать в консоль указанную строку, указанное количество раз;*/

     public static void printWordNTimes(String word, int times) {
        for (int i=0; i<=times; i++) {
            System.out.println(i + word);
        }
    }











}
