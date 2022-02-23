package homeWork;

import java.util.Scanner;

public class AddonFifthWork {
    //Вычисление массива Фибоначчи,использую массив как промежуточный кэш.
    //Если запрашивается значение,которое ранее было вычислено,
    //то оно берется из массива(без вычисления).
    //В противном случае - значение рассчитывается и кладется в массив.
    public static void main(String[] args) {
        int arrayLenght = 50;//Задана максимальная длинна массива.
        long[] fibonacciArray = new long[arrayLenght];//Задан массив с указанием длинны.
        fibonacciArray[0] = 1;//Задание логики.
        fibonacciArray[1] = 1;
        System.out.println("Well, hello there");
        int lastIndex = 2;//Соответствует последнему заполненному в массиве...?????wat????
        while (true) {
            int index = getFibonacciIndex(arrayLenght);
            System.out.println(index);
            long result;
            if (fibonacciArray[index] == 0) {//Если значение равно нулю,
                // значит массив с этим индексов не был здесь заполнен.
                System.out.printf("Значение с индексом %d было расчитано и размещено в кэше\n", index);
                for (int i = lastIndex; i <= index; i++) {
                    fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];//Формула вычисления Фибоначчи.
                }
                result = fibonacciArray[index];
            } else {//Иначе будет выведен результат из данного массива.
                result = fibonacciArray[index];
            }
            System.out.printf("Число,стоящее на %d индексе имеет значение %d\n", index, result);
        }
    }
    private static int getFibonacciIndex(int maxIndex){
        System.out.println("Введите позицию в ряде Фибоначчи как целое число:");
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){//Тут проверка на то что введено число.
            String command = scanner.next();
            if("exit".equalsIgnoreCase(command)){//Ввод "exit" завершит программу.
                System.out.println("bye bye one hundred times");
                System.exit(0);
            }
            System.out.println("Not that nibba");//Все прочее что НЕ цифры будет отвергнуто.
        }
        int lenght = scanner.nextInt();
        if(lenght < 0){//Не дает ввести больше "50" или меньше "0".
            System.out.printf("Вы указали отрицательное значение %d, что не допустимо в программе\n", lenght);
            return getFibonacciIndex(maxIndex);
        }else if (lenght >= maxIndex){
            System.out.printf("Вы указали значение большее, чем %d, что не допустимо в программе\n", maxIndex);
            return getFibonacciIndex(maxIndex);
        }
        return lenght;
    }
}

