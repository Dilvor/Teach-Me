package homeWork.homeWork7.optional;

import java.util.Random;

public class Matrix {//Вся инициализация произойдет в конструкторе из за "final","Setter" тут не нужны

    private static final int MAXIMUM = 10;//Верхняя граница при генерации значений массива матрицы(не включая)
    private int[][] array;//Создан массив,"final" в "m" и "n" чтобы из значения нельзя было изменить
    private final int m;//Длинна массива,
    private final int n;//Количество столбцов

    //Генерим первоначальный конструктор который будет ждать аргументы "m" и "n",и задавать значения строк,столбцов матрицы
    //Generate->Constructor->all
    public Matrix(int m, int n) {//Сгенеренные доп.параметры "int[][] array" тут излишни,
        // они нужны если сразу нужно создать конструктор с заданными значениями.
        this.m = m;//Заданы поля.
        this.n = n;
        this.array = new int[m][n];//Выделяем память под хранение массива.
    }

    //По заданию требовалось создать конструктор по умолчанию,который будет давать возможность создавать матрицы размера 2х2
    public Matrix() {
        this(2, 2);//Позволяет обращаться к другому конструктору,в данном случае требуеться передача значений
        //которые будут отвечать значениям строк и столбццов(int),так можно много раз переиспользовать конструкторы
    }

    //Теперь нужно наполнить матрицу,через циклы
    public void fill() {
        for (int i = 0; i < array.length; i++) {//Итерация по строкам
            for (int j = 0; j < array[i].length; j++) {//Теперь итерация по колонкам
                array[i][j] = new Random().nextInt(MAXIMUM);//Генерим рандомные значения "i" и "j"
                // в заданной верхней границе "MAXIMUM"
            }
        }
    }

    private void fill(int[][] values) {//Этот доп.медот для получения обратной матрицы
        if (this.m != values.length || this.n != values[0].length) {//Проверка
            //ничего не делать
            return;
        }
        this.array = values;
    }

    public void print() {//Добавим распечатку элементов матрицы
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");//Выведение значений по элементу,а " " - для пробела между ними
            }
            System.out.println();//Чтобы разделять строки
        }
    }

    //Тут будет выполнена операция сложения
    public Matrix sum(Matrix matrix) {//Будет возвращена в итоге матрица,не массив
        if (this.m != matrix.m || this.n != matrix.n) {//Проверка,
            return new Matrix();
        }
        Matrix result = new Matrix(this.m, this.n);//Чтобы за пределы массива не выйти....????
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                result.array[i][j] = this.array[i][j] + matrix.array[i][j];
            }
        }
        return result;
    }

    public Matrix sub(Matrix matrix) {//Тут будет вычитание
        if (this.m != matrix.m || this.n != matrix.n) {
            return new Matrix();
        }
        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                result.array[i][j] = this.array[i][j] - matrix.array[i][j];
            }
        }
        return result;
    }

    public Matrix mult(int koefficient) {//А тут умножение
        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                result.array[i][j] = koefficient * this.array[i][j];
            }
        }
        return result;
    }

    public Matrix single() {//Теперь нужно вывести единичную матрицу(Первый способ)
        if (this.m != this.n) {
            return new Matrix().single();
        }
        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                result.array[i][j] = i == j ? 1 : 0;//Заполняем 0 и 1
            }
        }
        return result;
    }

    public static Matrix single(int dimension) {//Второй способ,тут введем размер единичной матрицы
        Matrix result = new Matrix(dimension, dimension);
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                result.array[i][j] = i == j ? 1 : 0;//Заполняем 0 и 1
            }
        }
        return result;
    }

    public static Matrix single2(int dimension) {//Второй способ,более короткая запись
        return new Matrix(dimension, dimension).single();
    }

    //Получение детерминанта или определителя матрицы
    public int determinant() {
        if (this.m != 2 && this.n != 2) {
            return Integer.MIN_VALUE;
        }
        return this.array[0][0] * this.array[1][1] - this.array[0][1] * this.array[1][0];
    }

    //Инвертирование матрицы
    public Matrix transpon() {
        Matrix result = new Matrix(this.m, this.n);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result.array[i][j] = this.array[j][i];//меняем местами "j" и "i"
            }
        }
        return result;
    }

    //Получение обратной матрицы
    public Matrix invert() {
        int determinant = this.determinant();//вычисляем детерминант,разложим его отдельную переменную для получения новой матрицы
        Matrix matrix = new Matrix();
        if (this.m != 2 && this.n != 2) {//Проверка что матрица будет размерности 2х2(нужной в этой задаче)
            return matrix;
        }
        matrix.fill(new int[][]{//тут мозг уже не пашет
                {array[1][1] / determinant, -array[0][1] / determinant},
                {-array[1][0] / determinant, array[0][0] / determinant}
        });
        return matrix;
    }

    //Одно из требований задания возвращения размерностей наших массивов(возвращение "m" и "n" в качестве методов)
    //Generate->Getter->int:m,int n.
    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
}
