package HW.HomeWork_4.data;

import HW.HomeWork_4.Memory;

public class Tablet extends Computer {
    private Double diagonal;

    public Tablet(String id, String model, Memory memory, String ssd, Double diagonal) {
        super(id, model, memory, ssd);
        this.diagonal = diagonal;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    @Override
    public String toString() {
        return "Tablet {" + "id: " + getId() + ", model: " + getModel() +
                ", diagonal: " + getDiagonal() +
                '}';
    }
}
