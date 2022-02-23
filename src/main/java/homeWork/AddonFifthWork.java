package homeWork;

import java.util.Scanner;

public class AddonFifthWork {
    //Вычисление массива Фибоначчи,использую массив как промежуточный кэш.
    //Если запрашивается значение,которое ранее было вычислено,
    //то оно берется из массива(без вычисления).
    //В противном случае - значение рассчитывается и кладется в массив.
    public static void main(String[] args) {
        int arrayLenght = 50;
        long[] fibonacciArray = new long[arrayLenght]; // 0 1 1 2 3 5 8 13 21 34 55
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;
        System.out.println("Well, hello there");
        int lastIndex = 2;
        while (true) {
            int index = getFibonacciIndex(arrayLenght);
            System.out.println(index);
            long result;
            if (fibonacciArray[index] == 0) {
                System.out.printf("Значение с индексом %d было расчитано и размещено в кэше\n", index);
                for (int i = lastIndex; i <= index; i++) {
                    fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
                }
                result = fibonacciArray[index];
            } else {
                result = fibonacciArray[index];
            }
            System.out.printf("Число,стоящее на %d индексе имеет значение %d\n", index, result);
        }
    }
    private static int getFibonacciIndex(int maxIndex){
        System.out.println("Введите позицию в ряде Фибоначчи как целое число:");
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            String command = scanner.next();
            if("exit".equalsIgnoreCase(command)){
                System.out.println("bye bye one hundred times");
                System.exit(0);
            }
            System.out.println("Not that nibba");
        }
        int lenght = scanner.nextInt();
        if(lenght <= 0){
            System.out.printf("Вы указали отрицательное значение %d, что не допустимо в программе\n", lenght);
            return getFibonacciIndex(maxIndex);
        }else if (lenght >= maxIndex){
            System.out.printf("Вы указали значение большее, чем %d, что не допустимо в программе\n", maxIndex);
        }
        return lenght;
    }
}

