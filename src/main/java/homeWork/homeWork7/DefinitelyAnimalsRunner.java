package homeWork.homeWork7;

import homeWork.homeWork6.Animal;

public class DefinitelyAnimalsRunner {
    public static void main(String[] args) {
        DefinitelyAnimals pig = new DefinitelyAnimals();//Задаю характеристики
        pig.name = "Свинка";
        pig.voice = "WANK";
        pig.age = 2;

        DefinitelyAnimals cow = new DefinitelyAnimals();
        cow.name = "Коровка";
        cow.voice = "SHAZOOO";
        cow.age = 3;

        DefinitelyAnimals rooster = new DefinitelyAnimals();
        rooster.name = "Петушок";
        rooster.voice = "GIKURYKY";
        rooster.age = 1;

        DefinitelyAnimals monkeys = new DefinitelyAnimals();
        monkeys.name = "Обезьянка";
        monkeys.voice = "MAKAK";
        monkeys.age = 3;

        DefinitelyAnimals elephant = new DefinitelyAnimals();
        elephant.name = "Слоник";
        elephant.voice = "FLVOUP";
        elephant.age = 5;//Это же все условно можно счесть за иерархию?
        //Теперь запихиваем живность в массив
        DefinitelyAnimals[] animals = new DefinitelyAnimals[]{pig, cow, rooster, monkeys, elephant};
        for (DefinitelyAnimals animal : animals)//Для корректной работы ссылок в массиве
        System.out.println(animal.name + " говорит:" + animal.voice);//Тут я вывожу в консоль те звуки что они издают
    }
}
