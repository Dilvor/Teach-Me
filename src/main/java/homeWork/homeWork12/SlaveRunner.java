package homeWork.homeWork12;


import java.util.ArrayList;

public class SlaveRunner {
    public static void main(String[] args) {
        int workAge = 3;//Местное мерилово успеха(в годах)
        ArrayList<Slave> slaves = new ArrayList<Slave>();//Инициализируем список
        //Генерим работников
        slaves.add(new Slave("Васян1", 220, 2));
        slaves.add(new Slave("Васян2", 221, 4));
        slaves.add(new Slave("Васян3", 222, 1));
        slaves.add(new Slave("Васян4", 223, 5));
        slaves.add(new Slave("Васян5", 224, 2));
        slaves.add(new Slave("Васян6", 225, 3));
        slaves.add(new Slave("Васян7", 226, 1));
        slaves.add(new Slave("Васян8", 227, 2));
        slaves.add(new Slave("Васян9", 228, 15));
        slaves.add(new Slave("Васян10", 229, 2));
        for (int i = 0; i < slaves.size(); i++) {//Теперь логика вывода работников у которых стаж равен или выше "workAge"
            if (slaves.get(i).getExperience() >= workAge) {
                slaves.get(i).printInfo();
            }
        }//Теперь через итерацию удалим нечетных работников
        int i = 0;
        while (i < slaves.size()) {
            slaves.remove(i++).printInfo2();
        }
    }
}