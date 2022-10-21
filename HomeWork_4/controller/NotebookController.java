package HW.HomeWork_4.controller;

import HW.HomeWork_4.data.NoteBook;
import HW.HomeWork_4.service.NotebookService;

import java.util.ArrayList;
import java.util.List;

public class NotebookController {
    private NotebookService notebookService;

    public NotebookController(){
        this.notebookService = new NotebookService();
    }

    public List<NoteBook> getSortedNotebookById(ArrayList<NoteBook> list){
        return  notebookService.sort(list);
    }
    public void notebookPrint(ArrayList<NoteBook> list){
        notebookService.print(list);
    }
}
