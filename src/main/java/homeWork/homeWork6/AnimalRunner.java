package homeWork.homeWork6;


import java.util.Scanner;

public class AnimalRunner {

    public static void main(String[] args) {
        System.out.println("Приветствую,к вашему удивлению это рабочий код!...Рабочий же...?");
        Scanner scanner = new Scanner(System.in);//Вставляю сканеры для ввода пользователем дистанции.
        System.out.println("Сколько метров животные должны пробежать?");//
        while (!scanner.hasNextInt()) {//не даю введи текст вместо чисел
            String text = scanner.next();
            System.out.println(text + " не число дурилка");
        }
        int goRun = scanner.nextInt();
        while (goRun <= 0) {
            System.out.println("Введите число больше нуля");
            goRun = scanner.nextInt();

        }
        Scanner anotherScanner = new Scanner(System.in);
        System.out.println("Сколько метров животные должны проплыть?");
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println("Попробуй цифры.");
        }
        int goSwim = scanner.nextInt();
        while (goSwim <= 0) {
            System.out.println("Введите число больше нуля!");
            goSwim = scanner.nextInt();

        }
        Animal cat = new Animal();//Теперь задаю характеристики животных
        cat.name = "Сэр Ланселап";
        cat.run = 200;
        cat.swim = 0;

        Animal dog = new Animal();
        dog.name = "Рапид";
        dog.run = 500;
        dog.swim = 10;

        Animal яяяяязь = new Animal();
        яяяяязь.name = "ЯЗЬ";
        яяяяязь.run = 0;
        яяяяязь.swim = 1500;

        Animal doter = new Animal();
        doter.name = "COCKA";
        doter.run = 1488;
        doter.swim = 322;

        Animal skvoznoy = new Animal();
        skvoznoy.name = "Сквозной";
        skvoznoy.run = 0;
        skvoznoy.swim = 0;

        Animal[] animals = new Animal[]{cat, dog, яяяяязь, doter, skvoznoy};//Помещаем животных в массив.
        for (Animal animal : animals) {//Задаем условия для проверки.
            if (goRun < animal.run) {
                System.out.println(animal.name + " смог преодолеть дистанцию " + goRun + " и сверх того еще "
                        + (animal.run - goRun));
            } else if (goRun == animal.run) {
                System.out.println(animal.name + " смог преодолеть дистанцию");
            } else if (animal.run == 0) {
                System.out.println(animal.name + " не умеет ходить");
            } else {
                System.out.println(animal.name + " не смог пробежать дистанцию в " + goRun + " его максимум: "
                        + animal.run);
            }
        }
            for (Animal animal : animals) {
                if (goSwim < animal.swim) {
                    System.out.println(animal.name + " смог проплыть дистанцию " + goSwim + " и сверх того еще "
                            + (animal.swim - goSwim));
                } else if (goSwim == animal.swim) {
                    System.out.println(animal.name + " смог проплыть дистанцию");
                } else if (animal.swim == 0) {
                    System.out.println(animal.name + " не умеет плавать");
                } else {
                    System.out.println(animal.name + " не смог проплыть дистанцию в " + goSwim + " его максимум: "
                            + animal.swim);
                }
            }
        }
    }
