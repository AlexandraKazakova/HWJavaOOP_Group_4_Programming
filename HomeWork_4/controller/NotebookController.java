package HW.HomeWork_4.controller;

import HW.HomeWork_4.data.NoteBook;
import HW.HomeWork_4.service.NotebookService;
import HW.HomeWork_4.service.NotebookSortedBySsd;


import java.util.ArrayList;
import java.util.List;

public class NotebookController {
    private NotebookService notebookService;
    private NotebookSortedBySsd notebookSortedBySsd;

    public NotebookController(){
        this.notebookService = new NotebookService();
        this.notebookSortedBySsd = new NotebookSortedBySsd();
    }

    public List<NoteBook> getSortedNotebookById(ArrayList<NoteBook> list){
        return  notebookService.sort(list);
    }
    public void notebookPrint(ArrayList<NoteBook> list){
        notebookService.print(list);
    }

    public List<NoteBook> getSortedBySsd(List<NoteBook> list){
        return notebookSortedBySsd.sort(list);
    }
}
