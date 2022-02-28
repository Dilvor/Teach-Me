package lesson8;

public class Human {

    private String fio;//Если указан "private",то он доступен только внутри класса
    private int age;
    private String nationality;
    private boolean sex;

    public Human(String fio, int age, String nationality, boolean sex) {//Это должно решить проблему доступа с "private"
        this.fio = fio;
        this.age = age;
        this.nationality = nationality;
        this.sex = sex;
    }

    public void changeName(String newName){//Смена имени
        this.fio = newName;
    }

    public void beOlder(){//Старение(на год)
        this.age++;
    }

    public void changeNationality(String nationality){
        this.nationality = nationality;
    }
//Generate->Setter->age
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {//Определение мужчина или женщина
        return this instanceof Male ? "Мужчина" : "Женщина";
    }

    private Integer getAge(){//Попытка получить через "private" возраст,но за класс оно не выйдет,так в данном случае фейл
        return this.age;
    }

//Generate->toString->all(это чтобы избежать хэш-кода при выведении результата)


    @Override
    public String toString() {//Вывод информации о тех свойствах которые есть у текущего объекта класса "Human"
        return "Human{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", sex=" + getSex() + //Определение пола через метод "getSex"
                '}';
    }
}
