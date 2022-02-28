package lesson8;

public class FigureRunner {
    public static void main(String[] args) {
        Figure figure = new Figure();
        Figure figure2 = new Figure();
        if (figure == null) {//Проверка чтобы не получить ошибку "NPE"
            boolean equals = figure.equals(null);//Это будет "false"
        }
    }
}
