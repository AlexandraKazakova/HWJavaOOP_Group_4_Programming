package HW.HomeWork_5.desktopComponents;

import java.util.Objects;

public class Desktop {

    private Cpu cpu;
    private MotherBoard motherBoard;
    private Ssd ssd;
    private Ram ram;
    private VideoCard videoCard;

    private String firm;

    public Desktop(){}

    public Desktop(String firm){
        this.firm = firm;
    }

    public Cpu getCpu() {
        return cpu;
    }
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public String getFirm(){
        return firm;
    }

    public void setFirm(String firm){
        this.firm = firm;
    }

    @Override
    public String toString() {
        return "firm: " + firm + "; " + ssd + videoCard
                +  ram + motherBoard + cpu + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desktop desktop = (Desktop) o;
        return Objects.equals(firm, desktop.firm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firm);
    }
}
