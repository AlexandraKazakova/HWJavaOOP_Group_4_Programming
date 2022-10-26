package HW.HomeWork_5.desktopComponents;

import java.util.Objects;

public class Ssd {
    private int capacity;

    public Ssd(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ssd ssd = (Ssd) o;
        return capacity == ssd.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity);
    }

    @Override
    public String toString() {
        return "Ssd: " + capacity + "; ";
    }
}
