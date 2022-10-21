package HW.HomeWork_4.data;

import HW.HomeWork_4.Memory;

public abstract class Computer {

    private String id;
    private String model;
    private Memory memory;
    private String ssd;

    public Computer(String id, String model, Memory memory, String ssd) {
        this.id = id;
        this.model = model;
        this.memory = memory;
        this.ssd = ssd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String getSsd() {
        return ssd;
    }

    @Override
    public String toString() {
        return "Notebook id=" + getId() + ", " +
                "model:'" + getModel() + "', " +
                "memory: " + getMemory() + " GB, " +
                "SSD:" + getSsd() + " GB";
    }
}