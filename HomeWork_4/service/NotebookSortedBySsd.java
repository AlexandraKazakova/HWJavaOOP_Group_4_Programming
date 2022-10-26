package HW.HomeWork_4.service;

import HW.HomeWork_4.ComputerComparatorSsd;
import HW.HomeWork_4.data.NoteBook;

import java.util.Collections;
import java.util.List;

public class NotebookSortedBySsd implements Sortable<NoteBook> {

    @Override
    public List<NoteBook> sort(List<NoteBook> list){
        Collections.sort(list,new ComputerComparatorSsd());
        return list;
    }
}
