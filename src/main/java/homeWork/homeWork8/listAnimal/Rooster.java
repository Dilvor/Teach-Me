package homeWork.homeWork8.listAnimal;

import homeWork.homeWork8.HardAnimal;

public class Rooster extends HardAnimal {

    public static final String ROOSTER_CATEGORY = "Петушок";

    public Rooster(){
        super(ROOSTER_CATEGORY);
    }

    @Override
    public void voice(){
        System.out.println(this.name + " говорит GIKURYKY");
    }
}
