package homeWork.homeWork11.exception;

public class MyArrayDataException extends NumberFormatException {

    private final int wrongRow;
    private final int wrongColum;

    public MyArrayDataException(int row, int column, String message) {
        super(String.format("%s. Ошибка произошла на строке %d и в столбце %d", message, row, column));
        this.wrongRow = row;
        this.wrongColum = column;
    }
    //Создаем геттеры которые могут быть обработаны при использовании исключения

    public int getWrongRow() {
        return wrongRow;
    }

    public int getWrongColum() {
        return wrongColum;
    }
}
