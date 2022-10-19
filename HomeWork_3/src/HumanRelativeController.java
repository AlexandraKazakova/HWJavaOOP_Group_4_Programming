package HW.HomeWork_3.src;

import java.util.List;

public class HumanRelativeController {

    private FindService findService;

    public HumanRelativeController(){
        this.findService = new FindService();
    }

    public List<Human> getInformationAboutHuman(List<Human> people, String surname, String name){
        return findService.humanFindService(people, surname, name);

    }
    public List<Relative> getInformationAboutRelative(List<Relative> relatives, String surname, String name){
        return findService.relativeFindService(relatives, surname, name);

    }
}
