package homeWork.homeWork7.optional;

public class MatrixRunner {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix();
        matrixA.fill();//Наполняем матрицу
        System.out.println("Матрица A имеет вид: ");
        matrixA.print();

        System.out.println("-------------------");

        Matrix matrixB = new Matrix();
        matrixB.fill();
        System.out.println("Матрица B имеет вид: ");
        matrixB.print();

        System.out.println("-------------------");

        Matrix matrixC = matrixA.sum(matrixB);//сложение матириц "A" и "B"
        System.out.println("Сумма матриц А и В имеет вид: ");
        matrixC.print();

        System.out.println("-------------------");

        Matrix matrixD = matrixA.sub(matrixB);//вычитание теперь
        System.out.println("Разность матриц А и В имеет вид: ");
        matrixD.print();

        System.out.println("-------------------");

        int koefficient = 5;
        Matrix matrixE = matrixA.mult(koefficient);//Умножение на коэффциент
        System.out.printf("Умножение матрицы А на коэффциент %d имеет вид: \n", koefficient);
        matrixE.print();

        System.out.println("-------------------");

        System.out.println("Единичная матрица,созданная на базе матрицы А имеет вид: ");
        matrixA.single().print();

        int dimension = 6;
        System.out.println("-------------------");
        System.out.printf("Единичная матрица размерности %d имеет вид: \n", dimension);
        Matrix.single(dimension).print();

        System.out.println("-------------------");
        System.out.printf("Определитель матрицы А имеет значение: %d\n", matrixA.determinant());

        System.out.println("-------------------");
        System.out.println("Матрица,являющаяся транспортированной по отношению к матрице А, имеет вид: ");
        Matrix transpon = matrixA.transpon();//П.С. тут "invert" переименован в "transpon" через Shift + F6
        transpon.print();

        System.out.println("-------------------");
        System.out.println("Матрица,являющаяся обратной по отношению к матрице А, имеет вид: ");
        Matrix invert = matrixA.invert();
        invert.print();
    }
}
