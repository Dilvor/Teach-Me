package HomeWork;

public class FirstWork {

    int data1,data2;

    public static void main(String[] args) {
        long calculation = summa(14, 88);
        System.out.println(calculation);
        long anotherCalculation = summa(32, 2);
        System.out.println(anotherCalculation);
        long andAnotherCalculation = summa(88, 12);
        System.out.println(andAnotherCalculation);

        long hardCalculation = number(14, 7);
        System.out.println(hardCalculation);
        long anotherHardCalculation = number(42, 7);
        System.out.println(anotherHardCalculation);
    }
    public static long summa(int arg1,int arg2) {
        return arg1 + arg2;
    }

    public static long number(int arg1,int arg2) { return arg1 * arg2; }
}
