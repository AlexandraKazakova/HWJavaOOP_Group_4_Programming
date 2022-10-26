package HW.HomeWork_5.service;

import HW.HomeWork_5.desktopComponents.Desktop;
import HW.HomeWork_5.desktopComponents.VideoCard;

import java.util.ArrayList;
import java.util.List;

public class VideoCardService implements Sortable<Desktop, VideoCard>{

    @Override
    public List<Desktop> find(List<Desktop> list, VideoCard videoCard) {
        List<Desktop> newList = new ArrayList<>();
        for (Desktop item:list) {
            if(item.getVideoCard().equals(videoCard)){
                newList.add(item);
            }
        }
        return newList;
    }
}
