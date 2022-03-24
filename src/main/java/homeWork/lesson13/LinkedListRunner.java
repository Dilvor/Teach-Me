package homeWork.lesson13;

import java.util.*;

public class LinkedListRunner {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();//Список слов "String"
        List<String[]> wordsOfWords = new LinkedList<>();//Список массивов
//        List<List<Set<Integer>>>  - так делать не стоит их сложно обрабатывать
        List<Product> products = new LinkedList<>();
        words.add("Skoda");//Наполняем лист
        words.add("VW");
        words.add("ВАЗ");
        words.add("Bentley");
        words.add("Audi");
        words.add("BMW");
        words.add("Mercedez");
        words.add("Geelty");
        ListIterator<String> wordListIterator = words.listIterator();//Еще один способ интерирования,
        // он может итерировать в обратном направлении
        //while (wordListIterator.hasNext()){//Итерирование вперед
        //    String word = wordListIterator.next();
        //}
       //while (wordListIterator.hasPrevious()){//Итерирование в обратную сторону
            //String word = wordListIterator.previous();
       // }
        System.out.println(words);
        for (Iterator<String> iterator = words.iterator(); iterator.hasNext();){//Логика выбора рандомных слов из списка для удаления
            String next = iterator.next();
            if(new Random().nextBoolean()) {
            System.out.println("Удаляемый элемент: " + next);
                iterator.remove();//Правильное удаление при итерировании
            }
        }
        System.out.println(words);
        List<String> anotherWords = List.of("Lamborghini", "Suzuki", "Ford");//Новая коллекция
        List<String> yetAnotherListOfWords = new ArrayList<>(anotherWords);
        yetAnotherListOfWords = new LinkedList<>(yetAnotherListOfWords);//Если нужно переиспользовать список
        words.addAll(anotherWords);//Добавляем к имеющейся коллекции другую,
        // при просто "addAll" элементы будут добавлено в конец списка
        words.addAll(yetAnotherListOfWords);
        words.set(5, "Jeep");//"5" элемент меняем на какое то значение
        System.out.println(words);
        swap(words, 1, 3);//Вызываем метод "swap" и указываем какие элементы поменять местами
        System.out.println(words);
    }

    private static void swap(List<String> list, int begin, int finish) {//Как поменять один элемент на другой
        if(begin >= list.size() || finish >= list.size()){//Проверка
            //TODO:
            return;
        }
        String firstElement = list.get(begin);//Обращение к 1 элементу
        String secondElement = list.get(finish);//Обращение ко 2 элементу
        list.set(begin, secondElement);//Теперь меняем их местами,ставим "begin" на 2 элемент
        list.set(finish, firstElement);//а "finish" на 1
    }
}
