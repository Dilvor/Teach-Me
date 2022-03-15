package homeWork.homeWork8;

public abstract class HardAnimal {//"abstract" - своего рода шаблон

    protected final String name;//конструктор с "protected" тут чтобы можно было получить доступ к "name"

    public HardAnimal(String name) {//Как будем именовать животное
        this.name = name;
    }

    public abstract void voice();//животное может издавать звук
}
