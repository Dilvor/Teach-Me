package homeWork.homeWork8;

import homeWork.homeWork8.listAnimal.Cow;
import homeWork.homeWork8.listAnimal.Pig;
import homeWork.homeWork8.listAnimal.Rooster;
import homeWork.homeWork8.listAnimal.Monkeys;
import homeWork.homeWork8.listAnimal.Elephant;

public class Launcher {//Задание тоже что и в прошлый раз,но с усложнением "abstract"
    public static void main(String[] args) {
        Pig pig = new Pig();//Выделяю память под каждое новое животное
        Cow cow = new Cow();
        Rooster rooster = new Rooster();
        Monkeys monkeys = new Monkeys();
        Elephant elephant = new Elephant();

        HardAnimal[] animals = new HardAnimal[]{pig, cow, rooster, monkeys, elephant};//Создаем массив
        for (HardAnimal animal : animals){
            animal.voice();//Вызываем звуки что издают
        }
    }
}
