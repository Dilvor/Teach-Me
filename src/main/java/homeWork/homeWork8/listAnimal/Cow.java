package homeWork.homeWork8.listAnimal;

import homeWork.homeWork8.HardAnimal;

public class Cow extends HardAnimal {//Шарим "HardAnimals"

    public static final String COW_CATEGORY = "Коровка";

    public Cow(){
        super(COW_CATEGORY);
    }

    @Override
    public void voice(){
        System.out.println(this.name + " говорит SHAZOOO");
    }
}