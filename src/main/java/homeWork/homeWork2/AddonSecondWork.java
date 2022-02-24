package homeWork.homeWork2;

public class AddonSecondWork {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Факториал числа 5 = " + getFactorial(5));
    }
}
