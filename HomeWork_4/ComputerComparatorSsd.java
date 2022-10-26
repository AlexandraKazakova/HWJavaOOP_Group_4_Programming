package HW.HomeWork_4;

import HW.HomeWork_4.data.Computer;

import java.util.Comparator;

public class ComputerComparatorSsd implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2){
        if(Integer.valueOf(o1.getSsd()) > Integer.valueOf(o2.getSsd())){
            return 1;
        }
        if(Integer.valueOf(o1.getSsd()) < Integer.valueOf(o2.getSsd())){
            return -1;
        }
        return 0;
    }
}
