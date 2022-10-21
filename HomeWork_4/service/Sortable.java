package HW.HomeWork_4.service;

import HW.HomeWork_4.data.Computer;

import java.util.List;

public interface Sortable<T extends Computer> {
    List<T> sort(List<T> list); //реализуется только наследниками класса компьютер
}
