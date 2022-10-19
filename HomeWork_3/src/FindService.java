package HW.HomeWork_3.src;

import java.util.ArrayList;
import java.util.List;

public class FindService {

    public List<Human> humanFindService(List<Human> people, String surname, String name){
        List<Human> newList = new ArrayList<>();
        for (Human human:people) {
            if(human.getSurname().equals(surname) && human.getName().equals(name)){
                newList.add(human);
            }
        }
        return newList;
    }

    public List<Relative> relativeFindService(List<Relative> relatives, String surname, String name){
        List<Relative> newList = new ArrayList<>();
        for (Relative human:relatives) {
            if(human.getHumanSurname().equals(surname) && human.getHumanName().equals(name)){
                newList.add(human);
            }
        }
        return newList;
    }
}
