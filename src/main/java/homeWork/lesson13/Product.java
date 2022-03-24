package homeWork.lesson13;

import java.util.Objects;

//Создаем необходимые атрибуты в которые будем класть значения
public class Product implements Comparable<Product> {

    private Integer id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(Integer id, String name, double price) {//Конструктор
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {//Геттеры и Сеттеры
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//Generate->toString чтобы избежать хэшкода в "SetRunner"
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override//Что происходит?
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0  && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override//Generate->Implement Method для "implements Comparable<Product>"
    public int compareTo(Product o) {//Метод чтобы текущий элемент шел раньше чем элемент который передаем в качестве аргумента
        return this.getId().compareTo(o.getId());//по сути повторили то же что и делал метод компаратора
    }
}
