package lesson8;

import java.util.Objects;

public class Cat {

    String name;//Задаем какие будут присутствовать у класса характеристики.
    int age;
    String poroda;
    String bossName;

    public boolean equals(Cat cat) {//Сравнение объектов класса "Cat" и объектами класса "Cat",и никакими другими.
        return Objects.equals(name, cat.name) && age == cat.age && Objects.equals(poroda, cat.poroda);
    }//"equals" лучше использовать для ссылочных типов "String",а "==" для примитивов типа "int".
    //Задана логика того что котики будут равны только при совпадении всех заданных параметров.
}
//Если бы в 4 ответе выдавал бы "false",то можно было бы сделать проверку и изменить "public boolean equals"
/*public boolean equals(Object cat){
    if(cat instanceof  Cat c) {
        return Objects.equals(name, c.name) && age == c.age && Objects.equals(poroda, c.poroda);
    }
    return false;*/
//Лучше избегать одноименных методов у которых параметры могут отличаться
