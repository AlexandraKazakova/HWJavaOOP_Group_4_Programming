package HW.HomeWork_5.service;

import HW.HomeWork_5.desktopComponents.Desktop;
import HW.HomeWork_5.desktopComponents.MotherBoard;

import java.util.ArrayList;
import java.util.List;

public class MotherBoardService implements Sortable<Desktop, MotherBoard>{


    @Override
    public List<Desktop> find(List<Desktop> list, MotherBoard motherBoard) {
        List<Desktop> newList = new ArrayList<>();
        for (Desktop item:list) {
            if(item.getMotherBoard().equals(motherBoard)){
                newList.add(item);
            }
        }
        return newList;
    }
}
