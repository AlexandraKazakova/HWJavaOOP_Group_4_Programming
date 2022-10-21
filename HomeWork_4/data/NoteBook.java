// data

package HW.HomeWork_4.data;

import HW.HomeWork_4.Memory;

public class NoteBook extends Computer {

    private int battery;
    public NoteBook(String id, String model, Memory memory, String ssd, int battery) {
        super(id, model, memory, ssd);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "NoteBook {" + "id: " + getId() + ", model: " + getModel() +
                ", battery:" + getBattery() +
                '}';
    }
}