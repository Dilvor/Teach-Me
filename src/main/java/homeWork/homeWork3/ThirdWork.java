package homeWork.homeWork3;

public class ThirdWork {
    //Тут у нас один из возможных вариантов вычисления квадратного корня без ипользования функции "Math"
    public static void main(String[] args) {
        int x = 16;
        if (sqrt(x) == -1) {
            System.out.println("Хрень какая то работай плиз");
        } else {
            System.out.println("Квадратный корень числа " + x + " равен " + sqrt(x));
        }


    }

    public static int sqrt(int x) {
        if (x <= 1) {
            return -1;

        }
        int i = 1;
        while (i * i <= x) {
            i++;//Цикл будет повторен с добавлением +1 к "i",пока "i * i" не будет равно "x"
        }
        return --i;//Цикл прервался и последнее значение "i" будет передано в метод sqrt(x)
        //-- добавленно к "i" чтобы результат не получил +1

    }
}
