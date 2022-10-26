package HW.HomeWork_5.builder;

import HW.HomeWork_5.desktopComponents.*;

public class DesktopBuilder {

    private Desktop desktop;
    public void setCpu(Cpu cpu){
        desktop.setCpu(cpu);
    }

    public void setMotherBoard(MotherBoard motherBoard){
        desktop.setMotherBoard(motherBoard);
    }

    public void setSsd(Ssd ssd){
        desktop.setSsd(ssd);
    }

    public void setRam(Ram ram){
        desktop.setRam(ram);
    }

    public void setVideoCard(VideoCard videoCard){
        desktop.setVideoCard(videoCard);
    }

    public void setFirm(String firm){
        desktop.setFirm(firm);
    }

    public void createDesktop(){
        this.desktop = new Desktop();
    }

    public  Desktop getDesktop(){
        return desktop;
    }
}
