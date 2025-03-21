import jdk.jfr.Description;

import java.util.HashMap;
import java.util.Objects;

public class Catalog {
    String name;
    String description;
    double minPrice;
    double maxPrice;
    String additional;
    int date;
    boolean beInUse;
    boolean waterBox;

    public Catalog(String s) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog catalog = (Catalog) o;
        return minPrice == catalog.minPrice &&
                maxPrice == catalog.maxPrice &&
                date == catalog.date &&
                beInUse == catalog.beInUse &&
                waterBox == catalog.waterBox &&
                Objects.equals(name, catalog.name) &&
                Objects.equals(description, catalog.description) &&
                Objects.equals(additional, catalog.additional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, minPrice, maxPrice, additional, date, beInUse, waterBox);
    }

    public Catalog(String name, String description, double minPrice, double maxPrice, String additional, int date, boolean beInUse, boolean waterBox) {
        this.name = name;
        this.description = description;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.additional = additional;
        this.date = date;
        this.beInUse = beInUse;
        this.waterBox = waterBox;
    }
}
