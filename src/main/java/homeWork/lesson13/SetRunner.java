package homeWork.lesson13;

import java.util.*;

//Тут будет показано как создавать множества не подлежащие модификации
public class SetRunner {
    public static void main(String[] args) {
        System.out.println(Set.of(13, 15, -1, 28, 75));//Создаем множество и распечатываем
        Set<Product> products = new LinkedHashSet<>();//Создаем множество продуктов в котором будем хранить HashSet продуктов
        //LinkedHashSet в отличие от HashSet позволяет структурировать вывод множества и сделать его неизменным
        products.add(new Product(1, "Хлеб", 35));
        products.add(new Product(10, "Хлеб", 35));
        products.add(new Product(2, "Молоко", 70));
        products.add(new Product(3, "Яблоко", 120));
        products.add(new Product(4, "Зубная Паста", 300));
        products.add(new Product(5, "Мусорные пакеты", 20));
        System.out.println(products);

        Set<Integer> values = new TreeSet<>();//в TreeSet добавление автоматически идет в возрастающем порядке
        values.add(150);
        values.add(1);
        values.add(138);
        values.add(-5);
        values.add(17);
        values.add(1);
        System.out.println(values);

        Set<Product> products2 = new TreeSet<>(/*new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId().compareTo(o2.getId());
            }
        }*/);
        products2.add(new Product(145, "Хлеб", 35));
        products2.add(new Product(10, "Хлеб", 35));
        products2.add(new Product(21, "Молоко", 70));
        products2.add(new Product(3, "Яблоко", 120));
        products2.add(new Product(47, "Зубная Паста", 300));
        products2.add(new Product(-5, "Мусорные пакеты", 20));
        System.out.println(products2);
    }
}
