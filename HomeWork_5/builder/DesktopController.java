package HW.HomeWork_5.builder;

import HW.HomeWork_5.desktopComponents.*;
import HW.HomeWork_5.service.*;

import java.util.List;

public class DesktopController implements Printable<Desktop> {
    private DesktopBuilder desktopBuilder = new DesktopBuilder();
    private DesktopService desktopService = new DesktopService();
    private CpuService cpuService = new CpuService();
    private MotherBoardService motherBoardService = new MotherBoardService();
    private RamService ramService = new RamService();
    private SsdService ssdService = new SsdService();
    private VideoCardService videoCardService = new VideoCardService();

    public List<Desktop> findByCpuFirm(List<Desktop> list, Cpu cpu){
        return cpuService.find(list,cpu);
    }
    public List<Desktop> findByDesktopFirm(List<Desktop> list, Desktop desktop) {
        return desktopService.find(list, desktop);
    }
    public List<Desktop> findByMotherBoardFirm(List<Desktop> list, MotherBoard motherBoard){
        return motherBoardService.find(list,motherBoard);
    }
    public List<Desktop> findByRamCapasity(List<Desktop> list, Ram ram){
        return ramService.find(list,ram);
    }
    public List<Desktop> findByVideoCardFirm(List<Desktop> list, VideoCard videoCard){
        return videoCardService.find(list,videoCard);
    }
    public List<Desktop> findBySsdCapasity(List<Desktop> list, Ssd ssd){
        return ssdService.find(list,ssd);
    }


    public Desktop buildDesktop(String firm, Cpu cpu, MotherBoard motherBoard,
                                Ssd ssd, Ram ram, VideoCard videoCard){
        desktopBuilder.createDesktop();
        desktopBuilder.setSsd(ssd);
        desktopBuilder.setVideoCard(videoCard);
        desktopBuilder.setMotherBoard(motherBoard);
        desktopBuilder.setCpu(cpu);
        desktopBuilder.setRam(ram);
        desktopBuilder.setFirm(firm);
        return desktopBuilder.getDesktop();
    }

    @Override
    public void print(List<Desktop> list) {
        for (Desktop item:list) {
            System.out.println(item);
        }
    }
}
