package HW.HomeWork_5.service;

import HW.HomeWork_5.desktopComponents.Desktop;
import HW.HomeWork_5.desktopComponents.Ssd;

import java.util.ArrayList;
import java.util.List;

public class SsdService implements Sortable<Desktop, Ssd>{
    @Override
    public List<Desktop> find(List<Desktop> list, Ssd ssd) {
        List<Desktop> newList = new ArrayList<>();
        for (Desktop item:list) {
            if(item.getSsd().equals(ssd)){
                newList.add(item);
            }
        }
        return newList;
    }
}
