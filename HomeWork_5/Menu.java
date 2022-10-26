package HW.HomeWork_5;

import HW.HomeWork_5.builder.DesktopController;
import HW.HomeWork_5.desktopComponents.*;
import HW.HomeWork_5.service.Loader;

import java.util.List;
import java.util.Scanner;

public class Menu{
    Loader loader = new Loader();
    DesktopController controller = new DesktopController();
    Scanner sc = new Scanner(System.in);
    public void menu() {
        DesktopController controller = new DesktopController();
        List<Desktop> list = loader.dataLoader();

        System.out.println("Выберите действие: \n" +
                "1 - Показать список компьютеров \n" +
                "2 - Сортировать компьютеры по выбранному критерию \n");

        int userChoice1 = sc.nextInt();

        switch (userChoice1) {
            case 1:
                controller.print(list);
                break;
            case 2:
                selection();
                break;
            default:
                menu();
        }
    }

    public void selection() {
        System.out.println("По какому критерию выбираем: \n" +
                "1 - фирма компьютера\n" +
                "2 - фирма материнской платы\n" +
                "3 - фирма процессора\n" +
                "4 - объем жесткого диска\n" +
                "5 - объем оперативной памяти\n");

        int userChoice2 = sc.nextInt();

        switch (userChoice2) {
            case 1:
                firmDesktopSelection();
                break;
            case 2:
                firmMotherBoardSelection();
                break;
            case 3:
                firmCpuSelection();
                break;
            case 4:
                capacitySsdSelection();
                break;
            case 5:
                capacityRamSelection();
                break;
            default:
                selection();
        }
    }
    public void firmDesktopSelection () {
        List<Desktop> list = loader.dataLoader();
        System.out.println("Введите фирму производителя компьютера: ");
        String firm = sc.next();
        List<Desktop> filter = controller.findByDesktopFirm(list,new Desktop(firm));
        if(filter.isEmpty()) {
            System.out.println("Нет компьютеров по вашему запросу");
        }
        else controller.print(filter);
    }

    public void firmCpuSelection () {
        List<Desktop> list = loader.dataLoader();
        System.out.println("Введите фирму производителя процессора: ");
        String firm = sc.next();
        List<Desktop> filter = controller.findByCpuFirm(list, new Cpu(firm));
        if(filter.isEmpty()) {
            System.out.println("Нет компьютеров по вашему запросу");
        }
        else controller.print(filter);
    }

    public void capacityRamSelection () {
        List<Desktop> list = loader.dataLoader();
        System.out.println("Введите фирму объем оперативной памяти: ");
        int capacity = sc.nextInt();
        List<Desktop> filter = controller.findByRamCapasity(list, new Ram(capacity));
        if(filter.isEmpty()) {
            System.out.println("Нет компьютеров по вашему запросу");
        }
        else controller.print(filter);
    }

    public void firmMotherBoardSelection () {
        List<Desktop> list = loader.dataLoader();
        System.out.println("Введите фирму производителя материнской платы: ");
        String firm = sc.next();
        List<Desktop> filter = controller.findByMotherBoardFirm(list, new MotherBoard(firm));
        if(filter.isEmpty()) {
            System.out.println("Нет компьютеров по вашему запросу");
        }
        else controller.print(filter);
    }


    public void capacitySsdSelection () {
        List<Desktop> list = loader.dataLoader();
        System.out.println("Введите фирму объем жесткого диска: ");
        int capacity = sc.nextInt();
        List<Desktop> filter = controller.findBySsdCapasity(list, new Ssd(capacity));
        if(filter.isEmpty()) {
            System.out.println("Нет компьютеров по вашему запросу");
        }
        else controller.print(filter);
    }

    public void firmVideoCardSelection () {
        List<Desktop> list = loader.dataLoader();
        System.out.println("Введите фирму производителя видеокарты: ");
        String firm = sc.next();
        List<Desktop> filter = controller.findByVideoCardFirm(list, new VideoCard(firm));
        if(filter.isEmpty()) {
            System.out.println("Нет компьютеров по вашему запросу");
        }
        else controller.print(filter);
    }
}
