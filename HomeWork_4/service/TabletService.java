package HW.HomeWork_4.service;

import HW.HomeWork_4.ComputerComparator;
import HW.HomeWork_4.data.Tablet;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class TabletService implements Sortable<Tablet>, Printable<Tablet> {
    @Override
    public List<Tablet> sort(List<Tablet> list) {
        Collections.sort(list, new ComputerComparator());
        return list;
    }
    @Override
    public void print(List<Tablet> list){
        Logger l = Logger.getAnonymousLogger();
        l.info("Tablets " + list);
    }
}
