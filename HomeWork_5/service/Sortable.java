package HW.HomeWork_5.service;

import java.util.List;

public interface Sortable <E, T> {
    public List<E> find(List<E> list, T item);
}
