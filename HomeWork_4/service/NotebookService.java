package HW.HomeWork_4.service;

import HW.HomeWork_4.ComputerComparator;
import HW.HomeWork_4.data.NoteBook;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class NotebookService implements Sortable<NoteBook>, Printable<NoteBook> {

    @Override
    public List<NoteBook> sort(List<NoteBook> list) {
        Collections.sort(list, new ComputerComparator());
        return list;
    }
    @Override
    public void print(List<NoteBook> list){
        Logger l = Logger.getAnonymousLogger();
        l.info("Notebooks " + list);
    }
}
