package lesson7;

public class Human {//Взаимосвязан с классом "HumanRunner".
    //Пример классо ориентированного программирования.
    String name;//Создан класс в котором есть определение характеристики "name".
    String surname;
    int age;//для хранения возраста.
    double weight;//для хранения веса.
    double height;
    Boolean hasQrCode;
    boolean male;

    //Пока значения не заданы,в них по умолчанию:String: "null", int: "0", double:"0.0", boolean:"false",Boolean:"null".
    //Для минимального класса все задано.
    //Создание конструктора ПКМ->Generate->Constructor
    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Human(String n, String surname, int age, double weight,
                 double height, Boolean hasQrCode) {
        name = n;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hasQrCode = hasQrCode;
    }

    public void beOlder() {//Метод старения(на год,операция инкремент (+1)).
        this.age++;
    }

    public void beOlder(int age) {//Метод старения(на год,операция инкремент (+1)).
        this.age = +age;//Указание на СКОЛЬКО постареет.
    }

    public void chippirovan() {//Если чипировался - получай QR код.
        this.hasQrCode = true;
    }

    //ПКМ->Generate->Getter->all
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public Boolean getHasQrCode() {
        return hasQrCode;
    }

    //ПКМ->Generate->Getter-> male:boolean
    public boolean isMale() {//"is" добавлено к "male" из-за "boolean"
        return male;
    }

    //ПКМ->Generate->Setter->all
    //"Setter" имеет тип "void" ибо не предполагает возвращения значения
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHasQrCode(Boolean hasQrCode) {
        this.hasQrCode = hasQrCode;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void init(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
