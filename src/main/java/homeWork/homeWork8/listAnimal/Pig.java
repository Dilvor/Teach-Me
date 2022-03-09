package homeWork.homeWork8.listAnimal;

import homeWork.homeWork8.HardAnimal;

public class Pig extends HardAnimal {

    public static final String PIG_CATEGORY = "Свинка";

    public Pig(){
        super(PIG_CATEGORY);
    }

    @Override
    public void voice(){
        System.out.println(this.name + " говорит WANK");
    }
}
