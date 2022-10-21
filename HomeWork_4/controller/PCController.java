package HW.HomeWork_4.controller;

import HW.HomeWork_4.data.PC;
import HW.HomeWork_4.service.PCService;

import java.util.ArrayList;
import java.util.List;

public class PCController {
    private PCService pcService;

    public PCController(){
        this.pcService = new PCService();
    }

    public List<PC> getSortedPCById(ArrayList<PC> list){
        return  pcService.sort(list);
    }
    public void pcPrint(ArrayList<PC> list){
        pcService.print(list);
    }
}
