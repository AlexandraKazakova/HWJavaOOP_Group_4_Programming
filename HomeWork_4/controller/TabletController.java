package HW.HomeWork_4.controller;

import HW.HomeWork_4.data.Tablet;
import HW.HomeWork_4.service.TabletService;

import java.util.ArrayList;
import java.util.List;

public class TabletController {
    private TabletService tabletService;

    public TabletController(){
        this.tabletService = new TabletService();
    }

    public List<Tablet> getSortedTabletById(ArrayList<Tablet> list){
        return  tabletService.sort(list);
    }

    public void tabletPrint (ArrayList<Tablet> list){
        tabletService.print(list);
    }
}
