package HW.HomeWork_4.service;

import HW.HomeWork_4.ComputerComparator;
import HW.HomeWork_4.data.PC;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class PCService implements Printable<PC>, Sortable<PC> {

    @Override
    public List<PC> sort(List<PC> list) {
        Collections.sort(list, new ComputerComparator());
        return list;
    }

    @Override
    public void print(List<PC> list) {
        Logger l = Logger.getAnonymousLogger();
        l.info("PC's " + list);
    }
}
