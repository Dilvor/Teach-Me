package homeWork.homeWork11;

public class MatrixRunner {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(4 ,4);//Задаем размеры нужной матрицы 4х4
        matrix.print();//Распечатываем
        System.out.println("Результат суммирования элементов матрицы равен " + matrix.sum());
    }
}
