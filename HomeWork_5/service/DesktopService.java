package HW.HomeWork_5.service;

import HW.HomeWork_5.desktopComponents.Desktop;

import java.util.ArrayList;
import java.util.List;

public class DesktopService implements Sortable<Desktop, Desktop>{
    @Override
    public List<Desktop> find(List<Desktop> list, Desktop desktop) {
        List<Desktop> newList = new ArrayList<>();
        for (Desktop item:list) {
            if(item.getFirm().equals(desktop)){
                newList.add(item);
            }
        }
        return newList;
    }
}
