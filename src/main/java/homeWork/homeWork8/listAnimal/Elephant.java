package homeWork.homeWork8.listAnimal;

import homeWork.homeWork8.HardAnimal;

public class Elephant extends HardAnimal {

        public static final String ELEPHANT_CATEGORY = "Слоник";

        public Elephant(){
            super(ELEPHANT_CATEGORY);
        }

        @Override
        public void voice(){
            System.out.println(this.name + " говорит FLVOUP");
        }
}
