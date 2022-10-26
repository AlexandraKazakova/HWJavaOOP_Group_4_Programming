package HW.HomeWork_5.service;

import HW.HomeWork_5.builder.DesktopController;
import HW.HomeWork_5.desktopComponents.*;

import java.util.ArrayList;
import java.util.List;

public class Loader {

    public List<Desktop> dataLoader()
    {
        List<Cpu> cpuList = new ArrayList<>();
        List<Ram> ramList = new ArrayList<>();
        List<MotherBoard> motherBoardList = new ArrayList<>();
        List<Ssd> ssdList = new ArrayList<>();
        List<VideoCard> videoCardList = new ArrayList<>();
        List<String> firmList = new ArrayList<>();

        DesktopController dtc = new DesktopController();

        cpuList.add(new Cpu("Intel"));
        cpuList.add(new Cpu("AMD"));
        cpuList.add(new Cpu("IBM"));
        cpuList.add(new Cpu("NVIDIA"));
        cpuList.add(new Cpu("Intel"));

        ramList.add(new Ram(4));
        ramList.add(new Ram(8));
        ramList.add(new Ram(16));
        ramList.add(new Ram(32));
        ramList.add(new Ram(64));

        motherBoardList.add(new MotherBoard("GIGABYTE"));
        motherBoardList.add(new MotherBoard("Intel"));
        motherBoardList.add(new MotherBoard("MSI"));
        motherBoardList.add(new MotherBoard("AMD"));
        motherBoardList.add(new MotherBoard("Asus"));

        ssdList.add(new Ssd(256));
        ssdList.add(new Ssd(512));
        ssdList.add(new Ssd(1024));
        ssdList.add(new Ssd(2048));
        ssdList.add(new Ssd(2048));

        videoCardList.add(new VideoCard("Nvidia"));
        videoCardList.add(new VideoCard("AMD"));
        videoCardList.add(new VideoCard("Gigabyte"));
        videoCardList.add(new VideoCard("MSI"));
        videoCardList.add(new VideoCard("Sapphire"));

        firmList.add("Asus");
        firmList.add("Aser");
        firmList.add("Lenovo");
        firmList.add("Apple");
        firmList.add("Apple");

        List<Desktop> desktopList = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            desktopList.add((dtc.buildDesktop(firmList.get(i), cpuList.get(i), motherBoardList.get(i),
                    ssdList.get(i), ramList.get(i), videoCardList.get(i))));
        }

        return desktopList;
    }
}
