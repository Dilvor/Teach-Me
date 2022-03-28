package homeWork.homeWork12;

public class Slave {
    //Создаем нужные характиристики
    private String fio;//ФИО
    private int number;//Табельный номер
    private int experience;//Стаж(в годах)
    //Тут сгенерим конструктор
    public Slave(String fio, int number, int experience) {
        this.fio = fio;
        this.number = number;
        this.experience = experience;
    }

    public int getExperience() {//Генерим геттер чтобы можно было обратиться ко стажу
        return experience;
    }

    @Override//Это чтобы избежать хэшкода
    public String toString() {
        return "Slave{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                ", experience=" + experience +
                '}';
    }
    public void printInfo() {
        System.out.println("Работник: " + fio + " с табельным номером: " + number +
                " работает на организацию уже в течении " + experience + " лет.");
    }
    public void printInfo2() {
        System.out.println("Работнику: " + fio + " с табельным номером: " + number + " не повезло,он теперь уволен.");
    }
}
