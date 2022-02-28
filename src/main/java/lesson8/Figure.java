package lesson8;

import java.util.Objects;

public class Figure {

    String name;
    int size;
//Generate -> equals() and hashCode() /П.С. hashCode потом потерли в данном случае

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//getClass проверка тот же ли класс,если нет то "false"
        Figure figure = (Figure) o;
        return size == figure.size && Objects.equals(name, figure.name);
    }
}
