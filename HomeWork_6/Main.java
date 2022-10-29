package HW.HomeWork_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой кофе выбираете?\n" +
                "1 - Чёрный кофе\n" +
                "2 - Кофе с молоком\n" +
                "3 - Капучино\n" +
                "4 - Латте\n" +
                "5 - Эспрессо\n");
        int userChoice = sc.nextInt();
        CoffeeMachine cm = new CoffeeMachine(userChoice);
        System.out.println(cm);
    }
}
