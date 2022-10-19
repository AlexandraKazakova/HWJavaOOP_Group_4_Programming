package HW.HomeWork_3.src;
public class Human {

	private String name;
	private String surname;
	private int age;
	private Gender gender;

	public Human(String name, String surname, int age, Gender gender){
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}

	public String getName(){
		return name;
	}

	public String getSurname(){
		return surname;
	}

	public int getAge(){
		return age;
	}

	@Override
	public String toString(){
		return surname + "," + name + "," + age + "," + gender;
	}
}
