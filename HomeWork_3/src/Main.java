package HW.HomeWork_3.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static HW.HomeWork_3.src.Gender.Female;
import static HW.HomeWork_3.src.Gender.Male;

public class Main {
	public static void main(String[] args) {
		
		List<Human> people = new ArrayList<>();
		List<Relative> relationship = new ArrayList<>();

		Human h1, h2, h3, h4, h5, h6, h7, h8, h9;

		people.add(h1 = new Human("Anna", "Ivanova", 30, Female));
		people.add(h2 = new Human("Sergei", "Ivanov", 35, Male));
		people.add(h3 = new Human("Ivan", "Ivanov", 4, Male));
		people.add(h4 = new Human("Vera", "Sidorova", 22, Female));
		people.add(h5 = new Human("Elena", "Sidorova", 54, Female));
		people.add(h6 = new Human("Oleg", "Smirnov", 46, Male));
		people.add(h7 = new Human("Masha", "Smirnova", 48, Female));
		people.add(h8 = new Human("Inna", "Sidorova", 70, Female));
		people.add(h9 = new Human("Pavel", "Sidorov", 72, Male));

		relationship.add(new Relative(h1, h2, Relation.Spouse));
		relationship.add(new Relative(h1, h3, Relation.Child));
		relationship.add(new Relative(h2, h3, Relation.Child));
		relationship.add(new Relative(h3, h1, Relation.Parent));
		relationship.add(new Relative(h2, h1, Relation.Parent));
		relationship.add(new Relative(h5, h4, Relation.Child));
		relationship.add(new Relative(h4, h5, Relation.Parent));
		relationship.add(new Relative(h6, h7, Relation.Spouse));
		relationship.add(new Relative(h7, h6, Relation.Spouse));
		relationship.add(new Relative(h8, h9, Relation.Spouse));
		relationship.add(new Relative(h9, h8, Relation.Spouse));
		relationship.add(new Relative(h8, h5, Relation.Child));
		relationship.add(new Relative(h9, h5, Relation.Child));
		relationship.add(new Relative(h5, h8, Relation.Parent));
		relationship.add(new Relative(h5, h9, Relation.Parent));
		relationship.add(new Relative(h4, h9, Relation.Granny));
		relationship.add(new Relative(h4, h8, Relation.Granny));
		relationship.add(new Relative(h5, h7, Relation.Cousin));
		relationship.add(new Relative(h8, h4, Relation.Grandchild));
		relationship.add(new Relative(h9, h4, Relation.Grandchild));

		Scanner sc = new Scanner(System.in);
		System.out.print("Input surname -> ");
		String userAnswerSurname = sc.nextLine();
		System.out.print("Input name -> ");
		String userAnswerName = sc.nextLine();
		sc.close();

		HumanRelativeController controller = new HumanRelativeController();

		System.out.println(controller.getInformationAboutHuman(people,userAnswerSurname, userAnswerName));
		System.out.println(controller.getInformationAboutRelative(relationship,userAnswerSurname, userAnswerName));
	}
}
