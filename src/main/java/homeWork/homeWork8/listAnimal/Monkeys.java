package homeWork.homeWork8.listAnimal;

import homeWork.homeWork8.HardAnimal;

public class Monkeys extends HardAnimal {

    public static final String MONKEYS_CATEGORY = "Обезьянка";

    public Monkeys(){
        super(MONKEYS_CATEGORY);
    }

    @Override
    public void voice(){
        System.out.println(this.name + " говорит MAKAK");
    }

}
