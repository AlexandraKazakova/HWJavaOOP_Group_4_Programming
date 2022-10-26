package HW.HomeWork_5.desktopComponents;

import java.util.Objects;

public class Ram {
    private int ram;

    public Ram(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ram ram1 = (Ram) o;
        return ram == ram1.ram;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram);
    }

    @Override
    public String toString() {
        return "ram: " + ram + "; ";
    }
}
