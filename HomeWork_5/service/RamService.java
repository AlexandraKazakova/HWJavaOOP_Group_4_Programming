package HW.HomeWork_5.service;

import HW.HomeWork_5.desktopComponents.Desktop;
import HW.HomeWork_5.desktopComponents.Ram;

import java.util.ArrayList;
import java.util.List;

public class RamService implements Sortable<Desktop, Ram>{
    @Override
    public List<Desktop> find(List<Desktop> list, Ram ram) {
        List<Desktop> newList = new ArrayList<>();
        for (Desktop item:list) {
            if(item.getRam().equals(ram)){
                newList.add(item);
            }
        }
        return newList;
    }
}
