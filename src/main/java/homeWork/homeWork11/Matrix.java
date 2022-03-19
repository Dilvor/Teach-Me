package homeWork.homeWork11;

import homeWork.homeWork11.exception.MyArrayDataException;
import homeWork.homeWork11.exception.MyArrayNullElementException;
import homeWork.homeWork11.exception.MyArraySizeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

//Решение 12 ДЗ через коллекции,а не простой двухмерный массив
public class Matrix {

    public static final int ROWS = 4;

    public static final int COLUMNS = 4;

//Создаем класс из которого будем брать рандомномные значения,тут будут вперемешку значения которые может принять матрица
//и значения которые вызовут ошибку
    private static final List<String> SYMBOLS = List.of("25", "45", "16", "78", "3", "-7",
                                                        "28", "0", "8", "12", "54", "29", "13",
                                                        "57", "32", "-69");
    //Создаем коллекцию(матрицу/двухмерный массив)
    private List<List<String>> values;//private String[][] values; -можно еще так
    //Конструктор в которым передаем размеры матрицы и наполняем ее
    public  Matrix(int n,int m) {
        if (n != ROWS || COLUMNS != 4){//Создание логики исключения "если n/m не равны 4"
            throw new MyArraySizeException(n, m, "Произошла ошибка во время инциализации матрицы");//выброс кастомного исключения
        }//дальше нужно инициализировать внутренее поле
        this.values = new ArrayList<>(n);
        fillUp(n, m);
    }

    public void fillUp(int n, int m) {//Заполнение матрицы
        for (int i = 0; i < n; i++) {
            List<String> lines = new ArrayList<>(m);
            this.values.add(lines);
            for (int j = 0; j < m; j++) {
//Теперь нужно заполнить значения которые будут браться из ограниченного множества элементов
                int randomIndex = new Random().nextInt(SYMBOLS.size());//Генерим рандомное значение от 0 до "размер"
                lines.add(SYMBOLS.get(randomIndex));//randomIndex передаеться в качестве параметра
            }
        }
    }

    public int sum() {//Введем новый метод суммирования нужный по ДЗ(итерируем по индексу)
        int result = 0;//счеткик который будет хранить в себе результат
        for (int i = 0; i < this.values.size(); i++) {
            List<String> row = this.values.get(i);
            for (int j = 0; j < row.size(); j++) {
                String value = row.get(j);
                if(Objects.isNull(value) || value.isEmpty()){
                    throw new MyArrayNullElementException("Не допустимы null-значения или пустые строки");
                }
                if (!value.matches("^(-*(\\d)+)$")) {//Проверка(\\d - ожидаются только числа, + значений может быть несколько)
                    throw new MyArrayDataException(i + 1, j + 1, "Некорректное значение в качестве элемента матрицы");//Индексация с 1
                }
                result += Integer.parseInt(value);//аккумулируем в result значение которое преобразовано из строки к числу
                //и имплементируем в предыдущим результатом
            }
        }
        return result;
    }
    public void print(){//Отдельно вводим метод "print"(распечатка в консоль)чтобы было понятно что спрятано в качестве "values"
        for(List<String> lines : this.values){
            System.out.println(lines);
        }
    }
}
