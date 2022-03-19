package homeWork.homeWork11.exception;
//По заданию ДЗ создаем кастомный класс-исключение
import static homeWork.homeWork11.Matrix.*;
public class MyArraySizeException extends RuntimeException{//RuntimeException по сути будет расширен этим кастомным классом

    private final int wrongRows;//строки
    private final int wrongColumns;//колонки

    public MyArraySizeException(int wrongRows,int wrongColumn, String message){//что класс будет содержать
        super(String.format("%s. Количество строк в матрице ожидалось равным %d,а количество колонок, равным %d", message, ROWS, COLUMNS));
        //Заполняем поля
        this.wrongRows = wrongRows;
        this.wrongColumns = wrongColumn;
    }
//Генерим геттеры чтобы к ним потом можно было обратиться
    public int getWrongRows() {
        return wrongRows;
    }

    public int getWrongColumns() {
        return wrongColumns;
    }
}
