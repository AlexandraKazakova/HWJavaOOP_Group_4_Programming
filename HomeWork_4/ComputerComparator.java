package HW.HomeWork_4;

import HW.HomeWork_4.data.Computer;

import java.util.Comparator;

public class ComputerComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o, Computer o2) {
        if (Integer.valueOf(o.getId()) > Integer.valueOf(o2.getId())) {
            return 1;
        }
        if (Integer.valueOf(o.getId()) < Integer.valueOf(o2.getId())) {
            return -1;
        } else {
            return 0;
        }
    }
}