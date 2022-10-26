package HW.HomeWork_4;

import HW.HomeWork_4.controller.NotebookController;
import HW.HomeWork_4.controller.PCController;
import HW.HomeWork_4.controller.TabletController;
import HW.HomeWork_4.data.NoteBook;
import HW.HomeWork_4.data.PC;
import HW.HomeWork_4.data.Tablet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<NoteBook> notebookList = new ArrayList<>();
        ArrayList<PC> pcList = new ArrayList<>();
        ArrayList<Tablet> tabletList = new ArrayList<>();

        NoteBook n1 = new NoteBook("14", "Air", Memory.One, "256", 10000);
        NoteBook n2 = new NoteBook("2", "MagicBook", Memory.Sixteen, "512", 14000);

        notebookList.add(n1);
        notebookList.add(n2);

        PC p1, p2, p3;

        pcList.add(p1 = new PC("10", "Aser", Memory.Four, "512", 1));
        pcList.add(p2 = new PC("9", "Asus", Memory.Two, "256", 4));
        pcList.add(p3 = new PC("4", "Lenovo", Memory.Sixteen, "512", 32));


        Tablet t1,t2,t3;

        tabletList.add(t1 = new Tablet("15", "Apple", Memory.One, "256", 14.6));
        tabletList.add(t2 = new Tablet("3", "Aser", Memory.Two, "512", 15.5));
        tabletList.add(t3 = new Tablet("5", "Asus", Memory.One, "256", 15.0));

        NotebookController notebookController = new NotebookController();
        PCController pcController = new PCController();
        TabletController tabletController = new TabletController();

        System.out.println(notebookController.getSortedNotebookById(notebookList));
        System.out.println(pcController.getSortedPCById(pcList));
        System.out.println(tabletController.getSortedTabletById(tabletList));
        System.out.println(notebookController.getSortedBySsd(notebookList));


        notebookController.notebookPrint(notebookList);

        pcController.pcPrint(pcList);

        tabletController.tabletPrint(tabletList);
    }
}
