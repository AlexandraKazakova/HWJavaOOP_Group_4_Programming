package HW.HomeWork_5.service;

import HW.HomeWork_5.desktopComponents.Cpu;
import HW.HomeWork_5.desktopComponents.Desktop;

import java.util.ArrayList;
import java.util.List;

public class CpuService implements Sortable<Desktop, Cpu>{

    @Override
    public List<Desktop> find(List<Desktop> list, Cpu cpu) {
        List<Desktop> newList = new ArrayList<>();
        for (Desktop item : list) {
            if (item.getCpu().equals(cpu)) {
                newList.add(item);
            }
        }
        return newList;
    }

}

