package homeWork;

public class SecondWork {

    public static void main(String[] args) {
        double a, b, c;
        double Discriminant;
        a = 12;
        b = 7;
        c = 1;
        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx+c = 0");
        System.out.println("Где a = 12, b = 7, c = 1");

        Discriminant = b * b - 4 * a * c;
        if (Discriminant > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(Discriminant)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (Discriminant == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}
