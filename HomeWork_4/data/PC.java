package HW.HomeWork_4.data;

import HW.HomeWork_4.Memory;

public class PC extends Computer {

    private int powerSupply;

    public PC(String id, String model, Memory memory, String ssd, int powerSupply) {
        super(id, model, memory, ssd);
        this.powerSupply = powerSupply;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    @Override
    public String toString() {
        return "PC {" + "id: " + getId() + ", model: " + getModel() +
                ", powerSupply: " + getPowerSupply() +
                '}';
    }

}
