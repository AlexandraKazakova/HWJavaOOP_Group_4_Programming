package HW.HomeWork_4.service;

import HW.HomeWork_4.data.Computer;

import java.util.List;

public interface Printable<E extends Computer>{
    void print(List<E> list);
}
